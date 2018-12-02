package com.alex.j.cs246dd;

/**
 * A class which stores the basic information about a D&D character
 * including the character's name, level, class, and race.
 *
 * @author Alex, Claire, Nicole
 */
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