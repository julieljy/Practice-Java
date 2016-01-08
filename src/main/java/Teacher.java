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

    public String introduceWith(Student student) {
        if (this.getKlass().getNumber()==student.getKlass().getNumber()){
            return this.basicIntroduce()+" I teach "+student.getName()+".";
        }
        else {
            return this.basicIntroduce()+" I don't teach "+student.getName()+".";
        }
    }
}
