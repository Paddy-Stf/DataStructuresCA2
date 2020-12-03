package sample;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

Politician politician;
    Hash hash = new Hash();


    @FXML
    public TextField politicianName, politicianImage, politicianDOB, electionDate, electionSeats, candidateVotes, politicianNameSearch;
    @FXML
    public Button addPoliticianButton, imagePreviewButton, addElectionButton, addCandidateButton, updatePoliticianButton, updateElectionButton, updateCandidateButton, deletePoliticianButton, deleteElectionButton, deleteCandidateButton, searchPoliticianButton, save, load, reset;
    @FXML
    public ChoiceBox politicianCountyChoice, politicianCurrentPartyChoice, electionType, electionLocation, candidateElectionChoice, searchElectionYear, searchElectionType, searchPoliticianParty, searchPoliticianLocation, searchBy;
    @FXML
    public ListView politicianPreviousPartyList;
    @FXML
    public AnchorPane searchElectionButton;
    @FXML
    public ListView viewAll;
    @FXML
    public TreeView drillDownTreeView;
    @FXML
    public ImageView preViewImage;


    public void initialize(URL location, ResourceBundle resources) {
        politicianCountyChoice.getItems().addAll("Antrim", "Armagh ", "Cavan", "Derry", "Donegal", "Down", "Fermanagh", "Monaghan", "Tyrone", "Galway", "Leitrim", "Mayo", "Roscommon", "Sligo", "Carlow", "Dublin", "Kildare", "Kilkenny", "Laois", "Longford", "Louth", "Meath", "Offaly", "Westmeath", "Wexford", "Wicklow", "Clare", "Cork", "Kerry", "Limerick", "Tipperary", "Waterford");
        politicianCurrentPartyChoice.getItems().addAll("Fianna Fail", "Sinn Fein", " Fine Gael", "Green Party", "Labour Party", "Social Democrats", "Solidarity–People Before Profit", "Aontú Right To Change", "Independents", "Human Dignity Alliance", "Workers and Unemployed Action", "Workers Party", "Republican", "Independent Left", "Other");
        electionType.getItems().addAll("General elections", "Seanad elections", "European elections ", "Local elections ", "Presidential elections ", "Referendums");
        electionLocation.getItems().addAll("Antrim", "Armagh ", "Cavan", "Derry", "Donegal", "Down", "Fermanagh", "Monaghan", "Tyrone", "Galway", "Leitrim", "Mayo", "Roscommon", "Sligo", "Carlow", "Dublin", "Kildare", "Kilkenny", "Laois", "Longford", "Louth", "Meath", "Offaly", "Westmeath", "Wexford", "Wicklow", "Clare", "Cork", "Kerry", "Limerick", "Tipperary", "Waterford", "Europe");
        searchElectionYear.getItems().addAll("2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990");
        searchElectionType.getItems().addAll("General elections", "Seanad elections", "European elections ", "Local elections ", "Presidential elections ", "Referendums");
        searchPoliticianParty.getItems().addAll("Fianna Fail", "Sinn Fein", " Fine Gael", "Green Party", "Labour Party", "Social Democrats", "Solidarity–People Before Profit", "Aontú Right To Change", "Independents", "Human Dignity Alliance", "Workers and Unemployed Action", "Workers Party", "Republican", "Independent Left", "Other");
        searchPoliticianLocation.getItems().addAll("Antrim", "Armagh ", "Cavan", "Derry", "Donegal", "Down", "Fermanagh", "Monaghan", "Tyrone", "Galway", "Leitrim", "Mayo", "Roscommon", "Sligo", "Carlow", "Dublin", "Kildare", "Kilkenny", "Laois", "Longford", "Louth", "Meath", "Offaly", "Westmeath", "Wexford", "Wicklow", "Clare", "Cork", "Kerry", "Limerick", "Tipperary", "Waterford");
        searchBy.getItems().addAll("Politician Name A-Z", "Election Year 2020-1990");
        politicianPreviousPartyList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        politicianPreviousPartyList.getItems().addAll("Fianna Fail", "Sinn Fein", " Fine Gael", "Green Party", "Labour Party", "Social Democrats", "Solidarity–People Before Profit", "Aontú Right To Change", "Independents", "Human Dignity Alliance", "Workers and Unemployed Action", "Workers Party", "Republican", "Independent Left", "Other");
    }


    public void addPolitician(ActionEvent actionEvent) {
        hash.politicianHashFunction(readInPolitician(), hash.politiciansArray);
    }

    public void deletePolitician(ActionEvent actionEvent) {
      Politician politicianToBeDeleted =  hash.findPoliticianKey(readInPolitician().getPoliticianName());
      politicianToBeDeleted.setPoliticianCurrentParty(null);
      politicianToBeDeleted.setPoliticianCounty(null);
      politicianToBeDeleted.setPoliticianName(null);
      politicianToBeDeleted.setPoliticianDOB(null);
      politicianToBeDeleted.setPoliticianPreviousParty(null);
      politicianToBeDeleted.setPoliticianImage(null);
    }


    public void updatePolitician(ActionEvent actionEvent) {
        Politician politicianToBeUpdated =  hash.findPoliticianKey(readInPolitician().getPoliticianName());
        politicianToBeUpdated.setPoliticianCurrentParty(politicianCurrentPartyChoice.getValue().toString());
        politicianToBeUpdated.setPoliticianCounty(politicianCountyChoice.getValue().toString());
        politicianToBeUpdated.setPoliticianName(politicianName.getText());
        politicianToBeUpdated.setPoliticianDOB(politicianDOB.getText());
        politicianToBeUpdated.setPoliticianPreviousParty(politicianPreviousPartyList.getAccessibleText());
        politicianToBeUpdated.setPoliticianImage(politicianImage.getText());
    }





    public void addElection(ActionEvent actionEvent) {
        hash.electionHashFunction(readInElection(), hash.electionsArray);
    }

    public void deleteElection(ActionEvent actionEvent) {
      Election electionToBeDeleted =  hash.findElectionKey(readInElection().getElectionType());
        electionToBeDeleted.setElectionDate(null);
        electionToBeDeleted.setElectionLocation(null);
        electionToBeDeleted.setElectionType(null);
        electionToBeDeleted.setNumSeats(-1);
    }

    public void updateElection(ActionEvent actionEvent) {
        Election electionToBeUpdated =  hash.findElectionKey(readInElection().getElectionType());
        electionToBeUpdated.setElectionDate(electionDate.getText());
        electionToBeUpdated.setElectionLocation(electionLocation.getValue().toString());
        electionToBeUpdated.setElectionType(electionType.getValue().toString());
        electionToBeUpdated.setNumSeats(Integer.parseInt(electionSeats.getText()));
    }

    public Politician readInPolitician() {
        return new Politician(politicianName.getText(), politicianDOB.getText(), politicianCountyChoice.getValue().toString(), politicianCurrentPartyChoice.getValue().toString(), politicianPreviousPartyList.getAccessibleText(), politicianImage.getText());
    }

    public Election readInElection() {
        return new Election(electionType.getValue().toString(), electionLocation.getValue().toString(), electionDate.getText(), Integer.parseInt(electionSeats.getText()));
    }

    public Candidate readInCandidate() {
        Politician chosenPolitician = hash.findPoliticianKey(candidateElectionChoice.getValue().toString());
        return new Candidate(chosenPolitician, Integer.parseInt(candidateVotes.getText()));
    }


    public void addCandidate(ActionEvent actionEvent) {

    }

    public void deleteCandidate(ActionEvent actionEvent) {
    }


    public void updateCandidate(ActionEvent actionEvent) {
    }


    public void previewImage(ActionEvent actionEvent) {
        String URL = politicianImage.getText();
        Image preView = new Image(URL);
        preViewImage.setImage(preView);
    }



    public void searchBy(ActionEvent actionEvent) {
    }

    public void searchPolitician(ActionEvent actionEvent) {
    }

    public void searchElection(ActionEvent actionEvent) {
    }


    /**
     * Completely resets the warehouse layout
     */
    public void reset(ActionEvent actionEvent) throws Exception {
        hash.fillPolitician();
        hash.fillElection();
        hash.saveElections();
        hash.savePoliticians();
    }

    public void save(ActionEvent actionEvent) throws Exception {
        hash.savePoliticians();
        hash.saveElections();
        hash.saveCandidates();
    }

    public void load(ActionEvent actionEvent) throws Exception {
        hash.loadElections();
        hash.loadPoliticians();
        hash.loadCandidates();
    }

}
