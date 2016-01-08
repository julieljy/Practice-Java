import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by julie on 1/7/16.
 */
public class KlassTest {
    @Test
    public void should_equal_to_student_klass(){
        assertThat(new Klass(2).getNumber(),is(2));
    }
    @Test
    public void should_assign_leader(){
        Klass klass = new Klass(2);
        Student tom = new Student("001","Tom",21,klass);
        klass.assignLeader(tom);
        assertThat(klass.getLeader(),is(tom));
    }
    @Test
    public void should_append_student_to_klass(){
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Student tom = new Student("001","Tom",21,klass1);
        klass2.appendMember(tom);
        assertThat(tom.getKlass(),is(klass2));
    }
    @Test
    public void should_not_assign_leader_if_student_is_not_in_klass(){
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Student tom = new Student("001","Tom",21,klass1);
        assertThat(klass2.assignLeader(tom),is("It is not one of us."));
    }

}
