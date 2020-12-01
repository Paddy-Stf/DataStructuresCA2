package sample;

import java.util.Arrays;

public class Hash {

    int politicianCurrentSize = 0;
    int politicianArraySize = 31;
    Politician[] politiciansArray = new Politician[politicianArraySize];

    int electionCurrentSize = 0;
    int electionArraySize = 31;
    Election[] electionsArray = new Election[electionArraySize];





    public void politicianHashFunction(Politician politician, Politician[] politiciansArray) {


        int pHashIndex = -1;


            for (int i = 0; i < politician.getPoliticianName().length(); i++) {
                pHashIndex = pHashIndex + politician.getPoliticianName().charAt(i);

            }
        pHashIndex = pHashIndex % politicianArraySize;

            System.out.println("Modulus Index= " + pHashIndex + " for value " + politician);

            while (politiciansArray[pHashIndex] != null) {

                ++pHashIndex;

                System.out.println("Collision Try " + pHashIndex + " Instead");

                // If we get to the end of the array go back to index 0

                pHashIndex %= politicianArraySize;

            }
            politiciansArray[pHashIndex] = politician;
            politicianCurrentSize++;
            reHashPolitician();
        }


    public void reHashPolitician() {

        if (politicianCurrentSize/politicianArraySize > 0.75) {

            Politician[] temp = politiciansArray;
            politicianArraySize=politicianArraySize+15;
            politiciansArray = new Politician[politicianArraySize];
            fillPolitician();
            politicianCurrentSize = 0;

            for(int i = 0; i < temp.length; i++){
                politiciansArray[i]= temp[i];
            }

        }

    }





    public Politician findPoliticianKey(String key) {
        int hashIndex = -1;
        // Find the keys original hash key
        for (int i = 0; i < key.length(); i++) {
            hashIndex = hashIndex + key.charAt(i);
            politicianCurrentSize++;
        }
        int arrayIndexHash = hashIndex % 31;

        while (politiciansArray[arrayIndexHash] != null) {
            if (politiciansArray[arrayIndexHash].getPoliticianName().equals(key)) {
                // Found the key so return it
                System.out.println(key + " was found in index " + arrayIndexHash);
                return politiciansArray[arrayIndexHash];
            }
            // Look in the next index
            ++arrayIndexHash;
            // If we get to the end of the array go back to index
            arrayIndexHash %= politicianArraySize;
        }
        // Couldn't locate the key
        return null;
    }

    public void fillPolitician(){
        Politician p = null;
        Arrays.fill(politiciansArray, p);
    }

/////////////////// ELECTION HASH FUNCTION ETC.

    public void electionHashFunction(Election election, Election[] electionsArray) {


        int eHashIndex = -1;


        for (int i = 0; i < election.getElectionType().length(); i++) {
            eHashIndex = eHashIndex + election.getElectionType().charAt(i);

        }
        eHashIndex = eHashIndex % electionArraySize;

        System.out.println("Modulus Index= " + eHashIndex + " for value " + election);

        while (electionsArray[eHashIndex] != null) {

            ++eHashIndex;

            System.out.println("Collision Try " + eHashIndex + " Instead");

            // If we get to the end of the array go back to index 0

            eHashIndex %= electionArraySize;

        }
        electionsArray[eHashIndex] = election;
        electionCurrentSize++;
        reHashElection();
    }


    public void reHashElection() {

        if (electionCurrentSize/electionArraySize > 0.75) {

            Election[] temp = electionsArray;
            electionArraySize=electionArraySize+15;
           electionsArray  = new Election[electionArraySize];
            fillElection();
            electionCurrentSize = 0;

            for(int i = 0; i < temp.length; i++){
                electionsArray[i]= temp[i];
            }

        }

    }





    public Election findElectionKey(String key) {
        int hashIndex = -1;
        // Find the keys original hash key
        for (int i = 0; i < key.length(); i++) {
            hashIndex = hashIndex + key.charAt(i);
            electionCurrentSize++;
        }
        int arrayIndexHash = hashIndex % 31;

        while (electionsArray[arrayIndexHash] != null) {
            if (electionsArray[arrayIndexHash].getElectionType().equals(key)) {
                // Found the key so return it
                System.out.println(key + " was found in index " + arrayIndexHash);
                return electionsArray[arrayIndexHash];
            }
            // Look in the next index
            ++arrayIndexHash;
            // If we get to the end of the array go back to index
            arrayIndexHash %= electionArraySize;
        }
        // Couldn't locate the key
        return null;
    }

    public void fillElection(){
        Election p = null;
        Arrays.fill(politiciansArray, p);
    }


}