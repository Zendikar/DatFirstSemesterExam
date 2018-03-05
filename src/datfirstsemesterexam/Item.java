/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datfirstsemesterexam;

import impl.MyDate;

/**
 *
 * @author Tobias Mouer
 */
public interface Item {
    public String getName();
    public int getPowerLvl();
    public MyDate getTimeAquired();
}
