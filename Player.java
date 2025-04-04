/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boardgame;

/**
 *
 * @author ASUS
 */



public class Player {
    private Tile isOn;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(Dice dice) {
    int roll = dice.roll();
    Tile current = isOn;

    for (int i = 0; i < roll; i++) {
        
        Tile nextTile = current.getNext();  

        if (nextTile != null) {
            current = nextTile; // Move to the next tile
        } else {
            break; // Stop if no next tile exists
        }
    }

    // Update the player's position to the current tile
    isOn = current;
}



    public void placeOn(Tile t) {
        if (isOn != null) {
            isOn.leave(this);
        }
        isOn = t;
        t.land(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
