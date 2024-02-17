package org.lld.solidprinciples.IS.bad;

public class BadFileDAOConnection implements BadDAOInterface {
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("Files don't support openConnection() operation.");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
