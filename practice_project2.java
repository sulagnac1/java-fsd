package demo;

// default
public class access_modifier {
    
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("sulagna");
        person.setAge(23);
        person.display();
    }
    
}

class Person {
    
    private String name;
    protected int age;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void display() {
    	System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        }
    }
