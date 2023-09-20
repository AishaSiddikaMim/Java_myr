import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Double> balance = new HashMap<>();
        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", null);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -17.08);

        String k = "John Doe";
        double b = balance.get(k);
        System.out.println(k + " " + b);
        System.out.println();

        String str;
        // show all balances in hashtable
        Set<String> set = balance.keySet(); // get set view of keys
        Iterator<String> itr = set.iterator(); // get iterator
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
    }
}


