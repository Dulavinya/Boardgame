/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boardgame;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import java.util.List;

public class Dice {
    private List<Die> dice;

    public Dice() {
        dice = new ArrayList<>();
    }

    public void addDie(Die d) {
        dice.add(d);
    }

    public Die dieAt(int idx) {
        if (idx >= 0 && idx < dice.size()) {
            return dice.get(idx);
        }
        throw new IndexOutOfBoundsException("Invalid die index");
    }

    public int roll() {
        int total = 0;
        for (Die die : dice) {
            total += die.roll();
        }
        return total;
    }

    public int getTotalValue() {
        int total = 0;
        for (Die die : dice) {
            total += die.getLastRoll();
        }
        return total;
    }

    public boolean allSame() {
        if (dice.isEmpty()) return false;
        
        int firstValue = dice.get(0).getLastRoll();
        for (Die die : dice) {
            if (die.getLastRoll() != firstValue) {
                return false;
            }
        }
        return true;
    }
}
