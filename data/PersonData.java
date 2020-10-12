package data;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis = new ArrayList<Person>();
    int id = 0;

    public void create(Person d) {
        //p.setId(++id);
        //lis.add(p);
        String sql = "INSERT INTO persons(name, sex, age) "
                + " VALUES(?,?,?) ";
        int i = 0;
        int res =0;
        try {
            PreparedStatement ps = Conn.connectSQLite().prepareStatement(sql);
            ps.setString(++i, d.getName());
            ps.setString(++i, d.getSex());
            ps.setInt(++i, d.getAge());
            res = ps.executeUpdate();// 0 no o 1 si commit
            System.out.println("create.res=" + res);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public List<Person> list(String filter) {
        List<Person> lis2 = new ArrayList<Person>();
        String sql = "SELECT * FROM persons ";
        try {
            Statement st = Conn.connectSQLite().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSex(rs.getString("sex"));
                p.setAge(rs.getInt("age"));
                lis2.add(p);                
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return lis2;
    }

    public Person get(int id) {
        int index = 0;
        for (Person d : lis) {
            if (d.getId() == id) {
                return lis.get(index);
            }
            index++;
        }
        return null;
    }

    // update(Person, int): void (o update(Person): void)
    public void update(Person p) {
        int index = 0;
        // boolean b=false;
        for (Person d : lis) {
            if (d.getId() == p.getId()) {
                // d = p;
                lis.set(index, p);
                // b=true;
            }
            index++;
        }
        // if (b)
        // System.out.println("encontrado");
        // else
        // System.out.println("NO encontrado");

    }

    public void delete(int id) {
        for (Person d : lis) {
            if (id == d.getId()) {
                lis.remove(d);
                // System.out.println("Eliminado " + d.getName());
            }
        }
    }

}
