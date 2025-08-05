
import java.util.*;
import java.util.Map.Entry;

/*Day-10 Assignment Questions:
1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.*/
class Question1 {

    public static void main(String[] args) {

        System.out.println( "\nto create a new array list, add some colours (string) and print out the collection\n");

        ArrayList<String> list=new ArrayList<>();

        list.add("black");

        list.add("blue");

        list.add("red");

        System.out.println("After Adding == "+list);

       //b. to iterate through all elements in an array list.

        System.out.println("\nto iterate through all elements in an array list.\n");

        for(int i=0;i<list.size();i++)
        {
            System.out.println("Color "+(i+1)+" "+list.get(i));
        }

       //c. to insert an element into the array list at the first position.

        System.out.println("\nto insert an element into the array list at the first position.\n");

        list.addFirst("green");

        System.out.println("After Adding = "+list);


        //d. to retrieve an element (at a specified index) from a given array list.

        System.out.println("\nto retrieve an element (at a specified index) from a given array list. \n");

        System.out.println("The Element  at Position 2  = "+list.get(2));

        //e. to update specific arraylist element by given element.

        System.out.println("\nto update specific arraylist element by given element  .\n");

        System.out.println("Before update  = "+list);

         list.set(3,"Yellow");

        System.out.println("After update  = "+list);

         //f. to remove the third element from an array list.

        System.out.println("\nto remove the third element from an array list.\n");

        System.out.println("Before update  = "+list);

        list.remove(3);

        System.out.println("After update  = "+list);

        //to search an element in an array list.

        System.out.println("\nto search an element in an array list.\n");

        System.out.println("Searching blue "+ list);

        if(list.contains("blue"))
        {
            System.out.println("Found ");
        }
        else{
            System.out.println("Not Found ");
        }

        // to sort a given array list.

        System.out.println("\nto sort a given array list.");

        Collections.sort(list);

        System.out.println("After update  = "+list);

//to copy one array list into another.

        System.out.println("to copy one array list into another.\n");

        System.out.println( " Original  = " +list);

        ArrayList<String> copyList=new ArrayList<>(list);

        System.out.println( " Copy  = " +copyList +"\n");


//j. to shuffle elements in an array list.

        System.out.println("\nto shuffle elements in an array list.\n");

        System.out.println( " Original  = " +list+"\n");

        Collections.shuffle(list);

        System.out.println( " Shuffled  = " +list+"\n");
    }

}
/*
2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
‌
 */

class Question2{
    public static void main(String[] args) {

        //a. append the specified element to the end of a linked list.

        System.out.println("\nAppend the specified element to the end of a linked list. \n");

        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.addLast("one");
        linkedList.addLast("two");
        linkedList.addLast("three");
        linkedList.addLast("four");
        linkedList.addLast("five");
        linkedList.addLast("six");

        System.out.println("After Adding = "+linkedList);

        //b. iterate through all elements in a linked list.

        System.out.println("\niterate through all elements in a linked list.\n");

        Iterator <String> it= linkedList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

//c. iterate through all elements in a linked list starting at the specified position.

        System.out.println("\niterate through all elements in a linked list starting at the specified position.\n");

     for(int i=3;i<linkedList.size();i++)
     {
         System.out.println("Element  = "+linkedList.get(i));
     }

     //d. iterate a linked list in reverse order.

        System.out.println("\niterate a linked list in reverse order.\n");

        for(int i=linkedList.size()-1;i>=0;i--)
        {
            System.out.println("Element  = "+linkedList.get(i));
        }

   //e. insert the specified element at the specified position in the linked list.

        System.out.println("\ninsert the specified element at the specified position in the linked list.\n");

        linkedList.add(2,"hundred");

        System.out.println("Before Adding = "+linkedList);

        System.out.println("After Adding = "+linkedList);

      //h. insert the specified element at the end of a linked list.

        System.out.println("\ninsert the specified element at the end of a linked list.\n");

        System.out.println("Adding in Zero in index 3");

        System.out.println("Before Adding = "+linkedList);

        linkedList.add(3,"zero");


        System.out.println("After Adding = "+linkedList);

    //j. get the first and last occurrence of the specified elements in a linked list

        System.out.println("\nget the first and last occurrence of the specified elements in a linked list\n");

        System.out.println("First Element = "+linkedList.getFirst()+"\n");

        System.out.println("Last Element = "+linkedList.getLast());


    }
}
/*
3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
 */

