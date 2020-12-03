package sample;

public class Election {

    private  String  electionType;
    private String electionLocation;
    private  String electionDate;
    private int numSeats;

    public Election(String electionType,String electionLocation,String electionDate ,int numSeats){
        this.electionType=electionType;
        this.electionLocation=electionLocation;
        this.electionDate=electionDate;
        this.numSeats=numSeats;
    }

    public String getElectionType() {
        return electionType;
    }

    public String getElectionLocation() {
        return electionLocation;
    }

    public String getElectionDate() {
        return electionDate;
    }

    public int getNumSeats() {
        return numSeats;
    }


    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public void setElectionDate(String electionDate) {
        this.electionDate = electionDate;
    }

    public void setElectionLocation(String electionLocation) {
        this.electionLocation = electionLocation;
    }

    public void setElectionType(String electionType) {
        this.electionType = electionType;
    }

    @Override
    public String toString() {
        return "Election{" +
                "electionType='" + electionType + '\'' +
                ", electionLocation='" + electionLocation + '\'' +
                ", electionDate='" + electionDate + '\'' +
                ", numSeats=" + numSeats +
                '}';
    }
}
