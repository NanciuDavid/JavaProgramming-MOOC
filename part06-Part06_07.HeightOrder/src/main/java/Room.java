import java.util.*;

public class Room {
    private ArrayList<Person> persons = new ArrayList<Person>() ;


    public Room() {
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() { 
        if(persons.isEmpty()) {
            return true;
        }  else
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        
        //room empty --> return null

        Person shortestPerson = null ; 

        if(this.persons.isEmpty()) {
            return shortestPerson;
        } else 
        {
            shortestPerson = persons.get(0);
            for(int i =  1 ; i < persons.size() ; i++) {
                if(shortestPerson.getHeight() > persons.get(i).getHeight()) {
                    shortestPerson = persons.get(i);
                }
            }
        }

        return shortestPerson;
        }

        public Person take() {
            for(Person person : persons) {
                if(person.getHeight() == this.shortest().getHeight()) {
                    persons.remove(person);
                    return person;
                }
            }
            return null;
        }

}
