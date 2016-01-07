import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by julie on 1/7/16.
 */
public class StudentTest {
    @Test
    public void should_introduce_with_name_age_and_klass(){
        Klass klass = new Klass(2);
        Student tom = new Student("Tom", 21, klass);
        assertThat(tom.introduce(), is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
    }
}
