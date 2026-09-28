import java.io.*;
public class Main {
    public static void main(String[] args) {
        try{
           FileWriter writer=new FileWriter("Student.txt");
           writer.write("Name : PremKumar\n");
           writer.write("Age : 22\n");
           writer.write("Branch : Computer Science Engineering\ngit ");
           writer.close();
            System.out.println("Successfully information is written into File");

        }catch(IOException p){
            System.out.println("An error occurred");
        }
    }
}