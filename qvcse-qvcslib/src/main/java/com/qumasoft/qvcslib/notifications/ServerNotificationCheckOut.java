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
package com.qumasoft.qvcslib.notifications;

import com.qumasoft.qvcslib.SkinnyLogfileInfo;

/**
 * Checkout notification.
 * @author Jim Voris
 */
public class ServerNotificationCheckOut implements ServerNotificationInterface {
    private static final long serialVersionUID = -7704537877897526621L;

    // These are serialized:
    private String clientWorkfileName = null;
    private String shortWorkfileName = null;
    private String appendedPath = null;
    private String projectName = null;
    private String viewName = null;
    private String serverName = null;
    private String revisionString = null;
    private SkinnyLogfileInfo skinnyLogfileInfo;

    /**
     * Creates a new instance of ServerNotificationCheckOut.
     */
    public ServerNotificationCheckOut() {
    }

    /**
     * Get the client workfile name.
     * @return the client workfile name.
     */
    public String getClientWorkfileName() {
        return clientWorkfileName;
    }

    /**
     * Set the client workfile name.
     * @param workfileName the client workfile name.
     */
    public void setClientWorkfileName(String workfileName) {
        clientWorkfileName = workfileName;
    }

    /**
     * Get the short workfile name.
     * @return the short workfile name.
     */
    public String getShortWorkfileName() {
        return shortWorkfileName;
    }

    /**
     * Set the short workfile name.
     * @param shortName the short workfile name.
     */
    public void setShortWorkfileName(String shortName) {
        shortWorkfileName = shortName;
    }

    /**
     * Get the appended path.
     * @return the appended path.
     */
    public String getAppendedPath() {
        return appendedPath;
    }

    /**
     * Set the appended path.
     * @param path the appended path.
     */
    public void setAppendedPath(String path) {
        appendedPath = path;
    }

    /**
     * Get the project name.
     * @return the project name.
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Set the project name.
     * @param project the project name.
     */
    public void setProjectName(String project) {
        projectName = project;
    }

    /**
     * Get the view name.
     * @return the view name.
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * Set the view name.
     * @param view the view name.
     */
    public void setViewName(final String view) {
        viewName = view;
    }

    /**
     * Get the revision string.
     * @return the revision string.
     */
    public String getRevisionString() {
        return revisionString;
    }

    /**
     * Set the revision string.
     * @param revString the revision string.
     */
    public void setRevisionString(String revString) {
        revisionString = revString;
    }

    /**
     * Get the skinny logfile info.
     * @return the skinny logfile info.
     */
    public SkinnyLogfileInfo getSkinnyLogfileInfo() {
        return skinnyLogfileInfo;
    }

    /**
     * Set the skinny logfile info.
     * @param skinnyInfo the skinny logfile info.
     */
    public void setSkinnyLogfileInfo(SkinnyLogfileInfo skinnyInfo) {
        skinnyLogfileInfo = skinnyInfo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getServerName() {
        return serverName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setServerName(String server) {
        serverName = server;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SR_NOTIFY_CHECKOUT;
    }
}
