package org.example.designpatterns.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Step 0: Create Observable entity
@AllArgsConstructor
@Getter
@Setter
public class Bitcoin {
    private Double price;
}
