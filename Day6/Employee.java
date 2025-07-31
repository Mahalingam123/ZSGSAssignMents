/*‌
3. Design a class`Employee with private data members: employee ID, name, 
designation, department, and monthly salary. Use proper getter and setter 
methods to access and update these fields. Add a method to calculate and
 return the annual salary of the employee.
‌ */

public class Employee {
    
    private String name;

    private int empId;

    private String designation;

    private  double monthSalary;

    private String department;

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getDesignation() {
        return designation;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double annualSalary()
    {
      return  this.monthSalary*12;
    }

}

class AccessEmp{
    public static void main(String ...args){

         Employee emp=new Employee();

         emp.setDepartment("Computer Science ");
         emp.setDesignation("Tirunelveli");
         emp.setEmpId(101);
         emp.setMonthSalary(120000);
         emp.setName("madhan");

        System.out.println(emp.annualSalary());

    }
}
