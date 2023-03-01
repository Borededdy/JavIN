package javin;

//Imports
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class JavIN {
    //Making of Objects
    static Scanner sc = new Scanner(System.in);
    static Date date = new Date();
    //The Date format is the US Standard one, change it if you need to.
    static SimpleDateFormat SDF = new SimpleDateFormat("MM-dd-yyyy");
    
    //Default constructor
    public JavIN (){}
    
    //Input method for INT Var
    public static int inINT(){
        int data = 0;
        try{
            data = sc.nextInt();
        }catch(Exception e){
            System.err.println("Error 101: bad input. for more info check wiki");
        } 
        return data;
    }
    
    //Input method for DOUBLE Var
    public static double inDOUBLE(){
        double data = 0.0;
        try{
            data = sc.nextDouble();
        }catch(Exception e){
            System.err.println("Error 101: bad input. for more info check wiki");
        }
        return data;
    }
    
    //Input method for FLOAT Var
    public static float inFLOAT(){
        float data = 0;
        try{
            data = sc.nextFloat();
        }catch(Exception e){
            System.err.println("Error 101: bad input. for more info check wiki");
        }
        return data;
    }
    
    //Input method for STRING Var
    public static String inSTR(){
        String data;
        data = sc.nextLine();
        return data;
    }
    
    //Input method for BOOLEAN Var
    public static boolean inBOOL(){
        boolean data;
        data = sc.nextBoolean();
        return data;
    }
    
    //Input metod for DATE
    public static String inDATE(){
        String dataIN = sc.nextLine();
        try{
            date = SDF.parse(dataIN);
        }catch(ParseException ex){
            System.err.println("Error 104: Bad date format. For more info check wiki");
        }
        return dataIN;
    }
}