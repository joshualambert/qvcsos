//   Copyright 2004-2014 Jim Voris
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//
// $FilePath$
//     $Date: Wednesday, March 21, 2012 10:31:03 PM $
//   $Header: BranchTypeDAOImplTest.java Revision:1.3 Wednesday, March 21, 2012 10:31:03 PM JimVoris $
// $Copyright � 2011-2012 Define this string in the qvcs.keywords.properties property file $

package com.qumasoft.server.dataaccess.impl;

import com.qumasoft.TestHelper;
import com.qumasoft.server.DatabaseManager;
import com.qumasoft.server.datamodel.BranchType;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Branch Type DAO implementation unit test.
 *
 * @author $Author: JimVoris $
 */
public class BranchTypeDAOImplTest {

    private static final String DERBY_TEST_DIRECTORY = "/temp/qvcse/branchTypeDAOImplTest";

    /**
     * Execute this stuff once when the class is loaded.
     *
     * @throws Exception if we have a problem with initialization.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        TestHelper.emptyDerbyTestDirectory(DERBY_TEST_DIRECTORY);
        DatabaseManager.getInstance().setDerbyHomeDirectory(DERBY_TEST_DIRECTORY);
        DatabaseManager.getInstance().initializeDatabase();
    }

    /**
     * Execute this just once after we complete all the tests defined in this class.
     *
     * @throws Exception if we have a problem tearing things down.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
        DatabaseManager.getInstance().shutdownDatabase();
    }

    /**
     * Set up the things common to all the tests.
     */
    @Before
    public void setUp() {
    }

    /**
     * We tear this down after each test.
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of findById method, of class BranchTypeDAOImpl.
     */
    @Test
    public void testFindById() {
        BranchTypeDAOImpl instance = new BranchTypeDAOImpl();
        BranchType result = instance.findById(1);
        assertNotNull("Branch type 1 not found.", result);
        assertNotNull("Empty branch type name", result.getBranchTypeName());
    }

    /**
     * Test of findAll method, of class BranchTypeDAOImpl.
     */
    @Test
    public void testFindAll() {
        BranchTypeDAOImpl instance = new BranchTypeDAOImpl();
        List<BranchType> result = instance.findAll();
        assertTrue("Empty branch type list", result.size() == 4);
    }
}
