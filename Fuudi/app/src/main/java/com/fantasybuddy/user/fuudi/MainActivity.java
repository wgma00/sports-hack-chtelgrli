package com.fantasybuddy.user.fuudi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    public static List<String> listOfMyPlayers = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfMyPlayers.add("anthony allen");
        listOfMyPlayers.add("blake sims");
        listOfMyPlayers.add("brendon labatte");
        listOfMyPlayers.add("brett smith");
        listOfMyPlayers.add("carl fitzgerald");



    }

    public void openTrendingInTwitterActivity(View view){
        Intent intent = new Intent(getApplicationContext(), TrendingInTwitterActivity.class);
        startActivity(intent);
    }

    public void onSearchClicked(View view){

        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
        EditText searchBar = (EditText) findViewById(R.id.player_search_bar);
        String searchQuery = searchBar.getText().toString().trim();

        intent.putExtra("SEARCH_QUERY", searchQuery);
        startActivity(intent);

    }

    public void onBuyTicketClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cfl.ca/single_game_tickets"));
        startActivity(intent);
    }

    public void onPlayerPressed(View view){
//        Intent intent = new Intent(getApplicationContext(), ShowPlayerInfoActivity.class);

//        String key = "keyy";
//        String stringvalue = "anthony allen";
        String key = "NAME";

        TextView textView = (TextView) ((ViewGroup)view).getChildAt(1);

        CharSequence stringvalue = textView.getText();
        Toast.makeText(getApplicationContext(), stringvalue,
                Toast.LENGTH_LONG).show();

        Intent sendStuff = new Intent(this, ShowPlayerInfoActivity.class);
        sendStuff.putExtra(key, stringvalue);
        startActivity(sendStuff);

    }

}










//        FloatingActionButton fabd = (FloatingActionButton) findViewById(R.id.fab);
//        fabd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openTrendingInTwitterActivity(view);
////                Snackbar.make(view, "Hi Justin", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//            }
//        });