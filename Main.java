import java.util.Scanner;

import data.PersonData;
import entities.Person;

public class Main {

    public static void main(String[] args) {
        PersonData data = new PersonData();
        Scanner input = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("4 Get byID ");
            System.out.println("5 Update ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("Listado de personas ");
                    for (Person d : data.list("")) {
                        System.out.println(d.getId() + "\t" + d.getName());
                    }
                    break;
                case 2:
                    System.out.println("Nueva persona ");
                    Person p = new Person();
                    System.out.print("name: ");
                    p.setName(input.nextLine());

                    data.create(p);
                    break;
                case 3:
                    System.out.println("Eliminar persona ");
                    System.out.print("id: ");
                    data.delete(input.nextInt());
                    break;
                case 4:
                    System.out.println("get persona ");
                    System.out.print("id: ");
                    Person d = data.get(input.nextInt());
                    System.out.println("Id: " + d.getId());
                    System.out.println("Name: " + d.getName());
                    break;
                case 5:
                    System.out.println("update persona ");
                    System.out.print("id: ");
                    Person per = data.get(input.nextInt());
                    if (per != null) {
                        System.out.println("Name current: " + per.getName());
                        input.nextLine(); // Limpiar el buffer
                        System.out.print("new name: ");
                        per.setName(input.nextLine());

                        // System.out.println("Sex current: "+per.getSex());
                        // System.out.print("new sex: ");
                        // per.setSex(input.nextLine());
                        data.update(per);
                    } else {
                        System.out.println("NO encontrado");
                    }

                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opt != 0);
    }
}
