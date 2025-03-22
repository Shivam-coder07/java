

class Student{
    private int age;
    private String name;
     
    
    public void show()
    {
        System.out.println(name+" "+ age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   // retrun type should be void & name start with set
        this.age = age;
    }

    public String getName() {    // retrun type not void & name start with get
        return name;             // it should be public
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
     public static void main(String[] args) {
        Student obj = new Student();
        Student obj2 = new Student();
        obj.setAge(19);
        obj2.setAge(35);
        obj.setName("shivam");
        obj2.setName("yadav");
        obj.show();
        obj2.show();
        int student = obj.getAge();
        System.out.println(student);
     }
}
