import java.util.*;

class hashSetMethod{
    void displayHashSet(){
        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("INDIA");
        hashSet.add("USA");
        hashSet.add("UK");
        hashSet.add("AUSTRALIA");
        hashSet.add("CANADA");
        System.out.println(hashSet);
    }
}

public class Demo032 {
    public static void main(String[] args) {
        hashSetMethod obj = new hashSetMethod();
        obj.displayHashSet();
        
    }
}
