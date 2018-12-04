package com.pennyana.dnd;
import java.util.ArrayList;

public class GameNight {

    //VARIABLES
    private ArrayList<Table> tables;
    private String houseRules;
    private String date;


    //FUNCTIONS
    public void setTables(ArrayList<Table> newTables){ tables = newTables;}
    public ArrayList<Table> getTables(){ return tables; }

    public Table getTable(int index){ return tables.get(index); }

    public void addTable(Table newTable){ tables.add(newTable); }

    public String getHouseRules(){ return houseRules;}
    public void setHouseRules(String rules){ houseRules = rules; }

    public String getDate() { return date;}
    public void setDate(String newDate) { date = newDate; }

    public void replaceTable(int index, Table editedTable){
        tables.set(index, editedTable);

    }

}
