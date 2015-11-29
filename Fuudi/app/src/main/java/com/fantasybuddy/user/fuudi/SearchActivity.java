package com.fantasybuddy.user.fuudi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    TextView PLAYER_NAME = (TextView) findViewById(R.id.player_name);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");

        //do the search stuff here, return a list of players

        if(message != null){

        }

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
