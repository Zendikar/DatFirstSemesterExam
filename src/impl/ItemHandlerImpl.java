/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import datfirstsemesterexam.Item;
import datfirstsemesterexam.ItemHandler;
import datfirstsemesterexam.MyException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author Tobias Mouer
 */
public class ItemHandlerImpl implements ItemHandler{

    public static final String FILENAME = "Samples.csv";
    @Override
    public String readFile(String filename) throws IOException {
        StringBuilder builder = new StringBuilder();
        String br = System.lineSeparator();
        Stream<String> stream = Files.lines(Paths.get(filename)).skip(1);
        stream.forEach(s -> builder.append(s).append(br));
        return builder.toString();
    }

    @Override
    public ArrayList<Item> getItems(String data) throws MyException {
        ArrayList<Item> samples = new ArrayList<>();
        for(String line : data.split("\n")){
            String[] values = line.split(",");
            String name = values[0].trim();
            String date = values[1].trim();
            int powerlvl = Integer.parseInt(values[2].trim());
            try{
                if(values.length == 4){
                    double dps = Double.parseDouble(values[3].trim());
                    samples.add(new ItemWeaponImpl(name, powerlvl, new MyDate(date), dps));
                } else 
                    samples.add(new ItemImpl(name, powerlvl, new MyDate(date)));
            } catch(IllegalArgumentException e){
                throw new MyException(e.getMessage());
            }
        }
        return samples;
    }

    @Override
    public Item getItem(String name, ArrayList<Item> al) {
        for (Item i: al){   
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    @Override
    public void sortByName(ArrayList<Item> al) {
        Collections.sort(al, Comparator.comparing(Item::getName));
    }

    @Override
    public void sortByPowerLvl(ArrayList<Item> al) {
        Collections.sort(al, Comparator.comparing(Item::getPowerLvl));
    }

    @Override
    public boolean isPowerLevelTooHigh(int powerlevel, ArrayList<Item> al) {
        for (Item i: al){   
            if(i.getPowerLvl() >= (powerlevel)){
                return false;
            }
        }
        return true;    
    }

    @Override
    public ArrayList<Item> getItemsWithHighestPowerLvl(ArrayList<Item> al) {
        ArrayList<Item> result = new ArrayList<>();
        if(al == null || al.isEmpty()) return null;
        if(al.size() == 1) 
        {
            result.add(al.get(0));
            return result;
        }
        
        int maxRise = al.get(1).getPowerLvl()- al.get(0).getPowerLvl();
        result.add(al.get(1));
        Item item;
        for(int i = 2; i < al.size(); i++){
            Item current = al.get(i);
            Item previous = al.get(i-1);
            int rise = current.getPowerLvl()- previous.getPowerLvl();
            if(rise > maxRise) {
                maxRise = rise;
                result.add(current);
            }
        }
        return result;    }

    @Override
    public ArrayList<Item> getItemsAquiredBeforeDate(MyDate date, ArrayList<Item> al) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Item> getItemsAquiredOnDate(MyDate date, ArrayList<Item> al) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Item> getItemsWithPowerLvl(int powerLvl, ArrayList<Item> al) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
