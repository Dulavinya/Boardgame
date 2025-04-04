/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boardgame;

/**
 *
 * @author ASUS
 */

import java.util.Random;

public class Die {
    private int lastRoll;
    private static final int SIDES = 6;
    private Random random;

    public Die() {
        random = new Random();
        roll();  // Initial roll to set lastRoll
    }

    public int roll() {
        lastRoll = random.nextInt(SIDES) + 1;  // Random number between 1 and 6
        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }
}
