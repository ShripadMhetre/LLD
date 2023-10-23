package org.lld.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;

// Step 3: Base Decorator
//      (we use abstract class, since we need to store the reference of next decorator layer)
@AllArgsConstructor
public abstract class BaseDecorator implements Datasource {
    public Datasource nextLayer;
}
