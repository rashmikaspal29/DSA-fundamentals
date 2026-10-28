//js for class
public abstract class Person extends Object {

    private String name;
    private int age;

    public Person(){
        name = "Micky";
        age = 0;
    }

    public Person(String name, int age){

        this.name = name;
        this.age = age;
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

    @Override
    public String toString(){
        return name + " " + age;
    }

    public static void main(String[] args) throws Exception {
        
        Student p1 = new Student("Bob", 20, 101, 3.5 );
        
        System.out.print(p1);

        
        Person p2 = new Student("Jim", 23, 102, 3.6);

    }

}
