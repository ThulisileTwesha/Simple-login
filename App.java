import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
//class with functions or methods
class log{
    //login method
    static void getNames(){
        System.out.println("Welcome to Thuli's system");
        System.out.println("Login or Sign up");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to Sign up");
        Scanner option = new Scanner(System.in);
        System.out.println("Enter your options: ");
        int optionNum = option.nextInt();
        System.out.println(optionNum);
        if(optionNum == 1){
            login();
        }else if(optionNum == 2){
            register();
        }
        option.close();
    }
    static void login(){
        Scanner Reader = new Scanner(System.in);
        System.out.println("Enter your Email: ");
        String email = Reader.nextLine();
        System.out.println(email);
        System.out.println("Enter your password: ");
        String password = Reader.nextLine();
        System.out.println(password);
        Reader.close();
        //if all correct call another method 
    }
    static void register(){
        Scanner user= new Scanner(System.in);
        System.out.println("Enter your firstName: ");
        String firstName = user.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = user.nextLine();

        System.out.println("Enter your dateOfBirth YYYY/MM/DD: ");
        String dateOfBirth = user.nextLine();

        System.out.println("Enter your gender: ");
        String gender = user.nextLine();

        System.out.println("Enter your Email: ");
        String email = user.nextLine();
        System.out.println("Enter your password: ");
        String password = user.nextLine();
        reg(firstName,lastName,dateOfBirth,gender,email,password);
       //Output for registering
       
       user.close();
    }

    static void reg(String firstName,String lastName,String dateOfBirth,String gender,String email, String password){
        //write here thuli
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(firstName + " " + lastName + " " + dateOfBirth + " " + gender + " " + email + " " + password);
            myWriter.close();
    
        } catch (IOException e) {
                System.out.println("An error occurred while writing");
                e.printStackTrace();
        
        }
        System.out.println("successfully registered");
        System.out.println("going to Log In");
        login();

    }
}


class mainPro{
    static void hello(){
        System.out.println("Done ");
    }
}



public class App{
    public static void main(String[] args){
        
        log obj = new log();
        obj.getNames();
        
    }
}


                         