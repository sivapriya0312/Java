class Employee{

  int salary;

  String address;

  String name;

  

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

    Employee obj= new Employee();

        obj.getDetails("Sivapriya");

        obj.getsal_det(20000);

        obj.get_address("Coimbatore");

    }

}