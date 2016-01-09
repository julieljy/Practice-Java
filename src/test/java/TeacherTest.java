import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by julie on 1/7/16.
 */
public class TeacherTest {
//    @Test
//    public void should_introduce_with_name_age_and_klass(){
//        Klass klass2 = new Klass(2);
//        Teacher tom = new Teacher("001","Tom", 21, klass2);
//        assertThat(tom.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));
//    }

//    @Test
//    public void should_introduce_with_name_age_and_student(){
//        Klass klass2 = new Klass(2);
//        Teacher tom = new Teacher("001","Tom", 21, klass2);
//        Student student2 = new Student("002","Jerry", 6, klass2);
//        assertThat(tom.introduceWith(student2),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."));
//    }
//    @Test
//    public void should_introduce_with_name_age_and_teach_no_student(){
//        Klass klass2 = new Klass(2);
//        Teacher tom = new Teacher("001","Tom", 21, klass2);
//        Klass klass1 = new Klass(1);
//        Student student1 = new Student("002","Jerry", 6, klass1);
//        assertThat(tom.introduceWith(student1),is("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry."));
//
//    }
    private PrintStream fakedOut;
    @Before
    public void getFakedOut(){
        fakedOut = mock(PrintStream.class);
    }
    @Test
    public void should_introduce_with_name_age_and_klasses(){
        List<Klass> klasses = new ArrayList<Klass>();
        Teacher tom = new Teacher("001","Tom", 21, klasses,fakedOut);
        Klass klass2 = new Klass(2,tom);
        Klass klass3 = new Klass(3,tom);
        assertThat(tom.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3."));
    }
    @Test
    public void should_teach_no_klass(){
        Teacher noKlass = new Teacher("001","Tom",21,null,fakedOut);
        assertThat(noKlass.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_teach_the_student_or_not(){
        List<Klass> klasses = new ArrayList<Klass>();
        Teacher tom = new Teacher("001","Tom", 21, klasses,fakedOut);

        Klass klass1 = new Klass(1,null);
        Klass klass2 = new Klass(2,tom);
        Klass klass3 = new Klass(3,tom);

        Student jerry = new Student("002","Jerry",10,klass2);
        assertThat(tom.isTeaching(jerry),is("true"));
        Student merry = new Student("003","Merry",9,klass1);
        assertThat(tom.isTeaching(merry),is("false"));
    }
    @Test
    public void should_print_new_student_join(){
        List<Klass> klasses = new ArrayList<Klass>();
        Teacher tom = new Teacher("001","Tom", 21, klasses,fakedOut);
        Klass klass2 = new Klass(2,tom);
        Klass klass3 = new Klass(3,tom);
        Student jerry = new Student("002","Jerry",10,null);
        klass2.appendMember(jerry,fakedOut);
        verify(fakedOut).println("I am Tom. I know Jerry has joined Class 2.");
    }
    @Test
    public void should_print_leader_of_klass(){
        List<Klass> klasses = new ArrayList<Klass>();
        Teacher tom = new Teacher("001","Tom", 21, klasses,fakedOut);
        Klass klass2 = new Klass(2,tom);
        Klass klass3 = new Klass(3,tom);
        Student jerry = new Student("002","Jerry",10,klass2);
        klass2.assignLeader(jerry,fakedOut);
        verify(fakedOut).println("I am Tom. I know Jerry become Leader of Class 2.");
    }
}
