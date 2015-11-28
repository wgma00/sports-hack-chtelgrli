package com.fantasybuddy.user.fuudi;
import org.w3c.dom.Text;

import java.io.*;
import java.util.*;
import android.content.*;

/**
 * Created by William G on 11/28/2015.
 */
public class TextFileHandler {

    private final int PLAYER_INFORMATION = 18;
    private List<Player> information = new ArrayList<Player>();

    public TextFileHandler(Context cxt){


    }

    public List<Player> openPlayerInformation(Context cxt, String file){
           try{
               // prelimanary stuff for opening a text file.
               // need access to the context of the database class so that we can upload
               // stuff there etc.
               InputStream is = cxt.getAssets().open(file);
               InputStreamReader isr = new InputStreamReader(is);
               BufferedReader br = new BufferedReader(isr);

               String line = br.readLine();
               List<Player> ret = new ArrayList<Player>();

               while(line != null){
                     // split the strings by white space with regex
                     ArrayList<Object>data = new ArrayList(Arrays.asList(line.split("\\s+")));
                     Player player = new Player(data);
                     ret.add(player);
                     line = br.readLine();
               }
               return ret;
           }catch(IOException e){
               System.out.println("File not found:" + file);
           }
        return null;
    }

    public List<Player> getInformation() {
        return information;
    }
    public void setInformation(List<Player> information) {
        this.information = information;
    }

}