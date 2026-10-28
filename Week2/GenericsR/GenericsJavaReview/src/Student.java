
public class Student <T>{
    
    private String name;
    private T id;

    @SuppressWarnings("unchecked") // telling java: ik what I am doing            no new generics type, no new generics methids
    T innerFinger = (T)new Object(); // make an obj of Object and then cast back to T 

    //T innerFinger = new T(102); cannot because of compile time

    public Student(String name, T id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }

    
    
}
