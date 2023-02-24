package P06OrderByAge;

public class Person {

    private String  name;
    private String  id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this. name;
    }

    public String getId() {
        return  this. id;
    }

    public int getAge() {
        return this. age;
    }

    @Override
    public String toString() {
        //Stephan with ID: 524244 is 10 years old.
        return String.format("%s with ID: %s is %d years old.",this.getName(),this.getId(),this.getAge());
    }
}