class Question3
{
    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();

        //a. append the specified element to the end of a hash set.

        System.out.println("\na. append the specified element to the end of a hash set.\n");

        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);

        System.out.println("After Adding = "+set);


        //b. iterate through all elements in a hash list.

        System.out.println("\niterate through all elements in a hash list\n");

        for(int a:set)
        {
            System.out.println("Element = "+a);
        }

        //c. get the number of elements in a hash set.

        System.out.println("\nget the number of elements in a hash set\n");

        System.out.println("The size of Set = "+set.size());

        //d. empty the hash set.
        System.out.println("\nempty the hash set.\n");

        System.out.println("Before Clear = "+set);

        set.clear();

        System.out.println("After Clear = "+set);


        //e. test a hash set is empty or not.
        System.out.println("\ntest a hash set is empty or not.\n");

        System.out.println("The Set = "+set);

        System.out.println(set.isEmpty()?"The Set is Empty":"Not Empty");


        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);

        //f. clone a hash set to another hash set.
        System.out.println("\nclone a hash set to another hash set.\n");

        System.out.println("Original set = "+set);

        HashSet<Integer> cloneSet=new HashSet<>(set);

        System.out.println("Clone set = "+cloneSet);

        // convert a hash set to an array.
        System.out.println("\nconvert a hash set to an array.\n");


        Integer[] A=new Integer[set.size()];

        set.toArray(A);

        System.out.println(Arrays.toString(A));

        // convert a hash set to tree set

        System.out.println("\nconvert a hash set to tree set\n");

        TreeSet<Integer> tree =new TreeSet<>(set);

        System.out.println("TreeSet = "+tree);


       // convert a hash set to a List/ArrayList.

        System.out.println("\nconvert a hash set to a List/ArrayList.\n");

        ArrayList<Integer> list=new ArrayList<>(set);

        System.out.println("List = "+list);

        //j. compare two hash set.

        System.out.println("\ncompare two hash set.\n");

     
       System.out.println(set.equals(cloneSet)?"Equal ":"Not Equal ");

    }
}

/*
4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
 */
class Question4{



