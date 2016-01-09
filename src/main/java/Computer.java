import java.io.PrintStream;

/**
 * Created by julie on 1/9/16.
 */
public class Computer implements Inform {

    private String name;
    private PrintStream printer;

    public Computer(String name, PrintStream printer) {
        this.name = name;
        this.printer = printer;
    }

    public void informStudent(Student student) {
        this.printer.println( "I am "+this.name+". I know "+student.getName()+" has joined Class "+student.getKlass().getNumber()+".");
    }

    public void informLeader(Student student) {
        this.printer.println( "I am "+this.name+". I know "+student.getName()+" become Leader of Class "+student.getKlass().getNumber()+".");
    }
}
