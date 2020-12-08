package sample;

public class searchPoliticianLinkedList {
    politicianNode politicianHead;


    public void addPolitician(Politician e) {
        politicianNode np = new politicianNode();
        np.setContents(e);
        np.next = politicianHead;
        politicianHead = np;
    }

    public String printPoliticianList() {
        politicianNode temp = politicianHead;
        String politicianList = "LinkedList + \n ";

        while (temp != null) {
            politicianList += temp.getContents().getPoliticianName();
            temp = temp.next;
        }
        return politicianList;
    }
}
