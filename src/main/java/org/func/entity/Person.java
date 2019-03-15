package src.main.java.org.func.entity;

public enum Person {

    BOSS("B",48),WORKER("W",30),CONSTRUCTION("C",43);
    private String name;
    private int age;
    private Person(String name,int age){
        this.age = age;
        this.name =name;

    }

}
