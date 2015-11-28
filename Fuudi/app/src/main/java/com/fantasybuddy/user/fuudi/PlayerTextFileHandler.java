package com.fantasybuddy.user.fuudi;
import org.w3c.dom.Text;

import java.io.*;
import java.util.*;
import android.content.*;

/**
 * Created by William G on 11/28/2015.
 */
public class PlayerTextFileHandler {

    private ArrayList<Object>playerData;
    private ArrayList<ArrayList>playerStatistics;

    private HashMap<Integer, Player> playerIds;
    private ArrayList<Player> playersList;

    public PlayerTextFileHandler(){
        playerStatistics = new ArrayList<ArrayList>();
        playerIds = new HashMap<Integer, Player>();
        playersList = new ArrayList<Player>();

        updatePlayerData();
        updatePlayerStatistics();
    }

    private void updatePlayerData(){
        BufferedReader tsvFile = null;
        String currentRow = "";
        StringTokenizer st;

        try {
            tsvFile = new BufferedReader(new FileReader("cfl_roster-csv.tsv"));
            currentRow = tsvFile.readLine();
        }   catch(Exception e){System.out.println("File error");}

        while(currentRow != null){ //loops through rows
            st = new StringTokenizer(currentRow, "\t");
            playerData = new ArrayList<Object>();

            while(st.hasMoreElements()) { //adds each column
                playerData.add(st.nextElement());
            }
            try {
                currentRow = tsvFile.readLine();
            } catch(Exception e){System.out.println("File error");}

            Player currentPlayer = new Player(playerData, playerStatistics); //PlayerStatistics not set yet
            playersList.add(currentPlayer);

            int id = (int)playerData.get(0); //ids refer to Player object
            playerIds.put(id, currentPlayer);
        }
    }

    private void updatePlayerStatistics(){
        BufferedReader tsvFile = null;
        String currentRow = "";
        StringTokenizer st;

        try {
            tsvFile = new BufferedReader(new FileReader("cfl_roster_stats-csv.tsv"));
            currentRow = tsvFile.readLine();
        }   catch(Exception e){System.out.println("File error");}

        while(currentRow != null){
            st = new StringTokenizer(currentRow, "\t");
            ArrayList<Object> currentData = new ArrayList<Object>(); //list of current data on row

            while(st.hasMoreElements()){
                currentData.add(st.nextElement());
            }

            try {
                currentRow = tsvFile.readLine();
            }catch(Exception e){System.out.println("File Error");}

            //gets player by id & adds the stats row to his list of stats
            ArrayList<ArrayList> currentPlayerStats = playerIds.get(currentData.get(0)).getPlayerStatistics();
            currentPlayerStats.add(currentData);
        }
    }

    public ArrayList<Player> getPlayers(){
        return playersList;
    }

}