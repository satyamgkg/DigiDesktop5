// ststic & this Keyword

class Employee
{
  int empid;
  String name;
  static String company = "Capgemini";

  Employee(int empid, String name)
   {
     this.empid=empid;
     this.name=name;
   }

  void display()
   {
     System.out.println(empid+" "+name+" "+company);
   }

  public static void main(String args[])
   {
     Employee e1=new Employee(101, "Amit");
     e1.display();

     Employee e2=new Employee(102, "Mohit");
     e2.display();

     Employee e3=new Employee(103, "Rohit");
     e3.display();
   }
}