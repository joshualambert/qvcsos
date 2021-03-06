/*   Copyright 2004-2015 Jim Voris
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.qumasoft.server.clientrequest;

import com.qumasoft.qvcslib.ServerResponseFactoryInterface;
import com.qumasoft.qvcslib.requestdata.ClientRequestUpdateClientData;
import com.qumasoft.qvcslib.response.ServerResponseInterface;
import com.qumasoft.qvcslib.response.ServerResponseUpdateClient;
import java.io.IOException;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client request update client.
 * @author Jim Voris
 */
public class ClientRequestUpdateClient implements ClientRequestInterface {
    // Create our logger object
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientRequestUpdateClient.class);
    private final ClientRequestUpdateClientData request;

    /**
     * Creates a new instance of ClientRequestUpdateClient.
     *
     * @param data command line data, etc.
     */
    public ClientRequestUpdateClient(ClientRequestUpdateClientData data) {
        request = data;
    }

    @Override
    public ServerResponseInterface execute(String userName, ServerResponseFactoryInterface response) {
        ServerResponseUpdateClient serverResponse = null;
        InputStream streamFromJar = null;
        try {
            String resourceName = "/" + request.getRequestedFileName();
            streamFromJar = this.getClass().getResourceAsStream(resourceName);
            if (streamFromJar != null) {
                byte[] buffer = new byte[streamFromJar.available()];

                int bytesRemaining = buffer.length;
                int offset = 0;
                while (bytesRemaining > 0) {
                    int bytesRead = streamFromJar.read(buffer, offset, bytesRemaining);
                    bytesRemaining -= bytesRead;
                    offset += bytesRead;
                }

                serverResponse = new ServerResponseUpdateClient();
                serverResponse.setBuffer(buffer);
                serverResponse.setRequestedFileName(request.getRequestedFileName());
                serverResponse.setRestartFlag(request.getRestartFlag());
            }
        } catch (IOException e) {
            serverResponse = null;
            LOGGER.warn(e.getLocalizedMessage(), e);
        } finally {
            if (streamFromJar != null) {
                try {
                    streamFromJar.close();
                } catch (IOException e) {
                    LOGGER.warn(e.getLocalizedMessage(), e);
                }
            }
        }

        return serverResponse;
    }
}