    public static void main(String[] args) {
        //a. create a new tree set, add some colours (string) and print out the tree set.

        System.out.println("\ncreate a new tree set, add some colours (string) and print out the tree set.\n");

        TreeSet<String> color=new TreeSet<>();

        color.add("red");
        color.add("blue");
        color.add("black");
        color.add("white");
        color.add("violet");

        System.out.println(color);

        //b. iterate through all elements in a tree set.
        System.out.println("\n.iterate through all elements in a tree set.\n");

        for(String s:color)
        {
            System.out.println(s+"\n");
        }

        //c. add all the elements of a specified tree set to another tree set.
        System.out.println("\nadd all the elements of a specified tree set to another tree set.\n");

        TreeSet<String> set=new TreeSet<>();

        set.addAll(color);

        System.out.println("New Tree set = "+set);

       //d. create a reverse order view of the elements contained in a given tree set.

        System.out.println("\ncreate a reverse order view of the elements contained in a given tree set.\n");

       Object[] a=color.toArray();

      for(int i=a.length-1;i>=0;i--)
      {
        System.out.println(a[i] +" ");
      }       

        System.out.println("Reversed Order TreeSet");

//e. get the first and last elements in a tree set.
        System.out.println("\nget the first and last elements in a tree set.\n");

        LinkedHashSet<String> lSet=new LinkedHashSet<>(set);

        System.out.println("The Tree Set = "+lSet);

        System.out.println( "First Element  "+lSet.getFirst());

        System.out.println("Last Element "+lSet.getLast());

//f. clone a tree set list to another tree set.
        System.out.println("\nclone a tree set list to another tree set.\n");
   
     TreeSet<String> clonedSet=new TreeSet<>(color);

     System.out.println("Cloned  Set = "+clonedSet);

//g. get the number of elements in a tree set.
        System.out.println("\nget the number of elements in a tree set.\n");

    System.out.println("The Number of element = "+set.size());


    //h. compare two tree sets.
        System.out.println("\ncompare two tree sets.\n");

     System.out.println(clonedSet.equals(color)?"Equal ":"Not Equal");


     //i. find the numbers less than 7 in a tree set.
        System.out.println("\nfind the numbers less than 7 in a tree set.\n");

     TreeSet <Integer> number =new TreeSet<>();

     for(int i=0;i<10;i++)
     {
        number.add(i+1);
     }

    for(int s:number)
    {
       System.out.println(s<7?s:""); 
    }

  //j. get the element in a tree set which is greater than or equal to the given element.
        System.out.println("\nget the element in a tree set which is greater than or equal to the given element.\n");
      int givenElement=6;



   for(int num:number)
    {
       if(num>=givenElement){
        System.out.println("The element = "+num);
        break;
       } 
    }

    //k. get the element in a tree set which is less than or equal to the given element.

        System.out.println("\nget the element in a tree set which is less than or equal to the given element.\n");

     for(int d:number)
    {
       if(d<=givenElement){
        System.out.println("The element = "+d);
        break;
       } 
    }

    //l. get the element in a tree set which is strictly greater than or equal to the given element.
        System.out.println("\nget the element in a tree set which is strictly greater than or equal to the given element.\n");

     for(int n:number)
    {
       if(n>=givenElement){
        System.out.println("The element = "+n);
        break;
       } 
    } 

    //m. get an element in a tree set which is strictly less than the given element.
        System.out.println("\nget an element in a tree set which is strictly less than the given element.\n");

    for(int m:number)
    {
       if(m<=givenElement){
        System.out.println("The element = "+m);
        break;
       } 
    }

    //n. retrieve and remove the first element of a tree set.
        System.out.println("\n retrieve and remove the first element of a tree set.\n");

      int firstElemnt=number.getFirst();

      System.out.println("First Element = "+firstElemnt +" "+number);

      number.removeFirst();

      System.out.println("After = "+number);

  //0. retrieve and remove the Last element of a tree set.
        System.out.println("\nretrieve and remove the Last element of a tree set\n");

      int lastElemnt=number.getLast();

      System.out.println("Last Element = "+lastElemnt +" "+number);

      number.removeLast();

      System.out.println("After = "+number);



    }


}
/*5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue. */



class Question5{


