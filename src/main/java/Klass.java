/**
 * Created by julie on 1/7/16.
 */
public class Klass {

    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        if (number != null ? !number.equals(klass.number) : klass.number != null) return false;
        return leader != null ? leader.equals(klass.leader) : klass.leader == null;

    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        return result;
    }

    public String assignLeader(Student student){
        if (this.equals(student.getKlass())){
            this.leader=student;
            return null;
        }
        else{
            return "It is not one of us.";
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}
