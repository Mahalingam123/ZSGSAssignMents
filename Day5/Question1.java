/*1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed. */

import java.util.Scanner;

class MedicalRecord {

            int recordId;
            String patientName;
            String dateOfVisit;
            String diagnosis;

  public void inputRecordDetails(int recordId, String patientName, String dateOfVisit, String diagnosis) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
     }

     public void  display()
     {
       System.out.println("Record Id = "+this.recordId);
       System.out.println("Patient Name = "+this.patientName);
       System.out.println("Date of Visit = "+this.dateOfVisit);
       System.out.println("Diagnosis = "+this.diagnosis);

     }    

}

class InPatientRecord extends MedicalRecord{

     int roomNumber ;
     int numberOfDaysAdmitted;
     int charges;

     

    public InPatientRecord(int roomNumber, int numberOfDaysAdmitted, int charges) {
        this.roomNumber = roomNumber;
        this.numberOfDaysAdmitted=numberOfDaysAdmitted;
        this.charges = charges;
    }

    public int totalCharges()
    {
        return this.numberOfDaysAdmitted*this.charges;
    }

    public void display(){
        super.display();
        System.out.println("Room Number = "+this.roomNumber);
        System.out.println("Number of Days Admitted  = "+this.numberOfDaysAdmitted);
        System.out.println("Per Day Charges = "+this.charges);
        System.out.println("Total Charges = "+this.totalCharges());
    }

}

class OutPatientRecord extends MedicalRecord{
    
    int consultentFees;
    String DoctorName;

    

    public OutPatientRecord(int consultentFees, String doctorName) {
        this.consultentFees = consultentFees;
        DoctorName = doctorName;
    }



    public void display(){
        super.display();
        System.out.println("Consultant Feeys = "+this.consultentFees);
        System.out.println("Doctor Name  = "+this.DoctorName);
    }
}

class Main{
    public static void main(String ...a){
   
    Scanner scan=new Scanner(System.in);
    
           System.out.println("Enter Record Id");
           int recordId=scan.nextInt();
           scan.nextLine();
           System.out.println("Enter a Diagnosis ");
           String diagnosis=scan.nextLine();
           System.out.println("Enter Date Of visit ");
           String date=scan.nextLine();
           System.out.println("Enter a Patient Name ");
           String name=scan.nextLine();

    System.out.println("Enter 1 for InPatient Record ");
    System.out.println("Enter 2 for OutPatient Record ");
    System.out.println("Enter 3 for Exit");
    System.out.println("Enter Your Choice");
    int choice=scan.nextInt();
    switch (choice) {
        case 1:
           System.out.println("Enter RoomNumber");
           int rNo=scan.nextInt();
           System.out.println("Enter Number of Days  Admitted");
           int numDayAdmitted=scan.nextInt();
           System.out.println("Enter Per Day Charges");
           int charge=scan.nextInt();
         

          InPatientRecord rec=new InPatientRecord(rNo,numDayAdmitted,charge);
          
           rec.inputRecordDetails(recordId,name,date,diagnosis);

           rec.display();

            break;

        case 2:
              System.out.println("Enter Fees");
              int fees=scan.nextInt();
              scan.nextLine();
              System.out.println("Enter Doctor Name");
              String dName=scan.next();

              OutPatientRecord out=new OutPatientRecord(fees,dName);

              out.inputRecordDetails(recordId,name,date,diagnosis);

              out.display();


            break;
            
        case 3:
            System.exit(0);

    
        default:
            break;
    }

    }
}