package kata1v1;

import java.util.Date;

public class Kata1v1 {
    
    public static void main(String[] args) {
        
        Person person = new Person("Silvio", new Date(91,8,23));
        System.out.println(person.getName() + "tiene" + person.getAge() + "anni");
    }
    
}
