/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import datfirstsemesterexam.ItemWeapon;

/**
 *
 * @author Tobias Mouer
 */
public class ItemWeaponImpl extends ItemImpl implements ItemWeapon{

    private final double dps;

    public ItemWeaponImpl(String name, int powerLvl, MyDate timeAquired, double dps) {
        super(name, powerLvl, timeAquired);
        this.dps = dps;
    }

    public double getDps() {
        return dps;
    }
    
}
