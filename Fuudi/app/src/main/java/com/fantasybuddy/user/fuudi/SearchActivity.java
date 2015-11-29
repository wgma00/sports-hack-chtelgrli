package com.fantasybuddy.user.fuudi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //do the search stuff here, return a list of players

        String query = ""; //REPLACE THIS

        ArrayList<Player> searchResult = searchPlayers(query); //Example
    }

    public ArrayList<Player> searchPlayers(String query){
        PlayerDatabase pd = new PlayerDatabase(this);
        ArrayList<Player> result = new ArrayList<Player>();
        ArrayList<Player> totalList = pd.getPlayerList(); //List of all players

        for(int i = 0; i < totalList.size(); i++){
            Player currentPlayer = totalList.get(i);
            String name = currentPlayer.getFirstName() + " " + currentPlayer.getLastName();

            name = name.toLowerCase();
            query = query.toLowerCase();

            if(name.contains(query)){
                result.add(totalList.get(i));
            }
        }

        return result;
    }
}
