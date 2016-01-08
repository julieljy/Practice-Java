/**
 * Created by julie on 1/7/16.
 */
public class Student extends Person{

    private Klass klass;

    public Student(String id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass=klass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return klass != null ? klass.equals(student.klass) : student.klass == null;

    }

    @Override
    public int hashCode() {
        return klass != null ? klass.hashCode() : 0;
    }

    public String introduce() {
        if (this.equals(this.getKlass().getLeader())){
            return super.introduce()+" I am a Student. I am Leader of Class "+this.getKlass().getNumber()+".";
        }
        else {
            return super.introduce()+" I am a Student. I am at Class "+this.getKlass().getNumber()+".";
        }
    }


}
