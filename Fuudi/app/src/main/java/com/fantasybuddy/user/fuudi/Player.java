package com.fantasybuddy.user.fuudi;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Author: William Granados
 * Purpose: This class will hold variables and digbits related to a certain player
 * Date: 11/27/2015
 */
public class Player {


    // inderminate values, meaning nothing was added
    private final int INT_INDETERMINATE = -1;
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
    ArrayList< ArrayList >playerStatistics;

    /**
     * Default constructor
     */
    public Player(){
        // default values for each element
        this.setId(INT_INDETERMINATE);
        this.setStatsIncId(INT_INDETERMINATE);
        this.setPlayerStat(INT_INDETERMINATE);
        this.setFirstName(STRING_INDETERMINATE);
        this.setLastName(STRING_INDETERMINATE);
        this.setNumber(INT_INDETERMINATE);
        this.setPosition(INT_INDETERMINATE);
        this.setImportStatus(INT_INDETERMINATE);
        this.setHeight(INT_INDETERMINATE);
        this.setWeight(INT_INDETERMINATE);
        this.setBirthDate(STRING_INDETERMINATE);
        this.setBirthPlace(STRING_INDETERMINATE);
        this.setCollege(STRING_INDETERMINATE);
        this.setYrsTeam(INT_INDETERMINATE);
        this.setYrsLeague(INT_INDETERMINATE);
        this.setRosStatus(INT_INDETERMINATE);
    }

    /**
     *  Initializes the player with data from an array list
     *  REQ: data has 18 elements
     * @param data
     */
    public Player(ArrayList playerData, ArrayList<ArrayList> playerStatistics){
        // this is the data that is from the roster stabase
        this.setId((Integer) playerData.get(ID));
        this.setStatsIncId((Integer) playerData.get(STATSINCREASEID));
        this.setTeamId((Integer) playerData.get(TEAMID));
        this.setPlayerStat((Integer) playerData.get(PLAYERSTAT));
        this.setFirstName((String) playerData.get(FIRSTNAME));
        this.setLastName((String) playerData.get(LASTNAME));
        this.setNumber((Integer) playerData.get(NUMBER));
        this.setPosition((Integer) playerData.get(POSITION));
        this.setImportStatus((Integer) playerData.get(IMPORTSTATUS));
        this.setHeight((Double) playerData.get(HEIGHT));
        this.setWeight((Integer) playerData.get(WEIGHT));
        this.setBirthDate((String) playerData.get(BIRTHDATE));
        this.setBirthPlace((String) playerData.get(BIRTHPLACE));
        this.setCollege((String) playerData.get(COLLEGE));
        this.setYrsTeam((Integer) playerData.get(YRSTEAM));
        this.setYrsLeague((Integer) playerData.get(YRSLEAGUE));
        this.setRosStatus((Integer) playerData.get(ROSTERSTATUS));
        // this is the data that is from the rster stats database
        this.setPlayerStatistics(playerStatistics);
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

    public ArrayList< ArrayList > getPlayerStatistics() {
        return playerStatistics;
    }
    public void setPlayerStatistics(ArrayList<ArrayList> playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

    public int getINT_INDETERMINATE() {
        return INT_INDETERMINATE;
    }
    public String getSTRING_INDETERMINATE() {
        return STRING_INDETERMINATE;
    }

    @Override
    public String toString() {
        return "Player{" +
                "INT_INDETERMINATE=" + INT_INDETERMINATE +
                ", STRING_INDETERMINATE='" + STRING_INDETERMINATE + '\'' +
                ", ID=" + ID +
                ", STATSINCREASEID=" + STATSINCREASEID +
                ", TEAMID=" + TEAMID +
                ", PLAYERSTAT=" + PLAYERSTAT +
                ", FIRSTNAME=" + FIRSTNAME +
                ", LASTNAME=" + LASTNAME +
                ", NUMBER=" + NUMBER +
                ", POSITION=" + POSITION +
                ", IMPORTSTATUS=" + IMPORTSTATUS +
                ", HEIGHT=" + HEIGHT +
                ", WEIGHT=" + WEIGHT +
                ", BIRTHDATE=" + BIRTHDATE +
                ", BIRTHPLACE=" + BIRTHPLACE +
                ", COLLEGE=" + COLLEGE +
                ", YRSTEAM=" + YRSTEAM +
                ", YRSLEAGUE=" + YRSLEAGUE +
                ", ROSTERSTATUS=" + ROSTERSTATUS +
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
                ", ROSTERID=" + ROSTERID +
                ", SEASON=" + SEASON +
                ", SEASONTYPE=" + SEASONTYPE +
                ", GAMES=" + GAMES +
                ", TOUCHDOWNS=" + TOUCHDOWNS +
                ", POINTS=" + POINTS +
                ", TWOPOINTPOINTS=" + TWOPOINTPOINTS +
                ", TOTALSINGLES=" + TOTALSINGLES +
                ", PUNTSINGLES=" + PUNTSINGLES +
                ", FIELDGOALSINGLES=" + FIELDGOALSINGLES +
                ", KICKOFFSINGLES=" + KICKOFFSINGLES +
                ", FUMBLES=" + FUMBLES +
                ", FUMBLESLOST=" + FUMBLESLOST +
                ", FUMBLESRETURNYARDS=" + FUMBLESRETURNYARDS +
                ", FUMBLETOUCHDOWNS=" + FUMBLETOUCHDOWNS +
                ", playerStatistics=" + playerStatistics +
                '}';
    }
}
