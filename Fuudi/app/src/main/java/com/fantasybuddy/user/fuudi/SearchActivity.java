package com.fantasybuddy.user.fuudi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;

public class SearchActivity extends AppCompatActivity {
    TextView PLAYER_NAME = (TextView) findViewById(R.id.player_name);
    PlayerDatabase playerDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent startingIntent = getIntent();
        String whatYouSent = startingIntent.getStringExtra("keyy");
        Toast.makeText(getApplicationContext(), whatYouSent, Toast.LENGTH_LONG).show();

        playerDatabase = new PlayerDatabase(this);
        Hashtable<String, Player> playerMap = playerDatabase.getPlayerNameDatabase();

        //do the search stuff here, return a list of players

        if(whatYouSent != null){
            String query = whatYouSent;
        }

        String query = ""; //REPLACE THIS
        query = query.toLowerCase();

        Player result;


        if(playerMap.get(query) != null) { //button press or exact name
            result = playerMap.get(query);
            PLAYER_NAME.setText(result.getFirstName()+ " "+ result.getLastName());

        }
        else { // returns a list of players with name containing query
            ArrayList<Player> searchResult = searchPlayers(query);
        }

    }

    public ArrayList<Player> searchPlayers(String query){
        ArrayList<Player> result = new ArrayList<Player>();
        ArrayList<Player> totalList = playerDatabase.getPlayerList(); //List of all players

        for(int i = 0; i < totalList.size(); i++){
            Player currentPlayer = totalList.get(i);
            String name = currentPlayer.getFirstName() + " " + currentPlayer.getLastName();

            name = name.toLowerCase();

            if(name.contains(query)){
                result.add(totalList.get(i));
            }
        }

        return result;
    }


}
