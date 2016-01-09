import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by julie on 1/7/16.
 */
public class KlassTest {
    private PrintStream fakedOut;
    @Before
    public void getFakedOut(){
        fakedOut = mock(PrintStream.class);
    }
    @Test
    public void should_equal_to_student_klass(){
        List<Klass> klasses = new ArrayList<Klass>();
        Teacher tom = new Teacher("001","Tom", 21, klasses, fakedOut);
        Klass klass2 = new Klass(2,tom);
        Klass klass3 = new Klass(3,tom);
        assertThat(new Klass(2,tom).getNumber(),is(2));
    }
    @Test
    public void should_assign_leader(){
        List<Klass> klasses = new ArrayList<Klass>();
        Teacher tom = new Teacher("001","Tom", 21, klasses, fakedOut);
        Klass klass = new Klass(2,tom);
        Student jerry = new Student("002","Jerry",10,klass);
        klass.assignLeader(jerry,fakedOut);
        assertThat(klass.getLeader(),is(jerry));
    }
    @Test
    public void should_append_student_to_klass(){
        Klass klass1 = new Klass(1,null);
        Klass klass2 = new Klass(2,null);
        Student tom = new Student("001","Tom",21,klass1);
        klass2.appendMember(tom,fakedOut);
        assertThat(tom.getKlass(),is(klass2));
    }
    @Test
    public void should_not_assign_leader_if_student_is_not_in_klass(){
        Klass klass1 = new Klass(1,null);
        Klass klass2 = new Klass(2,null);
        Student tom = new Student("001","Tom",21,klass1);
        assertThat(klass2.getLeader(),not(tom));
        assertThat(klass2.assignLeader(tom,fakedOut),is("It is not one of us."));
    }
    @Test
    public void should_show_the_student_is_belonged_to_klass_or_not(){
        Klass klass1 = new Klass(1,null);
        Klass klass2 = new Klass(2,null);
        Student tom = new Student("001","Tom",21,klass1);
        Student lily = new Student("002","Lily",22,klass2);
        assertThat(klass1.isIn(tom),is(true));
        assertThat(klass1.isIn(lily),is(false));
    }

}
