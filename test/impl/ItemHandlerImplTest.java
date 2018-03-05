/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import datfirstsemesterexam.Item;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tobias Mouer
 */
public class ItemHandlerImplTest {
    
    public ItemHandlerImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readFile method, of class ItemHandlerImpl.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        String filename = "";
        ItemHandlerImpl instance = new ItemHandlerImpl();
        String expResult = "";
        String result = instance.readFile(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class ItemHandlerImpl.
     */
    @Test
    public void testGetItems() throws Exception {
        System.out.println("getItems");
        String data = "";
        ItemHandlerImpl instance = new ItemHandlerImpl();
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = instance.getItems(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class ItemHandlerImpl.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        String name = "";
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        Item expResult = null;
        Item result = instance.getItem(name, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortByName method, of class ItemHandlerImpl.
     */
    @Test
    public void testSortByName() {
        System.out.println("sortByName");
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        instance.sortByName(al);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortByPowerLvl method, of class ItemHandlerImpl.
     */
    @Test
    public void testSortByPowerLvl() {
        System.out.println("sortByPowerLvl");
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        instance.sortByPowerLvl(al);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPowerLevelTooHigh method, of class ItemHandlerImpl.
     */
    @Test
    public void testIsPowerLevelTooHigh() {
        System.out.println("isPowerLevelTooHigh");
        int powerlevel = 0;
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        boolean expResult = false;
        boolean result = instance.isPowerLevelTooHigh(powerlevel, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsWithHighestPowerLvl method, of class ItemHandlerImpl.
     */
    @Test
    public void testGetItemsWithHighestPowerLvl() {
        System.out.println("getItemsWithHighestPowerLvl");
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = instance.getItemsWithHighestPowerLvl(al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAquiredBeforeDate method, of class ItemHandlerImpl.
     */
    @Test
    public void testGetItemsAquiredBeforeDate() {
        System.out.println("getItemsAquiredBeforeDate");
        MyDate date = null;
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = instance.getItemsAquiredBeforeDate(date, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAquiredOnDate method, of class ItemHandlerImpl.
     */
    @Test
    public void testGetItemsAquiredOnDate() {
        System.out.println("getItemsAquiredOnDate");
        MyDate date = null;
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = instance.getItemsAquiredOnDate(date, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsWithPowerLvl method, of class ItemHandlerImpl.
     */
    @Test
    public void testGetItemsWithPowerLvl() {
        System.out.println("getItemsWithPowerLvl");
        int powerLvl = 0;
        ArrayList<Item> al = null;
        ItemHandlerImpl instance = new ItemHandlerImpl();
        ArrayList<Item> expResult = null;
        ArrayList<Item> result = instance.getItemsWithPowerLvl(powerLvl, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
