package sample;

public class searchPoliticianLinkedList {

    public searchPoliticianLinkedList() {
        this.politicianHead = null;
    }

    public politicianNode politicianHead;

    public void addPolitician(Politician e) {
        politicianNode np = new politicianNode();
        np.setContents(e);
        np.next = politicianHead;
        politicianHead = np;
    }

}
