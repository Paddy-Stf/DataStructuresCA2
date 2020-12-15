package sample;

public class politicianNode {


    public politicianNode next=null;
    private Politician contents;

    public Politician getContents(){
        return  contents;
    }
    public void setContents( Politician c){
        contents=c;
    }
}