    public static void main(String[] args) {
 

   //1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.     

  System.out.println("\ncreate a new priority queue, add some colors (string) and print out the elements of the priority queue.  \n");

   PriorityQueue<String> pq=new PriorityQueue<>();

   pq.add("Red");
   
   pq.add("blue");

   pq.add("violet");

   System.out.println("Queue =  "+pq +"\n");

//2. iterate through all elements in priority queue.
   System.out.println("\niterate through all elements in priority queue.\n");

   for(String a:pq)
   {
    System.out.println(a);
   }

   //3. add all the elements of a priority queue to another priority queue.
   System.out.println("\n3. add all the elements of a priority queue to another priority queue.\n");


   PriorityQueue<String> pq1 = new PriorityQueue<>();

   System.out.println("Before  Queue = "+pq1);

   pq1.addAll(pq);

   System.out.println("After  Queue = "+pq1);



  //4. insert a given element into a priority queue.
    System.out.println("\ninsert a given element into a priority queue.\n");

    System.out.println("Before added = "+pq);

    pq.add("pink");

    System.out.println("After added = "+pq+"\n");

 //5. remove all the elements from a priority queue.
     System.out.println("\nremove all the elements from a priority queue.\n");

     System.out.println("Before clear  = "+pq+"\n");

     pq.clear();

     System.out.println("After clear = "+pq+"\n");

//6. count the number of elements in a priority queue.
     System.out.println("\ncount the number of elements in a priority queue.\n");

     System.out.println("Number of Elemnt = "+pq1.size()+pq1+"\n");

  //7. compare two priority queues.
     System.out.println("\ncompare two priority queues.\n");

     System.out.println(pq.equals(pq1)?"Equal \n":"Not Equal \n");

  //8. retrieve the first element of the priority queue.
     System.out.println("\nretrieve the first element of the priority queue.\n");

     System.out.println("First Element = "+pq1.peek()+pq1);

  /*. 
9. retrieve and remove the first element.*/
     System.out.println("\nretrieve and remove the first element\n");

     System.out.println("First element = "+pq1.poll() +" "+pq1);

//10. convert a priority queue to an array containing all of the elements of the queue.
     System.out.println("\nconvert a priority queue to an array containing all of the elements of the queue.\n");

     System.out.println("Array of Priority queue = "+Arrays.toString(pq1.toArray()));

    }

}

/* 6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map. */

class Question6{
    public static void main(String ... args)
    {
      
//1. associate the specified value with the specified key in a Tree Map.

        System.out.println("\nassociate the specified value with the specified key in a Tree Map.\n");

        TreeMap<String,Integer> map=new TreeMap<>();

         map.put("one",1);

         map.put("two",2);

         map.put("Three",3);

        System.out.println(map);

//2. copy a Tree Map content to another Tree Map.

        System.out.println("\ncopy a Tree Map content to another Tree Map.\n");

        TreeMap<String,Integer> map1=new TreeMap<>(map);

        System.out.println("original map = "+map+"\n");

        System.out.println("Copied Map = "+map1+"\n");

            /*3. search a key in a Tree Map.
            4. search a value in a Tree Map. */

        System.out.println("\nsearch a key in a Tree Map." +
                "and  search a value in a Tree Map.\n");

        System.out.println("Map =  "+map);

        System.out.println("Search Key = two");

        System.out.println( map1.containsKey("two")?"Yes Contains ":"No Contains");

         System.out.println("Search Value =3");

         System.out.println( map1.containsValue(3)?"Yes Contains ":"No Contains");

        /*5. get all keys from the given a Tree Map.

        6. delete all elements from a given Tree Map. */

        System.out.println("\nget all keys from the given a Tree Map." +
                "\n" +"and delete all elements from a given Tree Map.\n");

        System.out.println("All The Key = "+map.keySet());

        System.out.println("Before Deleted All "+map1);

        map1.clear();

        System.out.println("After  = "+map1);

//7. sort keys in Tree Map by using comparator.

        System.out.println("\nsort keys in Tree Map by using comparator.\n");

        System.out.println(map);

//8. get a key-value mapping associated with the greatest key and the least key in a map.

        System.out.println("\nget a key-value mapping associated with the greatest key and the least key in a map.\n");

        for(Entry<String, Integer> a:map.entrySet())
        {
            System.out.println("Key = "+a.getKey()+" Value = "+a.getValue());
        }


//9. get the first (lowest) key and the last (highest) key currently in a map.

        System.out.println("\nget the first (lowest) key and the last (highest) key currently in a map.\n");

        TreeMap<Integer,String> numMap=new TreeMap<>();

        numMap.put(10,"Ten");

        numMap.put(1,"One");

        numMap.put(5,"Five");


        ArrayList<Integer> list=new ArrayList<>(numMap.keySet());

        System.out.println("All Keys = "+list);

        System.out.println("first Value "+ list.getFirst()+"\n");

        System.out.println("Last  Value "+ list.getLast()+"\n");


//10. get a reverse order view of the keys contained in a given map.

        System.out.println("\nget a reverse order view of the keys contained in a given map\n");


        System.out.println("Map all Key ="+list+"\n");


        for(int i=list.size()-1;i>=0;i--)
    {
        System.out.print(list.get(i)+" ");
    }




    }
}

