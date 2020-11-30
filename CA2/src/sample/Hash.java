package sample;

import java.util.Arrays;

public class Hash {

    int currentSize = 0;
    int arraySize = 31;
    Politician[] thePoliticians = new Politician[arraySize];


    public void politicianHashFunction(Politician politician, Politician[] thePoliticians) {



        int hashIndex= -1;

        Politician newPolitician = politician;


        for (int i = 0; i < politician.getPoliticianName().length(); i++) {
            hashIndex = hashIndex + politician.getPoliticianName().charAt(i);
            currentSize++;
        }
        hashIndex=hashIndex % 31;

        System.out.println("Modulus Index= " + hashIndex + " for value " + politician);
    }




}
