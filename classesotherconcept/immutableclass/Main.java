package privatejavaprinciples.classesotherconcept.immutableclass;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("David", 25);
        System.out.println(person.getName());
        //person.setName("John") //gives error can not set new name per person object after creation
    }
    
}
