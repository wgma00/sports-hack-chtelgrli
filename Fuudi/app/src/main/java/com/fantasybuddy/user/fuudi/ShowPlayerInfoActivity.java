package com.fantasybuddy.user.fuudi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShowPlayerInfoActivity extends AppCompatActivity {
    public static TwitterUpdates TWITTER = new TwitterUpdates();
    String playerNameExtra;
    ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_player_info);


        Intent startingIntent = getIntent();
        playerNameExtra = startingIntent.getStringExtra("NAME");

        loadPlayerTrends(playerNameExtra);

        Player player = getPlayer(playerNameExtra);
        setInfo(player);

    }

    public void loadPlayerTrends(String name){
        TextView playerInfo = (TextView) findViewById(R.id.twitter_stuff);

        String playerName = name;
        Toast.makeText(getApplicationContext(), playerName, Toast.LENGTH_SHORT).show();

        ArrayList<String> results = new ArrayList<String>();
        enableStrictMode();

        results = TWITTER.returnTweets(playerName);
        StrictMode.enableDefaults();

        for(int i = 0; i < results.size(); i++){
            String result = results.get(i);
            String handle = result.substring(0, result.indexOf(":")+1);
            String message =  result.substring(result.indexOf(":")+1, result.length()-1);
            tweets.add(new Tweet(handle, message));
        }
        for(int i = 0; i < tweets.size(); i++){
            Tweet tweetRN = tweets.get(i);
            playerInfo.setText(playerInfo.getText() + "\n" + tweetRN.handle + "\r" + tweetRN.message + "\n");
        }
    }

    private void setInfo(Player player){
        TextView playerNameBox = (TextView) findViewById(R.id.player_name);
        TextView teamText = (TextView) findViewById(R.id.team_number_holder);
        TextView positionText = (TextView) findViewById(R.id.position_holder);
        TextView weightText = (TextView) findViewById(R.id.weight_holder);
        TextView heightText = (TextView) findViewById(R.id.height_holder);
        CircleImageView playerImage = (CircleImageView)findViewById(R.id.player_image);

        String nameForResource = playerNameExtra.toLowerCase().replace(' ', '_');

        int resourceId = getResources().getIdentifier(nameForResource, "drawable", getPackageName());

        playerImage.setImageResource(resourceId);

        playerNameBox.setText(playerNameExtra);
        teamText.setText(player.getTeamId());
        positionText.setText(player.getPosition());
        weightText.setText(player.getWeight());
        heightText.setText(player.getHeight());

    }

    private Player getPlayer(String name){
        PlayerDatabase playerDatabase = new PlayerDatabase(this);
        ArrayList<Player> playerList = playerDatabase.getPlayerList();
        Hashtable<String, Player> nameDatabase;
        nameDatabase = playerDatabase.getPlayerNameDatabase();

        if(nameDatabase.containsKey(name.toLowerCase())){
            Log.e("MAP", "It worked");
            return nameDatabase.get(name.toLowerCase());
        }

        else {
            String[] names = name.split(" ");

            for (int i = 0; i < playerList.size(); i++) {
                if (playerList.get(i).getFirstName().equals(names[0]) && playerList.get(i).getLastName().equals(names[1])) {
                    Log.e("MAP", "not really");
                    return playerList.get(i);
                }
            }
        }
        return null;
    }

    public class Tweet{
        String handle;
        String message;
        public Tweet(String handle, String message){
            this.handle = handle;
            this.message = message;
        }
    }

    public void enableStrictMode()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }


}
