package com.fantasybuddy.user.fuudi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTrendingInTwitterActivity(View view){
        Intent intent = new Intent(getApplicationContext(), TrendingInTwitterActivity.class);
        startActivity(intent);
    }

    public void onSearchClicked(View view){
        Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
        startActivity(intent);
    }

    public void onPlayerPressed(View view){
//        Intent intent = new Intent(getApplicationContext(), ShowPlayerInfoActivity.class);

        String key = "keyy";
        String stringvalue = "anthony allen";
        Intent sendStuff = new Intent(this, ShowPlayerInfoActivity.class);
        sendStuff.putExtra(key, stringvalue);
        startActivity(sendStuff);

//        String message = "anthony allen";
//        intent.putExtra("message", message );

//        Toast.makeText(getApplicationContext(), message,
//                Toast.LENGTH_LONG).show();
//        startActivity(intent);
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