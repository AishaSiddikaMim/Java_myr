class License1{
    String licenseString;

    public  License1 (String licenseString){
        this.licenseString = licenseString;
    }
}

interface ISpeaking{
    public void speak();
    default void defaultMethodOne(){
        System.out.println("Inside Interface ISpeaking");
    }
}

interface ILicensable{
    License1 getLicense();
    default void defaultMethodTwo(){
        System.out.println("Default Method of Interface ILicensable Inside ILicensable");
    }
}


class Bird implements ISpeaking {
    String name;
    Bird (){

    }
    public Bird(String name){
        this.name = name;
    }
    public void speak (){
        System.out.println("Tweet");
    }
    public void defaultMethodOne(){
        System.out.println("Default Method of Interface ISpeaking Inside Bird");
    }
}

abstract class Pet implements ISpeaking {
    String name;

    public Pet(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void run(){
        System.out.println("A pet is running");
    }
}

class Dog extends Pet implements ILicensable {
    License1 stringLicense;

    public Dog(String name, License1 stringLicense) {
        super(name);
        this.stringLicense = stringLicense;
    }

    public void speak() {
        System.out.println("Woof");
    }

    public License1 getLicense() {
        return stringLicense;

    }

    public String getName() {
        return super.getName();
    }
}

class BullDog extends Dog  {
    public BullDog(String name, License1 stringLicense){
        super(name, stringLicense);
    }
    Bird retrieve(){
        return new Bird();
    }
    public void speak(){
        System.out.println("raooou");
    }
}

class Cat extends Pet{
    public Cat (String name) {
        super(name);
    }
    public void speak(){
        System.out.println("Miao");
    }
}


public class Animals {
     public static void main(String[] args) {
         ISpeaking s = new Bird("Woody Woodpecker");
         s.speak();
         s.defaultMethodOne();
         System.out.println();
         s = new Cat("Tom");
         s.speak();
         s.defaultMethodOne();
         System.out.println();
         Dog d = new Dog("Scooby-Doo", new License1("Scooby1111"));
         d.speak();
         d.defaultMethodOne();
         d.defaultMethodTwo();
         d.run();
         System.out.println();
         Pet p = new BullDog("Tasmanian Devil", new License1("Tasmanian123"));
         p.speak();
         p.defaultMethodOne();
         p.run();
         System.out.println();
         Bird b = new BullDog("Brian Griffin", new License1("Brian234")).retrieve();
         b.speak();



         }

     }

