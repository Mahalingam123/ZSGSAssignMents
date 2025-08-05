package Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
3. Write a Java program that reads a file and prints the number of lines,
words, and characters.
 */
public class Question3 {

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

            int cnt=0;

            int charCnt=0;

            int wordCount=0;

            while((line= bf.readLine())!=null)
            {

                String []A=line.split("\\s+");

                wordCount+=A.length;

                for(String s:A)
                {
                    charCnt+=s.length();
                }

                cnt++;


            }

            bf.close();

            System.out.println("Word Count = "+wordCount);

            System.out.println("Character count = "+charCnt);

            System.out.println("line count = "+cnt);


        }
    }



