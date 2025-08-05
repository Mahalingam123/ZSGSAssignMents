package Question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//1. Write a Java program to read the contents of a text file and display it on the console.

public class Question1 {
    public static void main(String[] args) {

        try {
            readFile("./Questions");
        }
        catch (IOException e) {

            System.out.println("Exception Occur");
        }

    }
    public  static void  readFile(String path) throws IOException
    {
        BufferedReader bf=new BufferedReader(new FileReader(path));

        String line;

         while((line= bf.readLine())!=null)
         {
             System.out.println(line+"\n");
         }

         bf.close();


    }
}
