package com.fantasybuddy.user.fuudi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    public static List<Player> listOfMyContactObjects = new ArrayList<Player>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTrendingInTwitterActivity(View view){
        Intent intent = new Intent(getApplicationContext(), TrendingInTwitterActivity.class);
        startActivity(intent);
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