package org.example.casestudies.snakesladder;

import lombok.Getter;

import java.util.HashMap;

public class Board {
    @Getter
    private final int dimension;
    private HashMap<Integer, SpecialEntity> specialEntities;

    public Board(int dimension) {
        this.dimension = dimension;
        specialEntities = new HashMap<>();
    }

    public int getTotalCells() {
        return dimension * dimension;
    }

    public void addSpecialEntity(SpecialEntity entity) {
        int startPosition = entity.getStart();
        specialEntities.put(startPosition, entity);
    }

    public boolean hasSpecialEntity(int nextPosition) {
        return specialEntities.containsKey(nextPosition);
    }

    public SpecialEntity getSpecialEntity(int position) {
        if (hasSpecialEntity(position)) return specialEntities.get(position);

        return null;
    }

    public void printBoard() {
        int totalCells = getTotalCells();

        for (int i = totalCells; i > 0; i--) {
            System.out.print(" | " + i + " ");

            if (hasSpecialEntity(i))
                System.out.print(specialEntities.get(i).getId());

            System.out.print(" |");
            if (totalCells % 10 == 0)
                System.out.println();
        }
    }
}