/*7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map. */

class Questiom7{
    
public static void main(String [] args)
{

    //1. associate the specified value with the specified key in a HashMap.

    System.out.println("\nassociate the specified value with the specified key in a HashMap.\n");

 HashMap<Integer,Integer> map=new HashMap<>();
 
 for(int i=0;i<5;i++){map.put(i,i+1);}

    System.out.println("After Adding = "+map);

//2. count the number of key-value (size) mappings in a map.

    System.out.println("\n count the number of key-value (size) mappings in a map.\n");

System.out.println("Number of key-Value = "+map.size()+"  map = "+map);

//3. copy all of the mappings from the specified map to another map.

    System.out.println("\ncopy all of the mappings from the specified map to another map.\n");

HashMap<Integer,Integer> map1=new HashMap<>(map);

System.out.println("Original Map = "+map);

System.out.println("Original Map = "+map1);

System.out.println("\n remove all of the mappings from a map.\n");

map1.clear();

System.out.println("After a Map Clear = "+map1+"\n");

//check whether a map contains key-value mappings (empty) or not.

    System.out.println("\ncheck whether a map contains key-value mappings (empty) or not.\n");

    System.out.println( "map  "+map1);

    if(map1.isEmpty())
    {
        System.out.println("Map is Empty");
    }
    else{
        System.out.println("Map is not empty ");
    }

    System.out.println("Map = "+map);

    System.out.println("\ntest if a map contains a mapping for the specified key.\n" +
            "8. test if a map contains a mapping for the specified value.\n");

    System.out.println(map.containsKey(1)?"Yes Contains \n":"not Contains \n");

    System.out.println(map.containsValue(2)?"Yes Contains \n":"not contains \n");



//9. create a set view of the mappings contained in a map.

    System.out.println("\n create a set view of the mappings contained in a map. \n");

    System.out.println( " Set View Of map = "+map.entrySet()+"\n");


//10. get the value of a specified key in a map.

    System.out.println("\n get the value of a specified key in a map.\n");

    System.out.println("Map = "+map+"\n");

    System.out.println("Map key is 3 value = "+map.get(3));


}

}

/*
8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).
 */

class Account{

     int accountnumber ;

    String accountHolderName ;

     double balance ;

     double interest;

    public Account(int accountnumber, double balance, String accountHolderName, double interest) {
        this.accountnumber = accountnumber;

        this.balance = balance;

        this.accountHolderName = accountHolderName;

        this.interest = interest;
    }


    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void display()
    {
        System.out.println("Account Holder Name = "+accountHolderName);

        System.out.println("Account number = "+accountnumber);

        System.out.println("Balance = "+balance);

        System.out.println("Interest = "+interest);

        double value= Math.pow(((100+interest)/100),5);

        System.out.println("Interest Calculation for  5 year  = "+ balance*value);
    }


}

class MainAccessForAccount{

    public static void main(String[] args) {


        Account acc=new Account(100001,12038,"SeeniVasan",4.9);

        Account acc1=new Account(100001,10000,"Doss",4.9);

        Account acc2=new Account(100001,8000,"Suriya",4.9);

        // Use autoboxing to store the balance and interest as Double wrapper objects.

        Double balance=acc.balance; //Autoboxing

        // Use manual boxing to convert a primitive interest rate into a Double object.

        Double interest= Double.valueOf(acc.interest); //Manual Boxing

        // unboxing

        double interest1= (double) interest;

        double balance1=balance;



        ArrayList<Account> accList=new ArrayList<>();

        accList.add(acc);

        accList.add(acc1);

        accList.add(acc2);

        for(Account a:accList)
        {
            a.display();
            System.out.println();
        }

    }

}