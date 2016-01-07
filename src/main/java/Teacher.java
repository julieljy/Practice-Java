/**
 * Created by julie on 1/7/16.
 */
public class Teacher extends Person{

    private Integer klass;

    public Teacher(String name,int age,Integer klass){
        super(name,age);
        this.klass=klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce()+" I am a Teacher. I teach Class "+this.getKlass()+".";
        }
    }
}
