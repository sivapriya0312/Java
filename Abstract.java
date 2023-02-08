abstract class AllEmployee{

abstract String get_address(String address);

abstract void getDetails(String name);

abstract double getsal_det(int salary);

String get_designation(String designation){

    System.out.println("Designation: " + designation);

    return designation;

}

}




class Employee extends AllEmployee{

  int salary;

  String address;

  String name;

  String designation;

  

  String get_address(String address){

  System.out.println("Location: " + address);

    return address;

}

  

  void getDetails(String name){

  this.name=name;

  System.out.println("name: " + name ); 

  }

  

  double getsal_det(int salary){

  System.out.println("salary : "+salary);

    return salary;

}

 

}




class Main{

public static void main(String args[]){

    AllEmployee obj= new Employee();

        obj.getDetails("Sivapriya");

        obj.getsal_det(20000);

        obj.get_address("Coimbatore");

        obj.get_designation("Intern");

    }

}