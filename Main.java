import entities.Person;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("David "+p);
        p.setSex("M");
        System.out.println("sexo= "+ p.getSex() );
        p.laugh();

        Person p2 = new Person("Gloria","F");
        System.out.println("sexo= "+ p2.getSex() );
        p2.laugh();


    }
}
