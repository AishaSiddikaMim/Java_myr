public class Person{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        this.height = 0;
        this.weight = 0;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, my" +
                "body mass index is "+ bodyMassIndex();
    }

    public void becomeOlder() {
        this.age++;;    // same as this.age = this.age + 1;
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


}