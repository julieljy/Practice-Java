import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by julie on 1/7/16.
 */
public class TeacherTest {
    @Test
    public void should_introduce_with_name_age_and_klass(){
        Teacher tom = new Teacher("Tom", 21, 2);
        assertThat(tom.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));
        Teacher noKlass = new Teacher("Tom",21,null);
        assertThat(noKlass.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
}
