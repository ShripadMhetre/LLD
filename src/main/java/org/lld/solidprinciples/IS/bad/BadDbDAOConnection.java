package org.lld.solidprinciples.IS.bad;

public class BadDbDAOConnection implements BadDAOInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("DB don't support openFile() operation.");
    }

    @Override
    public void deleteRecord() {

    }
}
