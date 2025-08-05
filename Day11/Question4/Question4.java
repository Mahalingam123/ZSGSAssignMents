package Question4;

/*
4. Write a Java program to append a text read from the user
 to an existing file without overwriting the original content.
 */

import java.io.*;

public class Question4
{
    public static void main(String[] args) {

        System.out.println(readWrite(" \nHelo hi how are you","./Question4/file.file")?"Successfully Written":"Mot Successfully");

    }

    public static boolean readWrite(String msg, String writingFile)
    {
        try(PrintWriter p=new PrintWriter(new FileWriter(writingFile,true))) {

                p.println(msg);
        }
        catch (IOException e) {
            return false;
        }

        return true;
    }

}
