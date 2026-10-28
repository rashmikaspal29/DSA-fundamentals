public class Student <T1, T2> implements Comparable<Student<T1, T2>> {
    private T1 id;
    private T2 name;
    private T1 x;
    private String city;

    @SuppressWarnings("unchecked")
    public Student(T1 id, T2 name) {
        this.id = id;
        this.name = name;
        // this.x = new T1(); // you CANNOT do this in Java. It does not know what type T is at run-time. Generics are created and erased during compile-time
        this.x = (T1)new Object();
    }

    public T1 getId() {
        return id;
    }

    public void setId(T1 id) {
        this.id = id;
    }

    public T2 getName() {
        return name;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        // return "Student [id=" + id + ", name=" + name + "]\n";
        return "Student [id=%s, name=%s]\n".formatted(id, name);
    }

    @Override
    public int compareTo(Student<T1, T2> o) {
        // if (city.compareTo(o.getCity()) > 1) {
        //     return 1;
        // }

        return city.compareTo(o.getCity());
        
    }

}
