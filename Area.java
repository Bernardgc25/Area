

public class Area {

    public int length; 
    public int breadth; 
    
    public Area(){

    }
    
    public void setDim(int length, int breadth){
        this.length = length; 
        this.breadth = breadth; 
    }

    public int getArea(){
        return length * breadth; 

    }


}