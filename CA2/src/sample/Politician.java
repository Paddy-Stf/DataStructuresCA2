package sample;

/**
 * Responsible for object politician and parameters of class.
 */

public class Politician {

    private String politicianName, politicianDOB, politicianCounty;
    private String politicianCurrentParty, politicianPreviousParty, politicianImage;

    public Politician(String politicianName, String politicianDOB, String politicianParty, String politicianCounty, String politicianCurrentParty, String politicianPreviousParty, String politicianImage) {
        this.politicianName = politicianName;
        this.politicianDOB = politicianDOB;
        this.politicianCounty = politicianCounty;
        this.politicianCurrentParty = politicianCurrentParty;
        this.politicianPreviousParty = politicianPreviousParty;
        this.politicianImage = politicianImage;
    }

    /**
     * Getters and Setters of all politician fields.
     */

    public String getPoliticianName() {
        return politicianName;
    }

    public void setPoliticianName(String politicianName) {
        this.politicianName = politicianName;
    }

    public String getPoliticianDOB() {
        return politicianDOB;
    }

    public void setPoliticianDOB(String politicianDOB) {
        this.politicianDOB = politicianDOB;
    }


    public String getPoliticianCounty() {
        return politicianCounty;
    }

    public void setPoliticianCounty(String politicianCounty) {
        this.politicianCounty = politicianCounty;
    }

    public String getPoliticianCurrentParty() {
        return politicianCurrentParty;
    }

    public void setPoliticianCurrentParty(String politicianCurrentParty) {
        this.politicianCurrentParty = politicianCurrentParty;
    }

    public String getPoliticianPreviousParty() {
        return politicianPreviousParty;
    }

    public void setPoliticianPreviousParty(String politicianPreviousParty) {
        this.politicianPreviousParty = politicianPreviousParty;
    }

    public String getPoliticianImage() {
        return politicianImage;
    }

    public void setPoliticianImage(String politicianImage) {
        this.politicianImage = politicianImage;
    }

    @Override
    public String toString() {
        return "Politician{" +
                "politicianName='" + politicianName + '\'' +
                ", politicianDOB='" + politicianDOB + '\'' +
                ", politicianCounty='" + politicianCounty + '\'' +
                ", politicianCurrentParty='" + politicianCurrentParty + '\'' +
                ", politicianPreviousParty='" + politicianPreviousParty + '\'' +
                ", politicianImage='" + politicianImage + '\'' +
                '}';
    }
}
