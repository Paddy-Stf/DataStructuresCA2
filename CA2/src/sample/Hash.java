package sample;

import java.util.Arrays;

public class Hash {

    Politician[] thePoliticians;

    int arraySize;

    public void politicianHashFunction(Politician politician, Politician[] thePoliticians) {



        int hashIndex= -1 ;

        Politician newPolitician = politician;


        for (int i = 0; i < politician.getPoliticianName().length(); i++) {
            hashIndex = hashIndex + politician.getPoliticianName().charAt(i);
        }
        hashIndex=hashIndex % 30;


        System.out.println("Modulus Index= " + hashIndex + " for value " + politician);


    }




}
