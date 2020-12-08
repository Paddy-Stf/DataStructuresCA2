package sample;

public class politicianNode {
    public politicianNode next=null;
    private Politician contents;

    /**Creates a list of  shelves  and connects it to a aisle */
    searchPoliticianLinkedList PLL =new searchPoliticianLinkedList();

    public Politician getContents(){
        return  contents;
    }
    public void setContents( Politician c){
        contents=c;
    }




    public searchPoliticianLinkedList getPLL() {
        return PLL;
    }
}
