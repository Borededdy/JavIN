package //!! Insert the name of your package here !!;

//Imports
import java.util.Scanner;

public class JavIN {
    //Making of Objects
    Scanner sc = new Scanner(System.in);
    
    //Default constructor
    public JavIN (){}
    
    //Input method for INT Var
    public int inINT(){
        int data = 0;
        try{
            data = sc.nextInt();
        }catch(Exception e){
            System.err.println("Error 101: bad input. for more info check wiki");
        } 
        return data;
    }
    
    //Input method for DOUBLE Var
    public double inDOUBLE(){
        double data = 0.0;
        try{
            data = sc.nextDouble();
        }catch(Exception e){
            System.err.println("Error 101: bad input. for more info check wiki");
        }
        return data;
    }
    
    //Input method for FLOAT Var
    public float inFLOAT(){
        float data = 0;
        try{
            data = sc.nextFloat();
        }catch(Exception e){
            System.err.println("Error 101: bad input. for more info check wiki");
        }
        return data;
    }
    
    //Input method for STRING Var
    public String inSTR(){
        String data;
        data = sc.nextLine();
        return data;
    }
    
    //Input method for BOOLEAN Var
    public boolean inBOOL(){
        boolean data;
        data = sc.nextBoolean();
        return data;
    }
}
