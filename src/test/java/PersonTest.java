import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by julie on 1/7/16.
 */
public class PersonTest {
    @Test
    public void should_basic_introduce_with_name_and_age(){
        assertThat(new Person("Tom",21).basicIntroduce(),is("My name is Tom. I am 21 years old."));
    }
}
