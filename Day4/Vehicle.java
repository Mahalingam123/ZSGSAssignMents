/*1. We want to store the information about different vehicles. Create a class named Vehicle
 with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and 
fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air,
 liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership 
cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/

import java.util.Scanner;

class Vehicle{
	
	int mileage;
	
	int price;
	
	Vehicle(int mileage,int price)
	{
		this.mileage=mileage;
		
		this.price=price;
		
	}
	   
}

class Car extends Vehicle{
	
	int ownershipCost;
	
	int warranty;
	
	int seatingCapacity;
	
	String fuelType;
	
	Car(int ownershipCost,int warranty,int seatingCapacity,String fuelType,int mileage,int price)
	{
		super(mileage,price);
		
		this.ownershipCost=ownershipCost;
		
		this.warranty=warranty;
		
		this.seatingCapacity=seatingCapacity;
		
		this.fuelType=fuelType;
	}
	
}

class Bike extends Vehicle{
  
	int numOfCylinders;

	int gears;

	String coolType;

    String wType;

    int fuelTankSize;

	Bike(int numOfCylinders,int gears,String wType,int fuelTankSize,String coolType,int mileage,int price){
     
		super(mileage,price);

    	this.numOfCylinders=numOfCylinders;

		this.gears=gears;

		this.coolType=coolType;

		this.fuelTankSize=fuelTankSize;

		this.wType=wType;
	}


}

class Audi extends Car{

   String modelType;

   Audi(String modelType,int ownershipCost,int warranty,int seatingCapacity,String fuelType,int mileage,int price) {

	   super(ownershipCost, warranty, seatingCapacity, fuelType, mileage, price);

	   this.modelType = modelType;


   }

   void  display( ){

	   System.out.println("ModeType = "+this.modelType);

	   System.out.println("ownership cost = "+this.ownershipCost);

	   System.out.println("number  year warranty = "+this.warranty);

	   System.out.println("Seating Capacity = "+this.seatingCapacity);

	   System.out.println("Fuel Type = "+this.fuelType);

	   System.out.println("Milege = "+this.mileage);

	   System.out.println("Price = "+this.price);

   }

}

class Ford extends Car{

	String modelType;

	Ford(String modelType,int ownershipCost,int warranty,int seatingCapacity,String fuelType,int mileage,int price) {

		super(ownershipCost, warranty, seatingCapacity, fuelType, mileage, price);

		this.modelType = modelType;

	}

	void  display(){

		System.out.println("ModeType = "+this.modelType);

		System.out.println("ownership cost = "+this.ownershipCost);

		System.out.println("Warranty of year = "+this.warranty);

		System.out.println("Seating Capacity = "+this.seatingCapacity);

		System.out.println("Fuel Type = "+this.fuelType);

		System.out.println("Milege = "+this.mileage);

		System.out.println("Price = "+this.price);

	}
}

class TVS extends  Bike{

	String makeType;

	TVS(String makeType,int numOfCylinders,int gears,String wType,int fuelTankSize,String coolType,int mileage,int price){

		super(numOfCylinders, gears, wType, fuelTankSize, coolType, mileage, price);

		this.makeType=makeType;

	}

	void display(){

		System.out.println( "Make Type = "+this.makeType);

		System.out.println("Number of Cylinders = "+this.numOfCylinders);

		System.out.println("Number of gears = "+this.gears);

		System.out.println("Wheel Type = "+this.wType);

		System.out.println("Fuel tank size = "+this.fuelTankSize);

		System.out.println("Cooling Type = "+this.coolType);

        System.out.println("Mileage = "+this.mileage);

        System.out.println("Price = "+this.price);


	}

}

class Bajaj extends Bike
{
    String makeType;

    Bajaj(String makeType,int numOfCylinders,int gears,String wType,int fuelTankSize,String coolType,int mileage,int price){

        super(numOfCylinders, gears, wType, fuelTankSize, coolType, mileage, price);

        this.makeType=makeType;

    }

    void display(){

        System.out.println( "Make Type = "+this.makeType);

        System.out.println("Number of Cylinders = "+this.numOfCylinders);

        System.out.println("Number of gears = "+this.gears);

        System.out.println("Wheel Type = "+this.wType);

        System.out.println("Fuel tank size = "+this.fuelTankSize);

        System.out.println("Cooling Type = "+this.coolType);

        System.out.println("Mileage = "+this.mileage);

        System.out.println("Price = "+this.price);


    }

}


class AccessVehicle{

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter 1 for Car ");

            System.out.println("Enter 2 for Bike ");

            System.out.println("Enter 3 for exit");

            System.out.println("Enter a choices");

            int choices=scan.nextInt();

            switch(choices)
            {
                case 1:
                    System.out.println("Enter  1 for add Car detail ");

                    System.out.println("Enter 2 for Exit ");

                    System.out.println("Enter a choices");

                    int choice=scan.nextInt();

                    switch (choice)
                    {
                        case 1:
                            System.out.println("Enter  ModeType ");

                            String modType=scan.nextLine();

                            scan.next();

                            System.out.println("Enter  ownership cost ");

                            int owneCost=scan.nextInt();

                            System.out.println(" Enter number  year warranty  ");

                            int warranty=scan.nextInt();

                            System.out.println("Enter  Seating Capacity ");

                            int seatCapacity=scan.nextInt();

                            System.out.println(" Enter Fuel Type  ");

                            String fuelType=scan.nextLine();

                            scan.next();

                            System.out.println("Enter  Mileage ");

                            int mileage= scan.nextInt();

                            System.out.println("Enter  Price ");

                            int price=scan.nextInt();

                            System.out.println("Enter 1 for Audi");

                            System.out.println("Enter 2 for Ford");

                            int choiceCar=scan.nextInt();

                            switch (choiceCar){
                                case 1:
                                    Audi audi=new Audi(modType,owneCost,warranty,seatCapacity,fuelType,mileage,price);

                                    System.out.println();

                                    audi.display();

                                case 2:
                                    Ford ford=new Ford(modType,owneCost,warranty,seatCapacity,fuelType,mileage,price);

                                    System.out.println();

                                    ford.display();

                            }

                            break;
                        case 2:
                            break;
                    }

                     break;

                case 2:
                    while(true) {

                        System.out.println("Enter  1 for add Bike detail ");

                        System.out.println("Enter 2 for Exit ");

                        int choice_Bike = scan.nextInt();

                        switch (choice_Bike) {

                            case 1:

                                System.out.println( "  Enter a Make Type  ");

                                String  makeType=scan.nextLine();

                                scan.next();

                                System.out.println(" Enter a Number of Cylinders ");

                                int numCyli=scan.nextInt();

                                System.out.println("Number of gears" );

                                int gears=scan.nextInt();

                                System.out.println(" Wheel Type ");

                                String wType=scan.nextLine();

                                scan.next();

                                System.out.println("Fuel tank size  ");

                                int fuelTankSize=scan.nextInt();

                                System.out.println("Cooling Type ");

                                String coolType=scan.nextLine();

                                scan.next();

                                System.out.println("Mileage ");

                                int mileage=scan.nextInt();

                                System.out.println("Price ");

                                int price= scan.nextInt();

                                System.out.println("Enter 1 for TVS");

                                System.out.println("Enter 2 for Bajaj");


                                int bikeCompany= scan.nextInt();

                                switch (bikeCompany)
                                {
                                    case 1:

                                        TVS tvs=new TVS(makeType,numCyli,gears,wType,fuelTankSize,coolType,mileage,price);

                                        System.out.println(" Tvs Bikes ");

                                        tvs.display();

                                        break;
                                    case 2:

                                        Bajaj bajaj=new Bajaj(makeType,numCyli,gears,wType,fuelTankSize,coolType,mileage,price);

                                        System.out.println(" Bajaj Bikes ");

                                        bajaj.display();

                                        break;

                                    default:
                                        System.out.println("Enter a Correct choice ");
                                        break;
                                }
                                break;
                            case 2:
                                System.exit(0);
                                break;

                        }
                        
                        System.out.println();

                    }
                

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a Correct Choice ");
                    System.exit(0);
            }
        }
    }
}

