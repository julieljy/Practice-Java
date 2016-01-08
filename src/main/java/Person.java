/**
 * Created by julie on 1/7/16.
 */
public class Person {
    private  String id;
    private  String name;
    private  int age;

    public Person(String id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String introduce() {
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old.";
    }
}
