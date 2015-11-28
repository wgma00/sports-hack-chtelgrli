package com.fantasybuddy.user.fuudi;

/**
 * Created by William G on 11/28/2015.
 */
import android.content.Context;
import java.util.Hashtable;

public class PlayerDatabase {

    Hashtable<Integer, Player>playerIdDatabase;
    Hashtable<String, Player>playerNameDatabase;

    Context context;

    public PlayerDatabase(Context context){
        this.context = context;
    
    }


}
