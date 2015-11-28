package com.fantasybuddy.user.fuudi;

/**
 * Created by William G on 11/28/2015.
 */
import android.content.Context;
import java.util.Hashtable;

public class Database {

    Hashtable<String, Player>database;
    TextFileHandler fileInput;
    Context context;

    public Database(Context context){
        this.context = context;
        fileInput = new TextFileHandler(context);
    }

    /** Inserts the player object into the database
     *  @param player player to be pushed
     * */
    public void insertPlayer(Player player){
        String key = player.getFirstName() + " " + player.getLastName();
        database.put(key,player);
    }

    /**Returns the respective player object within the database hashatable.
     * @param playerName name of the player
     * @return player to be queried
     */
    public Player query(String playerName){
        if(database.containsKey(playerName))
            return database.get(playerName);
        else
            return null;
    }
}
