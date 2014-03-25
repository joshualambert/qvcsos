/*   Copyright 2004-2014 Jim Voris
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
package com.qumasoft.qvcslib.requestdata;

import com.qumasoft.qvcslib.commandargs.LabelDirectoryCommandArgs;

/**
 * Client request label directory data.
 * @author Jim Voris
 */
public class ClientRequestLabelDirectoryData extends ClientRequestClientData {
    private static final long serialVersionUID = 7246172919975117555L;

    private static final ValidRequestElementType[] VALID_ELEMENTS = {
        ValidRequestElementType.PROJECT_NAME,
        ValidRequestElementType.VIEW_NAME,
        ValidRequestElementType.APPENDED_PATH
    };
    private LabelDirectoryCommandArgs commandArgs;

    /**
     * Creates a new instance of ClientRequestLabelDirectoryData.
     */
    public ClientRequestLabelDirectoryData() {
    }

    /**
     * Get the command arguments.
     * @return the command arguments.
     */
    public LabelDirectoryCommandArgs getCommandArgs() {
        return commandArgs;
    }

    /**
     * Set the command arguments.
     * @param args the command arguments.
     */
    public void setCommandArgs(LabelDirectoryCommandArgs args) {
        this.commandArgs = args;
    }

    @Override
    public RequestOperationType getOperationType() {
        return RequestOperationType.LABEL_DIRECTORY;
    }

    @Override
    public ValidRequestElementType[] getValidElements() {
        return VALID_ELEMENTS;
    }
}
