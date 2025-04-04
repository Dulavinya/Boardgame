/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boardgame;

/**
 *
 * @author ASUS
 */




import java.util.LinkedList;

public class Board {
    LinkedList<Tile> tiles = new LinkedList<>();

    public void addTile(Tile t) {
        tiles.add(t);
    }

    public void printBoard() {
        for (Tile tile : tiles) {
            System.out.println(tile);
        }
    }

    public Tile tileAt(int idx) {
        return tiles.get(idx);
    }

    public Tile tileNamed(String name) {
        for (Tile tile : tiles) {
            if (tile.getName().equals(name)) {
                return tile;
            }
        }
        return null;
    }

    
}