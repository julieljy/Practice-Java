import java.util.List;

/**
 * Created by julie on 1/7/16.
 */
public class Teacher extends Person{

    private List<Klass> klasses;

    public Teacher(String id, String name, int age, List<Klass> klasses){
        super(id,name,age);
        this.klasses=klasses;
    }

    public List<Klass> getKlasses() {
        return klasses;
    }

    private String basicIntroduce(){
        return super.introduce()+" I am a Teacher.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        return klasses != null ? klasses.equals(teacher.klasses) : teacher.klasses == null;

    }

    @Override
    public int hashCode() {
        return klasses != null ? klasses.hashCode() : 0;
    }

    public String introduce(){
        if (this.getKlasses()==null){
            return this.basicIntroduce()+" I teach No Class.";
        }
        else{
            String teachKlass="";
            for (int i=0;i<klasses.size();i++){
                teachKlass += klasses.get(i).getNumber();
                if (klasses.get(i).equals(klasses.get(klasses.size()-1))){
                    teachKlass += ".";
                }
                else {
                    teachKlass += ", ";
                }
            }
            return this.basicIntroduce()+" I teach Class "+teachKlass;
        }
    }

    public String isTeaching(Student student) {
        int check=0;
        for (int i=0;i<klasses.size();i++){
            if (this.klasses.get(i).isIn(student)){
                check=1;
            }
        }
        if (check==0){
            return "false";
        }else{
            return "true";
        }
    }

//    public String introduceWith(Student student) {
//        if (this.getKlass().equals(student.getKlass())){
//            return this.basicIntroduce()+" I teach "+student.getName()+".";
//        }
//        else {
//            return this.basicIntroduce()+" I don't teach "+student.getName()+".";
//        }
//    }
}
