/*
 * Copyright 2014 JimVoris.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qumasoft.server.filehistory;

import java.util.List;

/**
 * Instances of this class hold the meta data associated with a file history -- i.e. it has the header information, and the revision header information, but none of the
 * actual bits of the file whose history is described by the {@link FileHistory} class.
 * @author Jim Voris
 * @since 3.1.0
 */
public class FileHistorySummary {
    private FileHistoryHeader header;
    private List<RevisionHeader> revisionHeaderList;

    /**
     * Default constructor.
     */
    public FileHistorySummary() {
        header = new FileHistoryHeader();
    }

    /**
     * Get the file history header.
     * @return the file history header.
     */
    public FileHistoryHeader getHeader() {
        return this.header;
    }

    /**
     * Set the file history header.
     * @param h the file history header.
     */
    public void setHeader(FileHistoryHeader h) {
        this.header = h;
    }

    /**
     * Get the list of revision headers.
     * @return the list of revision headers.
     */
    public List<RevisionHeader> getRevisionHeaderList() {
        return revisionHeaderList;
    }

    /**
     * Set the list of revision headers.
     * @param l the list of revision headers.
     */
    public void setRevisionHeaderList(List<RevisionHeader> l) {
        this.revisionHeaderList = l;
    }
}
