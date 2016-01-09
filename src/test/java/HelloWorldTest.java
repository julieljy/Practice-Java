import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void hello_world_test(){
       assertThat("Hello World",is("Hello World"));
       assertThat(new HelloWorld().beenCalled(),is("Hello World"));
    }

    @Test
    public void should_be_mocked(){
        HelloWorld helloWorld = mock(HelloWorld.class);
        when(helloWorld.beenCalled()).thenReturn("Leave me alone.");

        assertThat(helloWorld.beenCalled(), is("Leave me alone."));
//
//        String a = "1";
//        String b = new String("1");
//
//        String x = "12";
//
//        System.out.println(x.substring(0,1));
//        System.out.println(x);
//
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        System.out.println(new Klass(1).equals(new Klass(1)));
//        System.out.println(new Klass(1)==new Klass(1));
    }
//    @Test
//    public void hello_world_spy(){
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.say(System.out);
//
//
//        PrintStream fakedOut = mock(PrintStream.class);
//
//        helloWorld.say(fakedOut);
//
//        verify(fakedOut).println("aaa");
//
//    }
}
