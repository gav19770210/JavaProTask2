package ru.gav19770210.javapro.task02;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Employee {
    String name;
    int age;
    EmployeePost post;
}
