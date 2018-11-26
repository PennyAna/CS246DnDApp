package com.alex.j.cs246dd;


public class Character {
    String cName;
    String cClass;
    String cRace;
    int level;

    String getcName() {
        return cName;
    }
    void setcName(String newName) {
        cName = newName;
    }
    String getcClass() {
        return cClass;
    }
    void setcClass(String newClass) {
        cClass = newClass;

    }
    String getcRace() {
        return cRace;
    }
    void getcRace(String newRace) {
        cRace = newRace;
    }
    int getLevel() {
        return level;
    }
    void setLevel(int newLevel) {
        level = newLevel;
    }
}