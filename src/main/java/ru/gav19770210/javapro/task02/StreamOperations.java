package ru.gav19770210.javapro.task02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
Все задачи должны быть выполнены в одну строку.
- Реализуйте удаление из листа всех дубликатов
- Найдите в списке целых чисел 3-е наибольшее число (пример: 5 2 10 9 4 3 10 1 13 => 10)
- Найдите в списке целых чисел 3-е наибольшее «уникальное» число (пример: 5 2 10 9 4 3 10 1 13 => 9, в отличие от прошлой задачи здесь разные 10 считает за одно число)
- Имеется список объектов типа Сотрудник (имя, возраст, должность), необходимо получить список имен 3 самых старших сотрудников с должностью «Инженер», в порядке убывания возраста
- Имеется список объектов типа Сотрудник (имя, возраст, должность), посчитайте средний возраст сотрудников с должностью «Инженер»
- Найдите в списке слов самое длинное
- Имеется строка с набором слов в нижнем регистре, разделенных пробелом. Постройте хеш-мапы, в которой будут хранится пары: слово - сколько раз оно встречается во входной строке
- Отпечатайте в консоль строки из списка в порядке увеличения длины слова, если слова имеют одинаковую длины, то должен быть сохранен алфавитный порядок
- Имеется массив строк, в каждой из которых лежит набор из 5 строк, разделенных пробелом, найдите среди всех слов самое длинное, если таких слов несколько, получите любое из них
*/
public class StreamOperations {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Integer getThirdMaxInt(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .min(Comparator.naturalOrder())
                .orElseThrow();
    }

    public static Integer getThirdMaxUniqueInt(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .min(Comparator.naturalOrder())
                .orElseThrow();
    }

    public static List<String> getThreeOldestEngineer(List<Employee> list) {
        return list.stream()
                .filter(employee -> employee.getPost() == EmployeePost.ENGINEER)
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public static Double getAverageAgeEngineer(List<Employee> list) {
        return list.stream()
                .filter(employee -> employee.getPost() == EmployeePost.ENGINEER)
                .mapToInt(Employee::getAge)
                .summaryStatistics()
                .getAverage();
    }

    public static String getLongestString(List<String> list) {
        return list.stream()
                .max(Comparator.comparing(String::length))
                .orElseThrow();
    }

    public static Map<String, Long> getWordsAndCount(String s) {
        return Arrays.stream(s.split("\\s+"))
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()));
    }

    public static List<String> getSortedStringByLengthAndAlphabet(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static String getLongestWord(List<String> list){
        return list.stream()
                .flatMap(Pattern.compile("\\s+")::splitAsStream)
                .max(Comparator.comparing(String::length))
                .orElseThrow();
    }
}
