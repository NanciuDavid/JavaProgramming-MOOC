
public class HealthStation {


    private int count =  0;

    public int weigh(Person person) {
        if(person.getWeight() < 0)
        return -1;
        else
        {
        this.count++;
        return person.getWeight();
        }
    }

    public void feed(Person person) { 
       int newWeight = person.getWeight();
       newWeight++;
       person.setWeight(newWeight);
    }

    public int weighings(){
        return this.count;
    }

}
