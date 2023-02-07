


import java.util.*;

public class Pattern{

public static void main(String arg[]){

Scanner sc=new Scanner(System.in);

String a=sc.nextLine();

for(int i=0;i<=a.length()-1;i++){

for(int j=0;j<=a.length()-1;j++){

if(i==j || i+j==a.length() - 1){

System.out.print(a.charAt(i));

}

else{

System.out.print(" ");

}




}

System.out.println();

}

}

}


