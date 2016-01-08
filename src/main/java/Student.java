/**
 * Created by julie on 1/7/16.
 */
public class Student extends Person{
    private final Klass klass;

    public Student(String id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (this.getKlass().getLeader()==this.getName()){
            return super.introduce()+" I am a Student. I am Leader of Class "+this.getKlass().getNumber()+".";
        }
        else {
            return super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";
        }
    }
}
