package com.fantasybuddy.user.fuudi;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by William G on 11/28/2015.
 */
public class Game {

    // final constants that will be used to check for default values.
    private final int INT_INDETERMINANT = -1;
    private final String STRING_INDETERMINANT = "";

    private int gameId;
    private int skedId;
    private int weekName;
    private int weekShort;
    private int weekId;
    private int gameNumber;
    private String gameDate;
    private int dateTbd;
    private int timeTbd;
    private String gameStatus;
    private String awayTeam;
    private String awayInitial;
    private int awayScore1;
    private int awayScore2;
    private int awayScore3;
    private int awayScore4;
    private int awayScoreOT;
    private int awayId;
    private String homeTeam;
    private String homeInitiual;
    private int homeScore1;
    private int homeScore2;
    private int homeScore3;
    private int homeScore4;
    private int homeScore5;
    private int homeScoreOT;
    private int homeId;
    private int attendance;
    private boolean soldOut;
    private boolean isVisible;
    private String culture;

    public Game(){

    }
    public Game(ArrayList data){
        this.setGameId((Integer)data.get(0));
    }


    public int getINT_INDETERMINANT() {
        return INT_INDETERMINANT;
    }

    public String getSTRING_INDETERMINANT() {
        return STRING_INDETERMINANT;
    }

    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getSkedId() {
        return skedId;
    }
    public void setSkedId(int skedId) {
        this.skedId = skedId;
    }

    public int getWeekName() {
        return weekName;
    }
    public void setWeekName(int weekName) {
        this.weekName = weekName;
    }

    public int getWeekShort() {
        return weekShort;
    }
    public void setWeekShort(int weekShort) {
        this.weekShort = weekShort;
    }

    public int getWeekId() {
        return weekId;
    }
    public void setWeekId(int weekId) {
        this.weekId = weekId;
    }

    public int getGameNumber() {
        return gameNumber;
    }
    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public String getGameDate() {
        return gameDate;
    }
    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }

    public int getDateTbd() {
        return dateTbd;
    }
    public void setDateTbd(int dateTbd) {
        this.dateTbd = dateTbd;
    }

    public int getTimeTbd() {
        return timeTbd;
    }
    public void setTimeTbd(int timeTbd) {
        this.timeTbd = timeTbd;
    }

    public String getGameStatus() {
        return gameStatus;
    }
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getAwayInitial() {
        return awayInitial;
    }
    public void setAwayInitial(String awayInitial) {
        this.awayInitial = awayInitial;
    }

    public int getAwayScore1() {
        return awayScore1;
    }
    public void setAwayScore1(int awayScore1) {
        this.awayScore1 = awayScore1;
    }

    public int getAwayScore2() {
        return awayScore2;
    }
    public void setAwayScore2(int awayScore2) {
        this.awayScore2 = awayScore2;
    }

    public int getAwayScore3() {
        return awayScore3;
    }
    public void setAwayScore3(int awayScore3) {
        this.awayScore3 = awayScore3;
    }

    public int getAwayScore4() {
        return awayScore4;
    }
    public void setAwayScore4(int awayScore4) {
        this.awayScore4 = awayScore4;
    }

    public int getAwayScoreOT() {
        return awayScoreOT;
    }
    public void setAwayScoreOT(int awayScoreOT) {
        this.awayScoreOT = awayScoreOT;
    }

    public int getAwayId() {
        return awayId;
    }
    public void setAwayId(int awayId) {
        this.awayId = awayId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getHomeInitiual() {
        return homeInitiual;
    }
    public void setHomeInitiual(String homeInitiual) {
        this.homeInitiual = homeInitiual;
    }

    public int getHomeScore1() {
        return homeScore1;
    }
    public void setHomeScore1(int homeScore1) {
        this.homeScore1 = homeScore1;
    }

    public int getHomeScore2() {
        return homeScore2;
    }
    public void setHomeScore2(int homeScore2) {
        this.homeScore2 = homeScore2;
    }

    public int getHomeScore3() {
        return homeScore3;
    }
    public void setHomeScore3(int homeScore3) {
        this.homeScore3 = homeScore3;
    }

    public int getHomeScore4() {
        return homeScore4;
    }
    public void setHomeScore4(int homeScore4) {
        this.homeScore4 = homeScore4;
    }

    public int getHomeScore5() {
        return homeScore5;
    }
    public void setHomeScore5(int homeScore5) {
        this.homeScore5 = homeScore5;
    }

    public int getHomeScoreOT() {
        return homeScoreOT;
    }
    public void setHomeScoreOT(int homeScoreOT) {
        this.homeScoreOT = homeScoreOT;
    }

    public int getHomeId() {
        return homeId;
    }
    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public int getAttendance() {
        return attendance;
    }
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public boolean isSoldOut() {
        return soldOut;
    }
    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public boolean isVisible() {
        return isVisible;
    }
    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }
}
