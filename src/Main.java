import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nВыберите задание (1-6) или введите 0 для выхода:");
            System.out.println("1. Задание 1-3 Имена");
            System.out.println("2. Задание 1-4 Время");
            System.out.println("3. Задание 2-4 Сотрудники и отделы");
            System.out.println("4. Задание 3-4 Сотрудники и отделы");
            System.out.println("5. Задание 4-4 Время");
            System.out.println("6. Задание 5-4 Время");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите число от 0 до 6.");
            }
        }
        scanner.close();
    }

    private static void task1() {
        System.out.println("\n--- Задание 1 ---");
        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

    private static void task2() {
        System.out.println("\n--- Задание 2 ---");
        int[] timeValues = {10, 10000, 100000};

        for (int value : timeValues) {
            Time time = new Time(value);
            System.out.println(value + " секунд = " + time);
        }
    }

    private static void task3() {
        System.out.println("\n--- Задание 3 ---");
        Department itDepartment = new Department("IT");

        Employee petrov = new Employee("Петров");
        Employee kozlov = new Employee("Козлов");
        Employee sidorov = new Employee("Сидоров");

        itDepartment.setHead(kozlov);

        petrov.setDepartment(itDepartment);
        kozlov.setDepartment(itDepartment);
        sidorov.setDepartment(itDepartment);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }

    private static void task4() {
        System.out.println("\n--- Задание 4 ---");
        Department3 itDepartment3 = new Department3("IT");

        Employee3 petrov3 = new Employee3("Петров");
        Employee3 kozlov3 = new Employee3("Козлов");
        Employee3 sidorov3 = new Employee3("Сидоров");

        petrov3.setDepartment(itDepartment3);
        kozlov3.setDepartment(itDepartment3);
        sidorov3.setDepartment(itDepartment3);

        itDepartment3.setHead(kozlov3);

        System.out.println(petrov3);
        System.out.println(kozlov3);
        System.out.println(sidorov3);

        System.out.println("\nСписок всех сотрудников отдела IT:");
        for (Employee3 emp : petrov3.getDepartmentEmployees()) {
            System.out.println(emp.getName());
        }
    }

    private static void task5() {
        System.out.println("\n--- Задание 5 ---");
        Time4 time1 = new Time4(10000);
        System.out.println("10000 секунд = " + time1);

        Time4 time2 = new Time4(2, 3, 5);
        System.out.println("2 часа, 3 минуты, 5 секунд = " + time2);
    }

    private static void task6() {
        System.out.println("\n--- Задание 6 ---");
        Time5 time6_1 = new Time5(34056);
        System.out.println("Время 34056 секунд соответствует " + time6_1.getHours() + " часам");

        Time5 time6_2 = new Time5(4532);
        System.out.println("Время 4532 секунды соответствует " + time6_2.getMinutes() + " минутам с начала текущего часа");

        Time5 time6_3 = new Time5(123);
        System.out.println("Время 123 секунды соответствует " + time6_3.getSeconds() + " секундам с начала текущей минуты");
    }
}