/**
 * Created by julie on 1/7/16.
 */
public class Klass {

    private Integer number;
    private String leader;

    public Klass(Integer number) {
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getLeader() {
        return leader;
    }

    public void assignLeader(Student student){
        this.leader=student.getName();
    }


}
