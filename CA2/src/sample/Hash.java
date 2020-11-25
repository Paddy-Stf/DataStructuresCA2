package sample;

public class Hash {

    Politician[] thePoliticians = null;
    int arraySize;
    int itemsInArray = 0;


    public void politicianHashFunction(Politician politician, Politician[] thePoliticians) {

        int hashIndex = -1;

        Politician newPolitician = politician;
        String s = newPolitician.getPoliticianName();

        int k = 31;
        for (int i = 0; i < s.length(); i++) {
            hashIndex =  hashIndex + s.charAt(i);
        }
        hashIndex=hashIndex%k;

        System.out.println("Modulus Index= " + hashIndex + " for value " + newPolitician);

        // Cycle through the array until we find an empty space

        while (thePoliticians[hashIndex] != null) {
            ++hashIndex;

            System.out.println("Collision Try " + hashIndex + " Instead");

            // If we get to the end of the array go back to index 0
            hashIndex %= arraySize;

        }

        thePoliticians[hashIndex] = newPolitician;


    }

    public void displayTheStack() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {

            increment += 10;

            for (int n = 0; n < 71; n++)

                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {
                System.out.format("| %3s " + " ", n);
            }
            System.out.println("|");

            for (int n = 0; n < 71; n++)

                System.out.print("-");
            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                if (thePoliticians[n] == null)

                    System.out.print("|      ");

                else
                    System.out.print(String.format("| %3s " + " ", thePoliticians[n]));

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)

                System.out.print("-");

            System.out.println();
        }
    }


}
