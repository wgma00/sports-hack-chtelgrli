package com.fantasybuddy.user.fuudi;
import org.w3c.dom.Text;

import java.io.*;
import java.util.*;
import android.content.*;

/**
 * Created by William G on 11/28/2015.
 */
public class PlayerTextFileHandler {
    private HashMap<String, Player> playerIds;
    private ArrayList<Player> playersList;

    public PlayerTextFileHandler(){
        playerIds = new HashMap<String, Player>();
        playersList = new ArrayList<Player>();

        updatePlayerData();
        updatePlayerStatistics();
    }

    private void updatePlayerData(){
        BufferedReader tsvFile = null;
        String currentRow = "";
        StringTokenizer st;

        // make sure the file is there
        try {
            tsvFile = new BufferedReader(new FileReader("cfl_roster-csv.tsv"));
            currentRow = tsvFile.readLine();
        }   catch(Exception e){
            System.out.println("File error 1");
        }

        // parse through the file
        while(currentRow != null){ //loops through rows
            st = new StringTokenizer(currentRow, "\t");
            ArrayList<String> playerData = new ArrayList<String>();

            while(st.hasMoreElements()) { //adds each column
                playerData.add((String)st.nextElement());
            }

            try {
                currentRow = tsvFile.readLine();
            } catch(Exception e){
                System.out.println("File error 2");
            }

            Player currentPlayer = new Player(playerData, new ArrayList<ArrayList<String>>());
            playersList.add(currentPlayer);

            String id = playerData.get(0); //ids refer to Player object
            playerIds.put(id, currentPlayer);

        }
        System.out.println(playerIds.get("1"));

    }

    private void updatePlayerStatistics(){
        BufferedReader tsvFile = null;
        String currentRow = "";
        StringTokenizer st;

        try {
            tsvFile = new BufferedReader(new FileReader("cfl_roster_stats-csv.tsv"));
            currentRow = tsvFile.readLine();
        }   catch(Exception e){System.out.println("File error 3");}

        while(currentRow != null){
            st = new StringTokenizer(currentRow, "\t");
            ArrayList<String> currentData = new ArrayList<String>(); //list of current data on row

            while(st.hasMoreElements()){
                currentData.add((String)st.nextElement());
            }

            try {
                currentRow = tsvFile.readLine();
            }catch(Exception e){System.out.println("File Error 4");}


            playerIds.get(currentData.get(0)).getPlayerStatistics().add(currentData);
            //gets player by id & adds the stats row to his list of stats
            Player currentPlayer = playerIds.get(currentData.get(0));
            ArrayList<ArrayList<String>> playerStats = currentPlayer.getPlayerStatistics();

            playerStats.add(currentData);
            currentPlayer.setPlayerStatistics(playerStats);
        }
    }

    public ArrayList<Player> getPlayers(){
        return playersList;
    }

}