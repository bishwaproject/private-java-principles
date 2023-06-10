package privatejavaprinciples.classesotherconcept.immutableclass;

public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
   
    public int getAge(){
        return age;
    }

    //No Setter Methods actually final keywords in class level does not allow to implement setMethod
    /*
     *  public void setName(String name){
        this.name = name;
    }
     */
    @Override
    public String toString(){
        return "Person [name=]" + name + ", age=" + age + "]";
    }
    
}
