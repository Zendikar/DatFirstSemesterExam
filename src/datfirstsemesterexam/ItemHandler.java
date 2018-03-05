/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datfirstsemesterexam;

import impl.MyDate;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Tobias Mouer
 */
public interface ItemHandler {

    public String readFile(String filename) throws IOException;    
    public ArrayList<Item> getItems(String data) throws MyException;
    public Item getItem(String name, ArrayList<Item> al);
    public void sortByName(ArrayList<Item> al);
    public void sortByPowerLvl(ArrayList<Item> al);
    public boolean isPowerLevelTooHigh(int powerlevel, ArrayList<Item> al);
    public ArrayList<Item> getItemsWithHighestPowerLvl(ArrayList<Item> al);
    public ArrayList<Item> getItemsAquiredBeforeDate(MyDate date, ArrayList<Item> al);
    public ArrayList<Item> getItemsAquiredOnDate(MyDate date, ArrayList<Item> al);
    public ArrayList<Item> getItemsWithPowerLvl(int powerLvl, ArrayList<Item> al);
    
    
}
