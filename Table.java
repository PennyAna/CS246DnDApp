package com.pennyana.bilbo1;

import java.util.List;

public class Table {
    int currentNumPlayers;
    List<Users> players;
    String gameDescription;
    int numPlayersPossible;

    public int getNumPlayersPossible() {
        return numPlayersPossible;
    }

    public void setNumPlayersPossible() {
        return;
    }

    public List<Users> getPlayers() {
        return players;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public void addPlayer(Users newPlayer) {
        return;
    }

    public void removePlayer(Users player) {
        return;
    }
}
