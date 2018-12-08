package com.alex.j.cs246dd;


import android.util.Log;

import java.util.ArrayList;

public class Table {
    int currentNumPlayers;
    private ArrayList<SignedUpUser> players;
    private String gameDescription;
    private int numPlayersPossible;

    public int getNumPlayersPossible() {
        return numPlayersPossible;
    }

    public void setNumPlayersPossible(int newNum) {
        numPlayersPossible = newNum;
    }

    public ArrayList<SignedUpUser> getPlayers() {
        return players;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public void addPlayer(SignedUpUser newPlayer) {
        if (players.size() > 4)
            Log.v("Table", "too many players");
        else {
            players.add(newPlayer);
        }
    }

    public void removePlayer(User player) {
        if (players.contains(player))
        {
            players.remove(player);
        }
        else
        {
            Log.v("table", "player not in list");
        }
    }
}
