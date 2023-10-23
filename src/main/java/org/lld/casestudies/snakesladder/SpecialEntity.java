package org.lld.casestudies.snakesladder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class SpecialEntity {
    private int start;
    private int end;

    public abstract String getId();

}
