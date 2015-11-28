import java.util.ArrayList;

/**
 * Author: William Granados
 * Purpose: This class will hold variables and digbits related to a certain player
 * Date: 11/27/2015
 */
public class Player {

    private int id;
    private int statsIncId;
    private int teamId;
    private int playerStat;
    private int number;
    private int position;
    private int importStatus;
    private int weight;
    private int yrsLeague;
    private int yrsteam;
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
        this.setId(-1);
        this.setStatsIncId(-1);
        this.setPlayerStat(-1);
        this.setNumber(-1);
        this.setNumber(-1);
        this.setPosition(-1);
        this.setImportStatus(-1);
        this.setHeight(-1);
        this.setWeight(-1);
        this.setYrsLeague(-1);
        this.setRosStatus(-1);
        this.setFirstName("");
        this.setLastName("");
        this.setBirthDate("");
        this.setBirthPlace("");
        this.setCollege("");
        this.setYrsteam(-1);
    }

    /**
     *  Initializes the player with data from an array list
     *  REQ: data has 18 elements
     * @param data
     */
    public Player(ArrayList data){
        this.setId((Integer)data.get(0));
        this.setStatsIncId((Integer) data.get(1));
        this.setTeamId((Integer) data.get(2));
        this.setPlayerStat((Integer)data.get(3));
        this.setFirstName((String) data.get(4));
        this.setLastName((String) data.get(5));
        this.setNumber((Integer) data.get(6));
        this.setPosition((Integer) data.get(7));
        this.setImportStatus((Integer) data.get(8));
        this.setHeight((Double) data.get(9));
        this.setWeight((Integer) data.get(10));
        this.setBirthDate((String) data.get(11));
        this.setBirthPlace((String) data.get(12));
        this.setCollege((String) data.get(13));
        this.setYrsteam((Integer) data.get(14));
        this.setYrsLeague((Integer) data.get(15));
        this.setRosStatus((Integer) data.get(16));
        this.setCreatedAt((String) data.get(17));
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

    public int getYrsteam() {
        return yrsteam;
    }
    public void setYrsteam(int yrsteam) {
        this.yrsteam = yrsteam;
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
                ", yrsteam=" + yrsteam +
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
