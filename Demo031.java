
import java.util.*;

class HashSetDemo1 {
	void HSetMethod() {
		//We can add any type of element here...
		HashSet<Object> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.print("Enter a String: ");
        String b = sc.next();
        System.out.print("Enter a Double: ");
        double c = sc.nextDouble();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		System.out.println(hashSet);		
//we can use Object class to read any type of elements
		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


public class Demo031 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
	}
}
