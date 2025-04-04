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

public class Tile {
    // Attributes
    private String Name;
    private Tile next;
    private static int numTiles=0;
    private ArrayList<Player> players;
    private int tileNum;
    
    // Constructors
    private Tile(String name) {
        this.Name = name;
        this.players = new ArrayList<>();
        this.tileNum = ++numTiles;
    }
    
    private Tile(String name, Tile nextTile) {
        this.Name = name;
        this.next = nextTile;
        this.players = new ArrayList<>();
        this.tileNum = ++numTiles;
    }
    
    
    public static Tile createTile() {
        return new Tile("");
    }
    
    public static Tile createTile(String name) {
        return new Tile(name);
    }
    
    public static Tile createTile(String name, Tile nextTile) {
        return new Tile(name, nextTile);
    }
    
    // Methods
    public String getName() {
        return Name;
    }
    
    public Tile getNext() {
        return next;
    }
    
    public int getNumOfTiles() {
        return numTiles;
    }
    
    public int getTileNumber() {
        return tileNum;
    }
    
    public void land(Player p) {
        players.add(p);
    }
    
    public void leave(Player p) {
        players.remove(p);
    }
    
    public void move(Player p, Dice d, int remaining) {
        if (players.contains(p)) {
            leave(p);
        if (remaining > 0 && next != null) {
            
            next.move(p, d, remaining - 1);
            
        }          
            Tile currentTile = this;
            p.placeOn(currentTile);
        }
    }
    
    public void setNext(Tile t) {
        this.next = t;
    }
    
    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
        line.append("Tile No.").append(tileNum).append("- Name:\"").append(Name).append("\" contains players: ");
        
        if (!players.isEmpty()) {
            for (int i = 0; i < players.size(); i++) {
                line.append(players.get(i).getName());
                line.append(",");
            }
        }
        return line.toString();
    }
}