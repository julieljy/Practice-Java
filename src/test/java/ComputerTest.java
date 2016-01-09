import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by julie on 1/9/16.
 */
public class ComputerTest {
    private PrintStream fakedOut;
    @Before
    public void getFakedOut(){
        fakedOut = mock(PrintStream.class);
    }
    @Test
    public void should_print_new_student_append_to_klass(){
        Klass klass2 = new Klass(2,null);
        Student jerry = new Student("002","Jerry",10,null);
        klass2.appendMember(jerry,fakedOut);
        verify(fakedOut).println("I am the Machine. I know Jerry has joined Class 2.");
    }
    @Test
    public void should_print_leader_of_klass(){
        Klass klass2 = new Klass(2,null);
        Student jerry = new Student("002","Jerry",10,klass2);
        klass2.assignLeader(jerry,fakedOut);
        verify(fakedOut).println("I am the Machine. I know Jerry become Leader of Class 2.");
    }
}
