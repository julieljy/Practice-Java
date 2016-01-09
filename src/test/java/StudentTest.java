import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by julie on 1/7/16.
 */
public class StudentTest {
    private PrintStream fakedOut;
    @Before
    public void getFakedOut(){
        fakedOut = mock(PrintStream.class);
    }
    @Test
    public void should_introduce_with_name_age_and_klass(){
        Klass klass = new Klass(2,null);
        Student tom = new Student("001","Tom", 21, klass);
        assertThat(tom.introduce(), is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
    }
    @Test
    public void should_introduce_with_name_age_klass_and_leader(){
        Klass klass = new Klass(2,null);
        Student tom = new Student("001","Tom", 21, klass);
        klass.assignLeader(tom,fakedOut);
        assertThat(tom.introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2."));
    }
}
