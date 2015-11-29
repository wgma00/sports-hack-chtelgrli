package com.fantasybuddy.user.fuudi;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrendingInTwitterActivity extends AppCompatActivity {
    ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_in_twitter);
    }
    public void loadPlayerTrends(View view){
        TextView playerInfo = (TextView) findViewById(R.id.playerTweets);
        EditText playerNameBox = (EditText) findViewById(R.id.playerNameBox);

        String playerName = playerNameBox.getText().toString();
        ArrayList<String> results = new ArrayList<String>();
        enableStrictMode();
        results = new TwitterUpdates().returnTweets(playerName);
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
