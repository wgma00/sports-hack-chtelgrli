package com.fantasybuddy.user.fuudi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class BuyTicket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);

        WebView webview = (WebView) findViewById(R.id.buy_ticket_webview);
        webview.loadUrl("http://cfl.ca/single_game_tickets");
    }


}
