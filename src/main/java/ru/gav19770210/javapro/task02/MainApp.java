package ru.gav19770210.javapro.task02;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(5, 2, 10, 9, 4, 3, 10, 1, 13);
        System.out.println("removeDuplicates: " + StreamOperations.removeDuplicates(integerList));
        System.out.println("getThirdMaxInt: " + StreamOperations.getThirdMaxInt(integerList));
        System.out.println("getThirdMaxInt: " + StreamOperations.getThirdMaxInt(List.of(0)));
        System.out.println("getThirdMaxUniqueInt: " + StreamOperations.getThirdMaxUniqueInt(integerList));

        List<Employee> employees = List.of(
                new Employee("Hu", 20, EmployeePost.TESTER),
                new Employee("Alex", 25, EmployeePost.ANALYST),
                new Employee("July", 30, EmployeePost.ENGINEER),
                new Employee("Ivan", 35, EmployeePost.ANALYST),
                new Employee("Olga", 40, EmployeePost.ENGINEER),
                new Employee("Peter", 45, EmployeePost.MANAGER),
                new Employee("Jo", 50, EmployeePost.ENGINEER),
                new Employee("Helen", 55, EmployeePost.MANAGER),
                new Employee("Boris", 60, EmployeePost.DIRECTOR),
                new Employee("Roman", 65, EmployeePost.ENGINEER)
        );
        System.out.println("getThreeOldestEngineer: " + StreamOperations.getThreeOldestEngineer(employees));
        System.out.println("getAverageAgeEngineer: " + StreamOperations.getAverageAgeEngineer(employees));

        System.out.println("getLongestString: " + StreamOperations.getLongestString(List.of("1", "22", "333", "4444")));
        System.out.println("getWordsAndCount: " + StreamOperations.getWordsAndCount("ехал грека видит грека сунул грека"));
        System.out.println("getSortedStringByLengthAndAlphabet: " + StreamOperations.getSortedStringByLengthAndAlphabet(List.of("1x", "3zse", "1a", "2qw")));

        List<String> stringList = List.of(
                "1 2 3 4 5",
                "раз два три четыре пять",
                "десять двадцать тридцать сорок пятьдесят",
                "сто двести триста четыреста пятьсот"
        );
        System.out.println("getLongestWord: " + StreamOperations.getLongestWord(stringList));
    }
}
