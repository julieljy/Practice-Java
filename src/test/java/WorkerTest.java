
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by julie on 1/7/16.
 */
public class WorkerTest {
    @Test
    public void should_introduce_with_name_and_age(){
        Worker tom = new Worker("Tom", 21);
        String basic = tom.basicIntroduce();
        String worker = tom.introduce();
        assertThat(basic+worker,is("My name is Tom. I am 21 years old. I am a Worker. I have a job."));
    }
}
