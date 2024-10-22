package ru.gav19770210.javapro.task02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class StreamOperationsTest {
    @Test
    public void removeDuplicatesTest() {
        var integerList = List.of(5, 2, 10, 9, 4, 3, 10, 1, 13);
        var result = List.of(5, 2, 10, 9, 4, 3, 1, 13);
        Assertions.assertEquals(result, StreamOperations.removeDuplicates(integerList));
    }

    @Test
    public void getThirdMaxIntTest() {
        var integerList = List.of(5, 2, 10, 9, 4, 3, 10, 1, 13);
        var result = 10;
        Assertions.assertEquals(result, StreamOperations.getThirdMaxInt(integerList));
    }

    @Test
    public void getThirdMaxIntTestEmpty() {
        var integerList = List.of(0);
        Assertions.assertEquals(0, StreamOperations.getThirdMaxInt(integerList));
    }

    @Test
    public void getThirdMaxUniqueIntTest() {
        var integerList = List.of(5, 2, 10, 9, 4, 3, 10, 1, 13);
        var result = 9;
        Assertions.assertEquals(result, StreamOperations.getThirdMaxUniqueInt(integerList));
    }

    @Test
    public void getThreeOldestEngineerTest() {
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
        var result = List.of("Roman", "Jo", "Olga");
        Assertions.assertEquals(result, StreamOperations.getThreeOldestEngineer(employees));
    }

    @Test
    public void getAverageAgeEngineerTest() {
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
        var result = 46.25;
        Assertions.assertEquals(result, StreamOperations.getAverageAgeEngineer(employees));
    }

    @Test
    public void getLongestStringTest() {
        var stringList = List.of("1", "22", "333", "4444");
        Assertions.assertEquals("4444", StreamOperations.getLongestString(stringList));
    }

    @Test
    public void getWordsAndCountTest() {
        var s = "ехал грека видит грека сунул грека";
        Map<String, Long> result = Map.of("ехал", 1L,
                "грека", 3L,
                "видит", 1L,
                "сунул", 1L);
        Assertions.assertEquals(result, StreamOperations.getWordsAndCount(s));
    }

    @Test
    public void getSortedStringByLengthAndAlphabetTest() {
        var stringList = List.of("1x", "3zse", "1a", "2qw");
        var result = List.of("1a", "1x", "2qw", "3zse");
        Assertions.assertEquals(result, StreamOperations.getSortedStringByLengthAndAlphabet(stringList));
    }

    @Test
    public void getLongestWordTest() {
        List<String> stringList = List.of(
                "1 2 3 4 5",
                "раз два три четыре пять",
                "десять двадцать тридцать сорок пятьдесят",
                "сто двести триста четыреста пятьсот"
        );
        var result = StreamOperations.getLongestWord(stringList);
        Assertions.assertTrue(result.equals("пятьдесят") || result.equals("четыреста"));
    }
}
