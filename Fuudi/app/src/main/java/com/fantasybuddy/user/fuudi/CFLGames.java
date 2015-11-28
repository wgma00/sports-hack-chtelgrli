package com.fantasybuddy.user.fuudi;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by Justin on 11/28/2015.
 */
public class CFLGames {
    Hashtable<Integer, Game> gameDatabase; //id, Game
    ArrayList<Game> gamesList;

    public CFLGames(){
        gameDatabase = new Hashtable<Integer, Game>();
        gamesList = new ArrayList<Game>();

        updateGameDatabase();
    }

    private void updateGameDatabase(){
        GameTextFileHandler textHandler = new GameTextFileHandler();
        gamesList = textHandler.getGamesList();

        for(int i = 0; i < gamesList.size(); i++){
            gameDatabase.put(gamesList.get(i).getGameId(), gameDatabase.get(i));
        }
    }

    public ArrayList<Game> getGamesList(){
        return gamesList;
    }
}
