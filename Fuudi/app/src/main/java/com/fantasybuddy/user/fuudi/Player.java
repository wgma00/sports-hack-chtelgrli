package com.fantasybuddy.user.fuudi;

import java.util.ArrayList;

/**
 * Author: William Granados
 * Purpose: This class will hold variables and digbits related to a certain player
 * Date: 11/27/2015
 */
public class Player {

    // Constants for each columb in the cfl_roster excel file
    public final int ID = 0;
    public final int STATSINCREASEID = 1;
    public final int TEAMID = 2;
    public final int PLAYERSTAT = 3;
    public final int FIRSTNAME = 4;
    public final int LASTNAME = 5;
    public final int NUMBER = 6;
    public final int POSITION = 7;
    public final int IMPORTSTATUS = 8;
    public final int HEIGHT = 9;
    public final int WEIGHT = 10;
    public final int BIRTHDATE = 11;
    public final int BIRTHPLACE = 12;
    public final int COLLEGE = 13;
    public final int YRSTEAM = 14;
    public final int YRSLEAGUE = 15;
    public final int ROSTERSTATUS = 16;
    public final int CREATEDATE = 17;

    // constant values for each

    private int id;
    private int statsIncId;
    private int teamId;
    private int playerStat;
    private int number;
    private int position;
    private int importStatus;
    private int weight;
    private int yrsLeague;
    private int yrsTeam;
    private int rosStatus;
    private double height;

    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthPlace;
    private String college;
    private String createdAt;


    /**
     * Default constructor
     */
    public Player(){
        // default values for each element
        this.setId(-1);
        this.setStatsIncId(-1);
        this.setPlayerStat(-1);
        this.setFirstName("");
        this.setLastName("");
        this.setNumber(-1);
        this.setPosition(-1);
        this.setImportStatus(-1);
        this.setHeight(-1);
        this.setWeight(-1);
        this.setBirthDate("");
        this.setBirthPlace("");
        this.setCollege("");
        this.setYrsTeam(-1);
        this.setYrsLeague(-1);
        this.setRosStatus(-1);
        this.setCreatedAt("");
    }

    /**
     *  Initializes the player with data from an array list
     *  REQ: data has 18 elements
     * @param data
     */
    public Player(ArrayList data){
        this.setId((Integer)data.get(ID));
        this.setStatsIncId((Integer) data.get(STATSINCREASEID));
        this.setTeamId((Integer) data.get(TEAMID));
        this.setPlayerStat((Integer)data.get(PLAYERSTAT));
        this.setFirstName((String) data.get(FIRSTNAME));
        this.setLastName((String) data.get(LASTNAME));
        this.setNumber((Integer) data.get(NUMBER));
        this.setPosition((Integer) data.get(POSITION));
        this.setImportStatus((Integer) data.get(IMPORTSTATUS));
        this.setHeight((Double) data.get(HEIGHT));
        this.setWeight((Integer) data.get(WEIGHT));
        this.setBirthDate((String) data.get(BIRTHDATE));
        this.setBirthPlace((String) data.get(BIRTHPLACE));
        this.setCollege((String) data.get(COLLEGE));
        this.setYrsTeam((Integer) data.get(YRSTEAM));
        this.setYrsLeague((Integer) data.get(YRSLEAGUE));
        this.setRosStatus((Integer) data.get(ROSTERSTATUS));
        this.setCreatedAt((String) data.get(CREATEDATE));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatsIncId() {
        return statsIncId;
    }
    public void setStatsIncId(int statsIncId) {
        this.statsIncId = statsIncId;
    }

    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getPlayerStat() {
        return playerStat;
    }
    public void setPlayerStat(int playerStat) {
        this.playerStat = playerStat;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public int getImportStatus() {
        return importStatus;
    }
    public void setImportStatus(int importStatus) {
        this.importStatus = importStatus;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYrsLeague() {
        return yrsLeague;
    }
    public void setYrsLeague(int yrsLeague) {
        this.yrsLeague = yrsLeague;
    }

    public int getYrsTeam() {
        return yrsTeam;
    }
    public void setYrsTeam(int yrsteam) {
        this.yrsTeam = yrsteam;
    }

    public int getRosStatus() {
        return rosStatus;
    }
    public void setRosStatus(int rosStatus) {
        this.rosStatus = rosStatus;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", statsIncId=" + statsIncId +
                ", teamId=" + teamId +
                ", playerStat=" + playerStat +
                ", number=" + number +
                ", position=" + position +
                ", importStatus=" + importStatus +
                ", weight=" + weight +
                ", yrsLeague=" + yrsLeague +
                ", yrsTeam=" + yrsTeam +
                ", rosStatus=" + rosStatus +
                ", height=" + height +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", college='" + college + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }

}
