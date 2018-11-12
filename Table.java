package com.pennyana.bilbo1;


import java.util.ArrayList;

public class Table {
    int currentNumPlayers;
    ArrayList<User> players;
    String gameDescription;
    int numPlayersPossible;

    public int getNumPlayersPossible() {
        return numPlayersPossible;
    }

    public void setNumPlayersPossible() {
        return;
    }

    public ArrayList<User> getPlayers() {
        return players;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public void addPlayer(User newPlayer) {
        return;
    }

    public void removePlayer(User player) {
        return;
    }
}
