/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boardgame;

/**
 *
 * @author ASUS
 */

public class MonopolyGame {
    private static final int NO_OF_TILES = 10;
    Board board;

    public static void main(String[] args) {
        System.out.println("Welcome to Monopoly Game!");
        MonopolyGame game = new MonopolyGame();
        Board board = new Board();
        game.setBoard(board);

        

        Tile t = null;
        for (int i = 0; i < NO_OF_TILES; i++) {
            String tileName = String.valueOf(i + 1);
            if (t == null) {
                t = Tile.createTile(tileName);
                board.addTile(t);
            } else {
                Tile previousTile = t;
                t = Tile.createTile(tileName);
                previousTile.setNext(t);
                board.addTile(t);
            }
        }
        System.out.println("Tiles Created!");
        board.printBoard();

        
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        
        System.out.println("Players Created!");

        Tile firstTile = board.tileAt(0);
        playerA.placeOn(firstTile);
        playerB.placeOn(firstTile);
        
        board.printBoard();
        
        
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}