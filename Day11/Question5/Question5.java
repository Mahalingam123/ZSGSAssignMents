package Question5;
/*
5. Design a Java application to manage a product inventory system using file
 handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and
write the object to a file (products.dat).
--->View All Products: Read all product objects
from the file and display them.
--->Search Product by ID: Search for a product by productId
in the file and display its details if found.
--->Update Product: Locate a product in the file using the
ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file
 by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object
 serialization and deserialization are handled safely and efficiently.
 */

import java.io.*;
import java.util.ArrayList;


class Product implements Serializable
{

    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity)
    {
        this.productId = productId;

        this.name = name;

        this.price = price;

        this.quantity = quantity;
    }

    public Product(Product p)
    {
        this.name=p.name;

        this.price=p.price;

        this.quantity=p.quantity;

        this.productId=p.productId;

    }

    void display()
    {
        System.out.println("Product  Details ... \n");

        System.out.println("Product      Id= "+productId+" \n");

        System.out.println("Product    Name = "+name +"\n");

        System.out.println("Product   Price = "+price +"\n");

        System.out.println("Product  Quantity = "+quantity +"\n");
    }



}

class MainProduct
{

    public static void main(String[] args) {

        Product p=new Product(121,"KeyBoard",1200,10);

        Product p1=new Product(122,"Mouse",1400,10);

        Product p2=new Product(123,"Laptop",140000,10);

        Product p3=new Product(124,"Mobile",14000,10);

        //Adding to file

       ArrayList<Product> lists=new ArrayList<>();

       lists.add(p);  lists.add(p1);  lists.add(p2);  lists.add(p3);

       Add(false,lists);

         // Reading File

        System.out.println("----------------------------------Reading File ----------------------------------------");

        try
        {
            ArrayList<Product> product = read("./Question5/Product.ser");

            for(Product obj:product)
            {
                obj.display();
            }

        }
        catch (IOException  | ClassNotFoundException e)
        {
            System.out.println("Exception Occur \n\n");

            e.printStackTrace();
        }



        System.out.println("---------------------Searching Product and PID is 122---------------------------------------");

        try {

            System.out.println("The product id is 122");

            Product ser = readAndSearch("./Question5/Product.ser", 122);

            ser.display();

        } catch (IOException |ClassNotFoundException e) {

            e.printStackTrace();
        }

        System.out.println("----------Update Product Price and Quantity to product id is  123------------");

        try{
          if(updateProd("./Question5/Product.ser",123,1200000,20))
          {
              try
              {
                  ArrayList<Product> product = read("./Question5/Product.ser");

                  for(Product obj:product)
                  {
                      obj.display();
                  }

              }
              catch (IOException  | ClassNotFoundException e)
              {
                  System.out.println("Exception Occur ");
              }
          }
          else{
              System.out.println("Updation Failed");
          }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("_______________________________Delete Product______________________________");

        if(DeleteProd("./Question5/Product.ser",124))
        {
            System.out.println("---------------After Delete   ----------------\n\n");

            try
            {
                ArrayList<Product> product = read("./Question5/Product.ser");

                for(Product obj:product)
                {
                    obj.display();
                }

            }
            catch (IOException  | ClassNotFoundException e)
            {
                System.out.println("Exception Occur ");
            }
        }

    }

    public static boolean Add(boolean append,ArrayList<Product> list)
    {

        try(FileOutputStream file=new FileOutputStream("./Question5/Product.ser",append);
        ObjectOutputStream out =new ObjectOutputStream(file))
        {
            for(Product p:list) {

                out.writeObject(p);
            }
        }
        catch(IOException e)
        {
            return  false;
        }

        return true;

    }



    public static ArrayList<Product> read(String fileName) throws IOException,ClassNotFoundException
   {

       try(FileInputStream file=new FileInputStream(fileName);
         ObjectInputStream input=new ObjectInputStream(file)  )
       {
           ArrayList<Product> list=new ArrayList<>();

         try {
             while (true) {
                 Product p = (Product) input.readObject();

                 list.add(new Product(p));

             }
         }
         catch (EOFException e)
         {
             return list;
         }

       }

   }

    public static Product readAndSearch(String fileName,int id) throws IOException,ClassNotFoundException
    {
        Product p=null;

        try(FileInputStream file=new FileInputStream(fileName);
            ObjectInputStream input=new ObjectInputStream(file)  )
        {
            try {
                while (true) {
                    p = (Product) input.readObject();

                    if(p.productId==id)
                    {
                        return p;
                    }

                }
            }
            catch (EOFException e)
            {
                throw new EOFException("Not  Available ");
            }

        }


    }

public static  boolean  updateProd(String fileName,int id,int  newQuantity,int newPrice)
{

    try {

        ArrayList<Product> list = read(fileName);

        ArrayList<Product>updated=new ArrayList<>();

        for(Product p:list)
        {
            if(p.productId==id)
            {
                p.price=newPrice;

                p.quantity=newQuantity;

            }
            updated.add(p);

        }

        Add(false,list);


        return true;

    } catch (Exception e) {

        return false;
    }

}

    public static  boolean  DeleteProd(String fileName,int id)
    {

        try {

            boolean b=false;

            ArrayList<Product> list = read(fileName);

            ArrayList<Product>updated=new ArrayList<>();

            for(Product p:list)
            {
                if(p.productId==id)
                {
                    continue;
                }

                updated.add(p);

            }

          Add(false,updated);

            return true;

        } catch (Exception e) {

            return false;
        }

    }






}
