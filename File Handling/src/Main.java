import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
            File file=new File("Student info.txt");
            if(file.createNewFile()){
                System.out.println("Successfully Create the file");
            }
            else{
                System.out.println("File Already Exist");
            }
        }catch(IOException p){
            System.out.println("An error occurred");
        }
    }
}