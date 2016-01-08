import org.junit.Test;
import org.mockito.internal.util.collections.ListUtil;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
    @Test
    public void should_introduce_with_name_age_and_klasses(){
        Klass klass2 = new Klass(2);
        Klass klass3 = new Klass(3);
        List<Klass> klasses = new ArrayList<Klass>();
        klasses.add(klass2);
        klasses.add(klass3);
        Teacher tom = new Teacher("001","Tom", 21, klasses);
        assertThat(tom.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3."));
    }
    @Test
    public void should_teach_no_klass(){
        Teacher noKlass = new Teacher("001","Tom",21,null);
        assertThat(noKlass.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_teach_the_student_or_not(){
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Klass klass3 = new Klass(3);
        List<Klass> klasses = new ArrayList<Klass>();
        klasses.add(klass2);
        klasses.add(klass3);
        Teacher tom = new Teacher("001","Tom", 21, klasses);
        Student jerry = new Student("002","Jerry",10,klass2);
        assertThat(tom.isTeaching(jerry),is("true"));
        Student merry = new Student("003","Merry",9,klass1);
        assertThat(tom.isTeaching(merry),is("false"));
    }
}
