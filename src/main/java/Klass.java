import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by julie on 1/7/16.
 */
public class Klass {

    private Integer number;
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private Student leader;

    public Klass(Integer number, Teacher teacher) {
        this.number=number;
        if (teacher!=null){
            this.teachers.add(teacher);
            teacher.setKlasses(this);
        }
    }

    public Integer getNumber() {
        return number;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Student getLeader() {
        return leader;
    }

    public String assignLeader(Student student,PrintStream printer){
        if (this.equals(student.getKlass())){
            this.leader=student;
            for (int i=0;i<this.teachers.size();i++){
                Inform informTeacher = new Teacher(this.getTeachers().get(i).getId(),this.getTeachers().get(i).getName(),
                        this.getTeachers().get(i).getAge(),this.getTeachers().get(i).getKlasses(),printer);
                informTeacher.informLeader(student);
            }
            Inform informComputer = new Computer("the Machine",printer);
            informComputer.informLeader(student);
            return null;
        }
        else{
            return "It is not one of us.";
        }
    }

    public void appendMember(Student student,PrintStream printer) {
        student.setKlass(this);
        Inform informComputer = new Computer("the Machine", printer);
        informComputer.informStudent(student);
        for (int i=0;i<this.teachers.size();i++){
            Inform informTeacher = new Teacher(this.getTeachers().get(i).getId(),this.getTeachers().get(i).getName(),
                    this.getTeachers().get(i).getAge(),this.getTeachers().get(i).getKlasses(),printer);
            informTeacher.informStudent(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        if (number != null ? !number.equals(klass.number) : klass.number != null) return false;
        if (teachers != null ? !teachers.equals(klass.teachers) : klass.teachers != null) return false;
        return leader != null ? leader.equals(klass.leader) : klass.leader == null;

    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (teachers != null ? teachers.hashCode() : 0);
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        return result;
    }

    public boolean isIn(Student student) {
        if (this.equals(student.getKlass())){
            return true;
        }
        else {
            return false;
        }
    }


}
