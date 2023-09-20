 public class ArrayReference {
    //changing the array element is visible: when array is passed as a parameter
    public void modifyArray(Person[] x){
        Person ob = new Person("Brian", 20);
        x[5] = ob;
    }
    //changing the array reference itself is not visible: when array is passed as a parameter
    public void modifyReference(Person[] x){
        x = new Person[5];
        Person ob = new Person("Tom", 4);
        x[1] = ob;
    }

    public static void main(String[] args) {
        Person[] arrayPerson = new Person[10];
        for(int i=0; i<10; i++){
            Person ob = new Person("Bob", 10);
            arrayPerson[i] = ob;
        }

        for(Person x: arrayPerson){
            System.out.println(x);
        }
        System.out.println();

        ArrayReference arrayReference = new ArrayReference();
        arrayReference.modifyArray(arrayPerson);

        for(Person x: arrayPerson){
            System.out.println(x);
        }
        System.out.println();

        arrayReference.modifyReference(arrayPerson);

        for(Person x: arrayPerson){
            System.out.println(x);
        }
        System.out.println();
    }
}
