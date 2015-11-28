package com.fantasybuddy.user.fuudi;

import java.util.ArrayList;


/**
 * Author: William Granados
 * Purpose: This class will hold variables and digbits related to a certain player
 * Date: 11/27/2015
 */
public class Player {


    // inderminate values, meaning nothing was added
    private final String STRING_INDETERMINATE = "";

    // Constants for each columb in the cfl_roster excel file
    private final int ID = 0;
    private final int STATSINCREASEID = 1;
    private final int TEAMID = 2;
    private final int PLAYERSTAT = 3;
    private final int FIRSTNAME = 4;
    private final int LASTNAME = 5;
    private final int NUMBER = 6;
    private final int POSITION = 7;
    private final int IMPORTSTATUS = 8;
    private final int HEIGHT = 9;
    private final int WEIGHT = 10;
    private final int BIRTHDATE = 11;
    private final int BIRTHPLACE = 12;
    private final int COLLEGE = 13;
    private final int YRSTEAM = 14;
    private final int YRSLEAGUE = 15;
    private final int ROSTERSTATUS = 16;

    // values for each player, taken from the roster database
    private String id;
    private String statsIncId;
    private String teamId;
    private String playerStat;
    private String number;
    private String position;
    private String importStatus;
    private String weight;
    private String yrsLeague;
    private String yrsTeam;
    private String rosStatus;
    private String height;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthPlace;
    private String college;

    // constants for the each columb in the cfl_roster_stats excel file
    private final int ROSTERID = 0;
    private final int SEASON = 1;
    private final int SEASONTYPE = 2;
    private final int GAMES = 3;
    private final int TOUCHDOWNS = 4;
    private final int POINTS = 5;
    private final int TWOPOINTPOINTS = 6;
    private final int TOTALSINGLES = 7;
    private final int PUNTSINGLES = 8;
    private final int FIELDGOALSINGLES = 9;
    private final int KICKOFFSINGLES = 10;
    private final int FUMBLES = 11;
    private final int FUMBLESLOST = 12;
    private final int FUMBLESRETURNYARDS = 13;
    private final int FUMBLETOUCHDOWNS = 14;

    // values for each players, taken form the roster_stats database.
    private ArrayList< ArrayList <String>>playerStatistics;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Default constructor
     */
    public Player(){
        // default values for each element
        this.setId(STRING_INDETERMINATE);
        this.setStatsIncId(STRING_INDETERMINATE);
        this.setPlayerStat(STRING_INDETERMINATE);
        this.setFirstName(STRING_INDETERMINATE);
        this.setLastName(STRING_INDETERMINATE);
        this.setNumber(STRING_INDETERMINATE);
        this.setPosition(STRING_INDETERMINATE);
        this.setImportStatus(STRING_INDETERMINATE);
        this.setHeight(STRING_INDETERMINATE);
        this.setWeight(STRING_INDETERMINATE);
        this.setBirthDate(STRING_INDETERMINATE);
        this.setBirthPlace(STRING_INDETERMINATE);
        this.setCollege(STRING_INDETERMINATE);

        this.setYrsTeam(STRING_INDETERMINATE);
        this.setYrsLeague(STRING_INDETERMINATE);
        this.setRosStatus(STRING_INDETERMINATE);
    }

    /**
     *  Initializes the player with data from an array list
     *  REQ: data has 18 elements
     * @param data
     */
    public Player(ArrayList<String> playerData, ArrayList<ArrayList<String>> playerStatistics){
        // this is the data that is from the roster database
        this.setId(playerData.get(ID));
        this.setStatsIncId(playerData.get(STATSINCREASEID));
        this.setTeamId(playerData.get(TEAMID));
        this.setPlayerStat(playerData.get(PLAYERSTAT));
        this.setFirstName(playerData.get(FIRSTNAME));
        this.setLastName(playerData.get(LASTNAME));
        this.setNumber(playerData.get(NUMBER));
        this.setPosition(playerData.get(POSITION));
        this.setImportStatus(playerData.get(IMPORTSTATUS));
        this.setHeight(playerData.get(HEIGHT));
        this.setWeight(playerData.get(WEIGHT));
        this.setBirthDate(playerData.get(BIRTHDATE));
        this.setBirthPlace(playerData.get(BIRTHPLACE));
        this.setCollege(playerData.get(COLLEGE));
        this.setYrsTeam(playerData.get(YRSTEAM));
        this.setYrsLeague(playerData.get(YRSLEAGUE));
        this.setRosStatus(playerData.get(ROSTERSTATUS));
        // this is the data that is from the rster stats database
        this.setPlayerStatistics(playerStatistics);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatsIncId() {
        return statsIncId;
    }
    public void setStatsIncId(String statsIncId) {
        this.statsIncId = statsIncId;
    }

    public String getTeamId() {
        return teamId;
    }
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getPlayerStat() {
        return playerStat;
    }
    public void setPlayerStat(String playerStat) {
        this.playerStat = playerStat;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getImportStatus() {
        return importStatus;
    }
    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String sTRING_INDETERMINATE2) {
        this.height = sTRING_INDETERMINATE2;
    }

    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getYrsLeague() {
        return yrsLeague;
    }
    public void setYrsLeague(String yrsLeague) {
        this.yrsLeague = yrsLeague;
    }

    public String getYrsTeam() {
        return yrsTeam;
    }
    public void setYrsTeam(String yrsteam) {
        this.yrsTeam = yrsteam;
    }

    public String getRosStatus() {
        return rosStatus;
    }
    public void setRosStatus(String rosStatus) {
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

    public ArrayList< ArrayList <String>> getPlayerStatistics() {
        return this.playerStatistics;
    }
    public void setPlayerStatistics(ArrayList<ArrayList<String>> playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

    public String getString_INDETERMINATE() {
        return STRING_INDETERMINATE;
    }
    public String getSTRING_INDETERMINATE() {
        return STRING_INDETERMINATE;
    }

    @Override
    public String toString() {
        return "Player{" +
                ", id=" + id +
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
                ", playerStatistics=" + playerStatistics +
                '}';
    }
}
