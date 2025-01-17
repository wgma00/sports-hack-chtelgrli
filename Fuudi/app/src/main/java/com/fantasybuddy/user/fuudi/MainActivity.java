package com.fantasybuddy.user.fuudi;

import android.app.AlertDialog;
import android.content.DialogInterface;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity{

    public static List<String> listOfMyPlayers = new ArrayList<String>();


//    @Override
//    protected void onResume() {
//        super.onResume();
//
//
//
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfMyPlayers.add("anthony allen");
        listOfMyPlayers.add("blake sims");
        listOfMyPlayers.add("brendon labatte");
        listOfMyPlayers.add("brett smith");
        listOfMyPlayers.add("carl fitzgerald");
        Intent startingIntent = getIntent();
//        if(startingIntent.hasExtra("NAME")){
//            String namegot = startingIntent.getStringExtra("NAME");
//            int imgke = getResources().getIdentifier(namegot, "drawable", getPackageName());
//
//            int wheretoadd = MainActivity.listOfMyPlayers.size();
//            Toast.makeText(getApplicationContext(), wheretoadd, Toast.LENGTH_LONG).show();
//
////            if(wheretoadd == 5){
//                CircleImageView playerImage = (CircleImageView)findViewById(R.id.message_image6);
//                TextView heightText = (TextView) findViewById(R.id.textView6);
//                LinearLayout curlayout = (LinearLayout) findViewById(R.id.layout6);
//                curlayout.setVisibility(View.VISIBLE);
//                heightText.setVisibility(View.VISIBLE);
//                playerImage.setVisibility(View.VISIBLE);
//
//                playerImage.setImageResource(imgke);
//                heightText.setText(namegot);
////            }
////            if(wheretoadd == 6){
////                CircleImageView playerImage = (CircleImageView)findViewById(R.id.message_image7);
////                TextView heightText = (TextView) findViewById(R.id.textView7);
////                LinearLayout curlayout = (LinearLayout) findViewById(R.id.layout7);
////                curlayout.setVisibility(View.VISIBLE);
////                heightText.setVisibility(View.VISIBLE);
////                playerImage.setVisibility(View.VISIBLE);
////
////                playerImage.setImageResource(imgke);
////                heightText.setText(namegot);
////            }
//
//
//        }



    }

    public void openTrendingInTwitterActivity(View view){
        Intent intent = new Intent(getApplicationContext(),
		       	TrendingInTwitterActivity.class);
        startActivity(intent);
    }

    ArrayList<String> playerList;
    public void onSearchClicked(View view){

        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
        EditText searchBar = (EditText) findViewById(R.id.player_search_bar);
        String searchQuery = searchBar.getText().toString().trim();
        intent.putExtra("SEARCH_QUERY", searchQuery);
//        startActivity(intent);
        playerList = searchPlayers(searchQuery.toLowerCase());
        ListPopupWindow popup = new ListPopupWindow(this);
        popup.setAdapter(new ArrayAdapter<String>(this,
			 R.layout.list_item, playerList));
        popup.setAnchorView(searchBar);
        popup.setWidth(1000);
        popup.setHeight(1000);
        popup.setModal(true);
        popup.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ShowPlayerInfoActivity.class);
                String text = playerList.get(position);
                intent.putExtra("NAME", text);
                startActivity(intent);
            }
        });
        popup.show();
    }

    private ArrayList<String> searchPlayers(String query){
        PlayerDatabase playerDatabase = new PlayerDatabase(this);
        Hashtable<String, Player> playerMap;
        playerMap = playerDatabase.getPlayerNameDatabase();
        ArrayList<String> result = new ArrayList<String>();
        //List of all players
        ArrayList<Player> totalList = playerDatabase.getPlayerList();
        for(int i = 0; i < totalList.size(); i++){
            Player currentPlayer = totalList.get(i);
            String name = currentPlayer.getFirstName() + " " + 
		          currentPlayer.getLastName();
            name = name.toLowerCase();
            if(name.contains(query)){
                result.add(name);
            }
        }
        return result;
    }

    public void onBuyTicketClicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW,
		       	Uri.parse("http://www.cfl.ca/single_game_tickets"));
        startActivity(intent);
    }

    public void onPlayerPressed(View view){
//        Intent intent = new Intent(getApplicationContext(), ShowPlayerInfoActivity.class);

//        String key = "keyy";
//        String stringvalue = "anthony allen";
        String key = "NAME";
        TextView textView = (TextView) ((ViewGroup)view).getChildAt(1);
        CharSequence stringvalue = textView.getText();
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
