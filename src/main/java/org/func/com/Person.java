package src.main.java.org.func.com;

/**
 * function
 *
 * @author wangyifan
 */
public class Person {
    private String name;
    private int id;
    private int age;

    public Person() {
        cry();
    }

    public void Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("wawawa");

    }

}
