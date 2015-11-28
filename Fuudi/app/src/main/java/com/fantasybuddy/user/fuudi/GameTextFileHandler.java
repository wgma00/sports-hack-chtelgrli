package com.fantasybuddy.user.fuudi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by User on 11/28/2015.
 */
public class GameTextFileHandler {

    private ArrayList<Game> gamesList;
    public GameTextFileHandler(){
        gamesList = new ArrayList<Game>();
        updateDatabase();
    }

    private void updateDatabase(){
        BufferedReader tsvFile = null;
        String currentrow = "";
        StringTokenizer st;

        try{
            tsvFile = new BufferedReader(new FileReader("database_files/cfl_games-csv.tsv"));
        } catch(Exception e){System.out.println("File Error");}

        while (currentrow != null){
            st = new StringTokenizer(currentrow);
            ArrayList<Object> datarow = new ArrayList<Object>();

            while(st.hasMoreElements()){
                datarow.add(st.nextElement());
            }

            try{
                currentrow = tsvFile.readLine();
            }catch(Exception e){System.out.println("File Error");}

            Game currentGame = new Game(datarow);
            gamesList.add(currentGame);
        }
    }

    public ArrayList<Game> getGamesList(){
        return gamesList;
    }
}
