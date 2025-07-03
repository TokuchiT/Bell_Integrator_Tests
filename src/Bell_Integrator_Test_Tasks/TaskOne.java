package Bell_Integrator_Test_Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskOne {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Кирилл", "26", "Middle java dev", "150000 руб");
        Employee emp2 = new Employee("Виталий", "28", "Senior java automation QA", "2000$");
        Employee emp3 = new Employee("Александр", "31", "junior functional tester", "50000 руб");
        Employee emp4 = new Employee("Дементий", "35", "dev-ops", "1500$");

        List<Map<String,String>> table = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Имя", emp1.name);
        map1.put("Возраст",emp1.age);
        map1.put("Должность", emp1.post);
        map1.put("Зарплата", emp1.sallary);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Имя", emp2.name);
        map2.put("Возраст",emp2.age);
        map2.put("Должность", emp2.post);
        map2.put("Зарплата", emp2.sallary);

        Map<String, String> map3 = new HashMap<>();
        map3.put("Имя", emp3.name);
        map3.put("Возраст",emp3.age);
        map3.put("Должность", emp3.post);
        map3.put("Зарплата", emp3.sallary);

        Map<String, String> map4 = new HashMap<>();
        map4.put("Имя", emp4.name);
        map4.put("Возраст",emp4.age);
        map4.put("Должность", emp4.post);
        map4.put("Зарплата", emp4.sallary);


        table.add(map1);
        table.add(map2);
        table.add(map3);
        table.add(map4);


        System.out.println("Имена сотрудников младще 30:");
        table.stream().filter(e -> Integer.parseInt(e.get("Возраст")) < 30)
                .map(e -> e.get("Имя")).forEach(System.out::println);
        System.out.println();


        System.out.println("Имена сотрудников, получающих зарплату в рублях:");
        table.stream().filter(e -> e.get("Зарплата").contains("руб"))
                .map(e -> e.get("Имя")).forEach(System.out::println);
        System.out.println();


        System.out.println("Средний возраст сотрудников:");
        double avgAge = table.stream().mapToInt(e -> Integer.parseInt(e.get("Возраст")))
                .average().orElse(0);
        System.out.println(avgAge);
    }
}

class Employee{

    String name;
    String age;
    String post;
    String sallary;

    public Employee(String name, String age, String post, String sallary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.sallary = sallary;
    }

}
