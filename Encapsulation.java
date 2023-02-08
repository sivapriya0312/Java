class Encapsulation{
private String name;
private int roll_num;
private int age;

public String get_name(){
return name;
}

public int get_roll(){
return roll_num;
}

public int get_age(){
return age;
}

public void set_name(String newname){
name=newname;
}

public void set_age(int newage){
age=newage;
}

public void set_roll(int rollno){
roll_num=rollno;
}
}

class Main{
public static void main(String [] args){

Encapsulation obj = new Encapsulation();
obj.set_name("Sivapriya");
obj.set_age(21);
obj.set_roll(23);

System.out.println("Name of the intern: " + obj.get_name());
System.out.println("Employee id: " + obj.get_roll());
System.out.println("Age: " + obj.get_age());

}
}