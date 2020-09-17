import entities.Person;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("David");
        p.setSex("M");
        System.out.println("sexo= "+ p.getSex() );
        p.laugh();

    }
}
