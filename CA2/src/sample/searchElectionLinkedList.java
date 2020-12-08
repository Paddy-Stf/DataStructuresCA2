package sample;

public class searchElectionLinkedList {
   electionNode electionHead;


    public void addElection(Election e) {
        electionNode ne = new electionNode();
        ne.setContents(e);
        ne.next = electionHead;
        electionHead = ne;
    }

    public String printElectionList() {
        electionNode temp = electionHead;
        String electionList = "LinkedList + \n ";

        while (temp != null) {
            electionList += temp.getContents().getElectionType();
            temp = temp.next;
        }
        return electionList;
    }
}
