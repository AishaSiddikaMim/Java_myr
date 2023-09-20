import java.util.Vector;

class VectorDemo {
    public static void main(String args[]) {
        Vector<Integer> v = new Vector<>();
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        for(int i=0; i <1000 ;i++){
        v.addElement();}
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);
        v.addElement(6);
        v.addElement(7);
        v.addElement(8);
        v.addElement(9);
        System.out.println("After adding 9 size: " + v.size());
        System.out.println("After adding 9 capacity: " + v.capacity());
        v.addElement(10);
        System.out.println("After adding 10 size: " + v.size());
        System.out.println("After adding 10: " + v.capacity());
        v.addElement(11);
        System.out.println("After adding 11: " + v.size());
        System.out.println("After adding 11: " + v.capacity());
        v.addElement(12);
        v.addElement(13);
        System.out.println("capacity: " + v.capacity());

        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());


        if (v.contains(3)) System.out.println("Vector contains 3.");
        v.remove(4);

        // iterate
        for (int i = 0; i < v.size(); i++) {
            Integer a = v.elementAt(i);
            System.out.println(a);
        }
    }
}
