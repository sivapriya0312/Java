
import java.util.*;
class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> li = new java.util.ArrayList<Integer>();
        li.add(03);
        li.add(12);
        li.add(2001);
        System.out.println(li);

        java.util.ArrayList<String> li1 = new java.util.ArrayList<String>();
        li1.add("Sivapriya");
        li1.add("Madhusudhanan");
        System.out.println(li1);

        li1.add(1,"Umamaheswari");
        System.out.println(li1);

        li1.remove(2);
        System.out.println(li1);

        for(int i=0;i<li1.size();i++){
            System.out.println(li1.get(i));
        }

        int a=li1.size();
        System.out.println(a);
    }
}