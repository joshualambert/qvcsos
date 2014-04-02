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
package com.qumasoft.guitools.qwin.filefilter;

import com.qumasoft.qvcslib.Extension;
import com.qumasoft.qvcslib.MergedInfoInterface;
import com.qumasoft.qvcslib.QVCSConstants;
import com.qumasoft.qvcslib.RevisionHeader;
import java.util.TreeMap;

/**
 * File extension filter.
 * @author Jim Voris
 */
public class FileFilterExtensionFilter extends AbstractFileFilter {
    private static final long serialVersionUID = -5250477178452562411L;

    private final Extension filterExtension;

    FileFilterExtensionFilter(String extension, boolean isANDFilter) {
        super(isANDFilter);
        filterExtension = new Extension(extension);
    }

    @Override
    public boolean passesFilter(MergedInfoInterface mergedInfo, TreeMap<Integer, RevisionHeader> revisionHeaderMap) {
        boolean retVal = false;
        String extension = filterExtension.getExtension();
        String shortWorkfileName = mergedInfo.getShortWorkfileName();
        if (mergedInfo.getProjectProperties().getIgnoreCaseFlag()) {
            extension = extension.toLowerCase();
            shortWorkfileName = shortWorkfileName.toLowerCase();
        }
        if (shortWorkfileName.endsWith(extension)) {
            retVal = true;
        }
        return retVal;
    }

    @Override
    public String getFilterType() {
        return QVCSConstants.EXTENSION_FILTER;
    }

    @Override
    public String toString() {
        return QVCSConstants.EXTENSION_FILTER;
    }

    @Override
    public String getFilterData() {
        return filterExtension.getExtension();
    }

    @Override
    public boolean equals(Object o) {
        boolean retVal = false;
        if (o instanceof FileFilterExtensionFilter) {
            FileFilterExtensionFilter filter = (FileFilterExtensionFilter) o;
            if (filter.getFilterData().equals(getFilterData()) && (filter.getIsANDFilter() == this.getIsANDFilter())) {
                retVal = true;
            }
        }
        return retVal;
    }

    @Override
    public int hashCode() {
        return computeHash(this.filterExtension.getExtension(), this.getIsANDFilter());
    }

    @Override
    public String getRawFilterData() {
        return filterExtension.getExtension();
    }
}
