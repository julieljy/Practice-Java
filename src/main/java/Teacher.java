/**
 * Created by julie on 1/7/16.
 */
public class Teacher extends Person{

    private Klass klass;

    public Teacher(String id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    private String basicIntroduce(){
        return super.introduce()+" I am a Teacher.";
    }
    public String introduce(){
        if (this.getKlass()==null){
            return this.basicIntroduce()+" I teach No Class.";
        }
        else{
            return this.basicIntroduce()+" I teach Class "+this.getKlass().getNumber()+".";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        return klass != null ? klass.equals(teacher.klass) : teacher.klass == null;

    }

    @Override
    public int hashCode() {
        return klass != null ? klass.hashCode() : 0;
    }

    public String introduceWith(Student student) {
        if (this.getKlass().equals(student.getKlass())){
            return this.basicIntroduce()+" I teach "+student.getName()+".";
        }
        else {
            return this.basicIntroduce()+" I don't teach "+student.getName()+".";
        }
    }
}
