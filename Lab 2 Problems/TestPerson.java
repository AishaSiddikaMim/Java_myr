public class TestPerson {
    public static void main(String[] args) {
        Person bob = new Person("Bob", 10);
        System.out.println(bob.getAge());
        bob.setAge(50);
        System.out.println(bob.getAge());

        System.out.println( bob );

        Person brian = new Person("Brian", 20);
        Person martin = new Person("Martin", 30);

        bob.becomeOlder();
        brian.becomeOlder();

        System.out.println(bob.getAge());
        System.out.println(brian.getAge());

        int i = 0;
        while (i <= 30){
            brian.becomeOlder();
            i++;
        }
        System.out.println(brian.getAge());

        Person matti = new Person("Matti", 10);
        Person john = new Person("John", 20);

        matti.setHeight(180);
        matti.setWeight(86);

        john.setHeight(175);
        john.setWeight(64);

        System.out.println(matti.getName() +", bodymassindex:"+
                matti.bodyMassIndex());
        System.out.println(john.getName() + ", bodymassindex:"+
                john.bodyMassIndex());

        System.out.println(matti);
        System.out.println(john);
    }
}
