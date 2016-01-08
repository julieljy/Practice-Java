/**
 * Created by julie on 1/7/16.
 */
public class Worker extends Person{
    public Worker(String id,String name,int age) {
        super(id,name,age);
    }
    public String introduce(){
        return super.introduce()+" I am a Worker. I have a job.";
    }
}
