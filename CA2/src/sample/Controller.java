package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.Arrays;

public class Controller {


       Hash hash = new Hash();


    @FXML
    public TextField politicianName;
    @FXML
    public TextField politicianDOB;
    @FXML
    public TextField politicianImage;
    @FXML
    public Button addPoliticianButton;
    @FXML
    public ChoiceBox politicianCountyChoice;
    @FXML
    public Button imagePreviewButton;
    @FXML
    public ChoiceBox politicianCurrentPartyChoice;
    @FXML
    public TextField electionDate;
    @FXML
    public ChoiceBox electionType;
    @FXML
    public TextField electionSeats;
    @FXML
    public Button addElectionButton;
    @FXML
    public ChoiceBox electionLocation;
    @FXML
    public ChoiceBox candidateElectionChoice;
    @FXML
    public ListView politicianPreviousPartyList;
    @FXML
    public TextField candidateVotes;
    @FXML
    public Button addCandidateButton;
    @FXML
    public Button updatePoliticianButton;
    @FXML
    public Button updateElectionButton;
    @FXML
    public Button updateCandidateButton;
    @FXML
    public Button deletePoliticianButton;
    @FXML
    public Button deleteElectionButton;
    @FXML
    public Button deleteCandidateButton;
    @FXML
    public AnchorPane searchElectionButton;
    @FXML
    public ChoiceBox searchElectionYear;
    @FXML
    public ChoiceBox searchElectionType;
    @FXML
    public TextField politicianNameSearch;
    @FXML
    public ChoiceBox searchPoliticianParty;
    @FXML
    public ChoiceBox searchPoliticianLocation;
    @FXML
    public Button searchPoliticianButton;
    @FXML
    public ListView viewAll;
    @FXML
    public TreeView drillDownTreeView;
    @FXML
    public ChoiceBox searchChoicebox;
    @FXML
    public Button save;
    @FXML
    public Button load;
    @FXML
    public Button reset;


     public  void addPolitician(ActionEvent actionEvent){
         System.out.println("button works");
         Politician politician = new Politician("j", "2/11/2111", "ggggggg" , "ffffffffff", "fine gael", "sinn hhhh", "78y74fh4fh4hfh4fhfhfhfhfhfhf");
         Politician politician2 = new Politician("john", "2/11/2111", "ggggggg" , "ffffffffff", "fine gael", "sinn hhhh", "78y74fh4fh4hfh4fhfhfhfhfhfhf");
         Politician politician3 = new Politician("michael", "2/11/2111", "ggggggg" , "ffffffffff", "fine gael", "sinn hhhh", "78y74fh4fh4hfh4fhfhfhfhfhfhf");


         hash.fill(hash.politiciansArray);
         hash.politicianHashFunction(politician, hash.politiciansArray);
         hash.politicianHashFunction(politician3, hash.politiciansArray);
         hash.politicianHashFunction(politician2, hash.politiciansArray);




     }





}
