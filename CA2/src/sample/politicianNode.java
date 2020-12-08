package sample;

public class politicianNode {

    searchPoliticianLinkedList PLL = new searchPoliticianLinkedList();
    public politicianNode next;
    private Politician contents;

    public Politician getContents(){
        return  contents;
    }
    public void setContents( Politician c){
        contents=c;
    }

}
