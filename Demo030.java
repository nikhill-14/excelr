import java.util.ArrayList;
import java.util.Iterator;

class ArrayListCode {
    void arrayListMethod() {
        ArrayList<Integer> arraylist1 = new ArrayList<>();  // Corrected variable name
        arraylist1.add(100);
        arraylist1.add(200);
        arraylist1.add(100);
        arraylist1.add(0);
        arraylist1.add(900);
        arraylist1.add(600);

        System.out.println("Elements of the list: ");
        
        Iterator<Integer> iterate = arraylist1.iterator();  // Using the corrected variable name
        
        while (iterate.hasNext()) { 
            System.out.println(iterate.next()); 
        }
    }
}

public class Demo030 {

    public static void main(String[] args) {
        ArrayListCode obj = new ArrayListCode();
        obj.arrayListMethod();
    }
}