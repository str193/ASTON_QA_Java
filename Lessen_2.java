

public class Lessen_2 {
    public static void main(String[] args) {
        //Задание 1
        Employee SIA = new Employee("Starovoitov Ivan Aleksandrovich", "QA Engineer Java", "str@inbox.ru", 89052274327L, 100, 29);
        System.out.println("Задание 1:");
        System.out.println(SIA+ "\n");


        //Задание 2
        System.out.println("Задание 2:");
        Employee[] persArray = new Employee[5];
        persArray[0] = SIA;
        persArray[1] =  new Employee("Ivanov Ivan Ivanovich", "Builder", "ivivan@mailbox.com", 892312312L, 30000, 50);
        persArray[2] =  new Employee("Volkov Igor Denisovich", "Driver", "volk@mailbox.com", 823435654L, 55000, 25);
        persArray[3] =  new Employee("Dralov Vadim Vladimirovich", "Farmer", "dranik@mailbox.com", 82353875L, 66000, 18);
        persArray[4] =  new Employee("Kornev Viktor Fedorovich", "HR", "kor@mailbox.com", 887843223L, 77777, 80);
        for (Employee employeeInfo : persArray) {
            System.out.println(employeeInfo);
        }


        //Задание 3
        System.out.println("\n" + "Задание 3:");
        Park[] attractions = new Park[3];
        attractions[0] = new Park("Ferris wheel", "10:00 - 18:00", 40.00);
        attractions[1] = new Park("Roller coaster", "10:00 - 18:00", 90.00);
        attractions[2] = new Park("Racing cars", "10:00 - 18:00", 200.00);
        for (Park attractionsInfo : attractions) {
            System.out.println(attractionsInfo);
        }

        
    }


public static class Employee {
        private String fullName;
        private String position;
        private String email;
        private long tel;
        private int salary;
        private int age;
        public Employee(String fullName, String position, String email, long tel, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            this.age = age;
        }
        public String getFullName() {
            return fullName;
        }
        public String getPosition() {
            return position;
        }
        public String getEmail() {
            return email;
        }
        public long getTel() {
            return tel;
        }
        public int getSalary() {
            return salary;
        }
        public int getAge() {
            return age;
        }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО = " + fullName + '\'' +
                ", должность = " + position + '\'' +
                ", email = " + email + '\'' +
                ", телефон = " + tel +
                ", зарплата = " + salary +
                ", возраст = " + age;
    }

    }




public static class Park{
    private String name;
    private String hoursOfWork;
    private double cost;


public Park(String name, String hoursOfWork, double cost) {
    this.name = name;
    this.hoursOfWork = hoursOfWork;
    this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public String getHoursOfWork() {
        return hoursOfWork;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Аттракцион = " + name + ",  время работы = " + hoursOfWork + ", стоимость = " + cost;
    }
    }

}