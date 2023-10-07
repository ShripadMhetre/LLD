package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    String name;
    protected int age;
    private Double bankBalance;

    Student(Student ref) {
        this.name = ref.name;
        this.age = ref.age;
        this.bankBalance = ref.bankBalance;
    }

}
