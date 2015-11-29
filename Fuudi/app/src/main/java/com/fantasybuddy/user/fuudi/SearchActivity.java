package com.fantasybuddy.user.fuudi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;

public class SearchActivity extends AppCompatActivity {

    PlayerDatabase playerDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        //gets player'clicked on's name through intent
        Intent startingIntent = getIntent();
        String whatYouSent = startingIntent.getStringExtra("SEARCH_QUERY");

        //makes toast to check if we got the correct name
        Toast.makeText(getApplicationContext(), whatYouSent, Toast.LENGTH_LONG).show();


        playerDatabase = new PlayerDatabase(this);
        Hashtable<String, Player> playerMap;
        playerMap = playerDatabase.getPlayerNameDatabase();
        //TextView testi = (TextView) findViewById(R.id.testingitno); //PLAYER_NAME is not in
        //do the search stuff here, return a list of players
        String query = "";
        if(whatYouSent != null){
            query = whatYouSent;
        }

        query = query.toLowerCase();

        Player result;
        
        if(playerMap.containsKey(query)) {
            result = playerMap.get(query);
            String playerName = result.getFirstName() + " " + result.getLastName();
            sendToPlayerInfo(playerName);
        }
        else { // returns a list of players with name containing query
            ArrayList<Player> searchResult = searchPlayers(query);
            populateResultList(searchResult);
            Log.e("PLAYERLIST", searchResult.toString());
        }

    }

    private void sendToPlayerInfo(String result){
        String key = "NAME";
        String stringvalue = result;

        Intent sendStuff = new Intent(this, ShowPlayerInfoActivity.class);
        sendStuff.putExtra(key, stringvalue);
        startActivity(sendStuff);

    }

    private void populateResultList(ArrayList<Player> results){
        ListView listView = (ListView) findViewById(R.id.search_results);
    }

    private ArrayList<Player> searchPlayers(String query){
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
