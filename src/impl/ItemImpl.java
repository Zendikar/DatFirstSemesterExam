/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import datfirstsemesterexam.Item;

/**
 *
 * @author Tobias Mouer
 */
public class ItemImpl implements Item{

    private final String name;
    private final int powerLvl;
    private final MyDate timeAquired;

    public ItemImpl(String name, int powerLvl, MyDate timeAquired) {
        this.name = name;
        this.powerLvl = powerLvl;
        this.timeAquired = timeAquired;
    }

    
    public String getName() {
        return name;
    }

    public int getPowerLvl() {
        return powerLvl;
    }

    public MyDate getTimeAquired() {
        return timeAquired;
    }
    
    
    
}
