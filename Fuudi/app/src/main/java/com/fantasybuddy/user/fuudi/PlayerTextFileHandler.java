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
    Context context;

    public PlayerTextFileHandler(Context context){
        playerIds = new HashMap<String, Player>();
        playersList = new ArrayList<Player>();
        this.context = context;
        updatePlayerData();
        updatePlayerStatistics();
    }

    private void updatePlayerData(){
        InputStream is = context.getResources().openRawResource(R.raw.cfl_roster_csv);
        BufferedReader tsvFile = new BufferedReader(new InputStreamReader(is));
        String currentRow = "";
        StringTokenizer st;
        // make sure the file is there
        try {
            currentRow = tsvFile.readLine();
        }   catch(Exception e){
            System.out.println("File error 1");
        }
        // parse through the file, in this case loops through the rows
        do{
            st = new StringTokenizer(currentRow);
            ArrayList<String> playerData = new ArrayList<String>();
            //now we loop throug the columns and add each column
            while(st.hasMoreElements()) { 
                playerData.add((String)st.nextElement());
            } 
            Player currentPlayer = new Player(playerData,
			   	   new ArrayList<ArrayList<String>>());
            playersList.add(currentPlayer);
            String id = playerData.get(0); //ids refer to Player object
            playerIds.put(id, currentPlayer);
	    // try reading the next line available in the raw data
            try {
                currentRow = tsvFile.readLine();
            } catch(Exception e){
                System.out.println("File error 2");
            }
        }while(currentRow != null);
    }

    private void updatePlayerStatistics(){
        InputStream is = context.getResources().openRawResource(
			 R.raw.cfl_roster_stats_csv);
        BufferedReader tsvFile = new BufferedReader(new InputStreamReader(is));
        String currentRow = "";
        StringTokenizer st;
        // try reading the first row as a sanity check and to start off the loop
        try {
            currentRow = tsvFile.readLine();
        }catch(Exception e){
	    System.out.println("File error 3");
	}

        do{
            st = new StringTokenizer(currentRow);
   	    //list of current data on row
            ArrayList<String> currentData = new ArrayList<String>();
	    // read each column
            while(st.hasMoreElements()){
                currentData.add((String)st.nextElement());
            }
	    
            playerIds.get(currentData.get(0)).getPlayerStatistics().add(currentData);
            //gets player by id & adds the stats row to his list of stats
            Player currentPlayer = playerIds.get(currentData.get(0));
            ArrayList<ArrayList<String>> playerStats = 
	    currentPlayer.getPlayerStatistics();
            
	    playerStats.add(currentData);
            currentPlayer.setPlayerStatistics(playerStats);
	    // try and read the next row
            try {
                currentRow = tsvFile.readLine();
            }catch(Exception e){
		    System.out.println("File Error 4");
	    }
        }while(currentRow != null);
    }

    public ArrayList<Player> getPlayers(){
        return playersList;
    }

}
