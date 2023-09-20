public class Person{
    private String name;
    private int age;
    private double height;
    private double weight;

    //overloading a method
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        this.height = 0;
        this.weight = 0;
    }

    //overloading constructor method
    public Person(String name, int age, double height, double weight){
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, my" +
                "body mass index is "+ bodyMassIndex();
    }

    public void becomeOlder() {
        this.age++;;    // same as this.age = this.age + 1;
    }

    //overloading becomeOlder() method
    public void becomeOlder(int age) {
        this.age = this.age + age;    // same as this.age = this.age + 1;
    }

    public boolean isAdult(){
        if ( this.age < 18 ) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //passing objects as method parameter
    public boolean hasSameWeight(Person person){
            if(this.weight == person.weight) return true;
            else return false;
    }

    public boolean olderThan(Person person) {
        if ( this.age > person.age ) return true;
        return false;
    }

    //methods returning an object
    public Person clonePerson(){
        Person tem = new Person(this.name, this.age);
        return tem;
    }

    public Person clonePerson(Person person){
        Person tem = new Person(person.name, person.age, this.height, this.weight);
        return tem;
    }

    public static void main(String[] args) {
        Person bob = new Person("Bob", 20, 10, 40);
        Person alice = new Person("Alice", 30, 5, 20);
        System.out.println(bob);
        System.out.println(alice);
        bob.olderThan(alice);
        Person bobClone = bob.clonePerson();
        System.out.println(bobClone);
        Person aliceClone = alice.clonePerson();
        System.out.println(aliceClone);
        Person bobAliceClone = bob.clonePerson(alice);
        System.out.println(bobAliceClone);

    }

}