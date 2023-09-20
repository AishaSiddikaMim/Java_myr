 class Course {
    String name;
    String identifier;
    double credit;
    Course[] prerequisite;
    int t;

    Course(String identifier, double credit) {
        this.identifier = identifier;
        this.credit = credit;
        prerequisite = new Course[10];
        t = 0;
    }

    Course(String name, String identifier, double credit){
        this.name = name;
        this.identifier = identifier;
        this.credit = credit;
        prerequisite = new Course[10];
        t = 0;
    }
    public void setPrerequisite(Course c) {
        this.prerequisite[t] = c;
         t++;
    }

    public void setPrerequisite(Course[] c){
            for(int i = 0; i < c.length ; i++){
                this.prerequisite[t] = c[i];
                t++;
            }
        }

    public String toString(){
       String s =  this.identifier + ":" + this.name + " , Credit : " + this.credit ;
       String m = "\n Prerequisite : " ;
       for(int i = 0; i < t ; i++){
           m += prerequisite[i].identifier + ",";
       }
       m += "\n";
       return s + m;
    }
}

  class Student {
     String name;
     String studentID;
     Course[] coursesCompleted;
     double creditsCompleted;
     Course[] coursesTaken;
     double creditsTaken;
     int numberOfCoursesCompleted =0;

      public Student(String name, String studentID) {
          this.name = name;
          this.studentID = studentID;
          coursesCompleted =new Course[20];
          this.creditsCompleted = 0;
      }

      public void addCourse(Course c) {
          this.creditsTaken += c.credit;
          String s = "Course" + c.identifier + "added successfully";
          System.out.println(s);
     }

      public void setCoursesCompleted(Course[] c) {
           for(int i = 0; i < c.length ; i++){
               coursesCompleted[numberOfCoursesCompleted] = c[i];
           creditsCompleted += c[i].credit;
           }
      }

      public String toString(){
          String s =  "\n Name : " + this.name + " \n";
          s += "Credits Completed : " + this.creditsCompleted + "\n";
          s += "Credits Taken : " + this.creditsTaken + "\n";
          return s;
      }
}


public class TestStudent {
    public static void main(String[] args) {
        Course c1 = new Course("CSE103", 4.5);
        Course c2 = new Course("CSE106", 3.0);
        Course c3 = new Course("Object Oriented Programming Language", "CSE110", 4.5);
        Course c4 = new Course("CSE207", 4.5);
        Course c5 = new Course("Algorithms", "CSE246", 4.5);
        Course[] pre1 = {c2, c3}; Course[] pre2 = {c2, c4};

        c2.setPrerequisite(c1);
        c3.setPrerequisite(c2);
        c4.setPrerequisite(pre1);
        c5.setPrerequisite(pre2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        Student s1 = new Student("Harry", "3012-3-60-111");
        System.out.println(s1);
        s1.addCourse(c2);

        Course[] completed = {c1, c2, c3};
        s1.setCoursesCompleted(completed);
        s1.addCourse(c4);
        System.out.println(s1);
    }
}

