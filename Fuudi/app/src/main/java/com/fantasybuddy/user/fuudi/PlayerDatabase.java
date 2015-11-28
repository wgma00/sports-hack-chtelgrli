package com.fantasybuddy.user.fuudi;

/**
 * Created by William G on 11/28/2015.
 */
import android.content.Context;

import java.util.ArrayList;
import java.util.Hashtable;

public class PlayerDatabase {

    Hashtable<Integer, Player>playerIdDatabase;
    Hashtable<String, Player>playerNameDatabase;

    ArrayList<Player> playerList;

    Context context;

    public PlayerDatabase(Context context){
        this.context = context;

        updateDatabases();
    }

    private void updateDatabases(){
        PlayerTextFileHandler textHandler = new PlayerTextFileHandler();
        playerList = textHandler.getPlayers();

        for(int i = 0; i < playerList.size(); i++){
            Player currentPlayer = playerList.get(i);
            String playerName = currentPlayer.getFirstName() + " " + currentPlayer.getLastName();
            int playerId = currentPlayer.getId();

            playerIdDatabase.put(playerId, currentPlayer);
            playerNameDatabase.put(playerName, currentPlayer);
        }
    }

    public Hashtable<Integer, Player> getPlayerIdDatabase(){
        return playerIdDatabase;
    }

    public Hashtable<String, Player> getPlayerNameDatabase(){
        return playerNameDatabase;
    }
}
