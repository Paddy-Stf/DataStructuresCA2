package sample;

public class electionNode {
    public electionNode next=null;
    private Election contents;

    /**Creates a list of  shelves  and connects it to a aisle */


    public Election getContents(){
        return  contents;
    }
    public void setContents( Election c){
        contents=c;
    }


}