/**
 * Created by julie on 1/7/16.
 */
public class Worker extends Person{
    public Worker(String name, int age) {
        super(name,age);
    }
    public String introduce(){
        return "I am a Worker. I have a job.";
    }
}
