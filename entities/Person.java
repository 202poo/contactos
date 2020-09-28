package entities;

public class Person {
    int id;
    String name;
    String sex;

    public Person() {
    }
    public Person(String name) {
        this.name=name;
    }
    public Person(String name, String sex) {
        this.name=name;
        this.sex=sex;
    }

    public void laugh() {
        System.out.println( name + " jejeje!");
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
