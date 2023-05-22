import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        Area sampleRectangle = new Area(); 

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("enter length:");
        int length = myObj.nextInt();  // Read user input
        //System.out.print(myObj);; 

        System.out.print("enter breadth:");
        int breadth = myObj.nextInt();  // Read user input
         
        //System.out.print(myObj);; 

        
        sampleRectangle.setDim(length, breadth);
        System.out.print("Area is:");
        System.out.println(sampleRectangle.getArea());
        

    }

}
