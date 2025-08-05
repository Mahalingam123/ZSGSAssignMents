package Question2;/*
2. Write a Menu driven Java program
a) to read content from the user and write it into another file and b) from the file to another file
c) to modify the content of a file
d) to search for a particular
word in a file and display how many times it
appears
e) read the content(List of Electronic Products) of a .txt file
and copy them to the .csv file.

 */

import java.io.*;

public class Question2 {

    public static void main(String[] args) {

        //a) to read content from the user and write it into another file

        System.out.println(readWrite("./Question2/User.txt","./Question2/writeFile1.txt")?"Read success and Writed Successfully":"Not SuccessFully");

        // b )from the file to another file

        System.out.println(readWrite("./Question2/writeFile1.txt","./Question2/writeFile2.txt")?"Read success from writed file and write to new file" +
                " Successfully":"Not SuccessFully");

        //to modify the content of a file

        String modify ="\nHi  how are you ";

        System.out.println(modifyFile("./Question2/User.txt",modify)?"Successfully Modified ":"Not Successfully");

  //d) to search for a particular  word in a file and display how many times it  appears

        int cnt=readFileWordCount("./Question2/User.txt","file");

        System.out.println("The Word  file occur in "+cnt +" times");

//e) read the content(List of Electronic Products) of a .txt file
// and copy them to the .csv file.

   System.out.println(readWriteCsv("./Question2/elecpro.txt","./Question2/Product.csv") ?"Csv writed Successfully":"Not Succesfully");

    }




    public static boolean readWrite(String readingFile, String writingFile) {

      try(  PrintWriter p=new PrintWriter(new FileWriter(writingFile));

        BufferedReader bf=new BufferedReader(new FileReader(readingFile))) {

          String line;

          while ((line = bf.readLine()) != null) {
              p.println(line);

          }
      } catch (IOException e) {
          return false;
      }

return true;
    }




    public static  boolean modifyFile(String  writeFile,String modifyWords)
    {
        try (PrintWriter p=new PrintWriter(new FileWriter(writeFile,true))){

            p.println(modifyWords);

        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }



    public  static int readFileWordCount(String path,String word)
    {
     try {
         BufferedReader bf = new BufferedReader(new FileReader(path));

         String line;

         int cnt = 0;

         while ((line = bf.readLine()) != null) {
             String[] A = line.split("\\s+");

             for (String s : A) {
                 if (s.equals(word)) {
                     cnt++;
                 }
             }

         }
         bf.close();
         return cnt;
     }
     catch (Exception e)
     {
         return -1;
     }


    }




    public static boolean readWriteCsv(String readFile,String write)
    {
        try(  PrintWriter p=new PrintWriter(new FileWriter(write));

              BufferedReader bf=new BufferedReader(new FileReader(readFile))) {

            String line;

            while ((line = bf.readLine()) != null) {

                String A[]=line.split("\\s+");

                for(int i=0;i<A.length;i++)
                {
                    if(i==A.length-1)
                    {
                        p.print(A[i]);
                    }
                    else{
                        p.println(A[i]+",");
                    }
                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

}
