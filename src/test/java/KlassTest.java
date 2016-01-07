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
}
