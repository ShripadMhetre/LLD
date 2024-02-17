package org.lld.solidprinciples.IS.bad;

/** This DAO interface defines method related to DB operations as well as File Operations.
 * This is a bad interface design, since DB or File DAOs would need to implement unnecessary methods as well.
 *
 * Interface Segregation Principle (ISP) :-
 *  "no code should be forced to depend on methods it does not use. ISP splits interfaces that are very large into
 *      smaller and more specific ones so that clients will only have to know about the methods that are of interest to them."
 */
public interface BadDAOInterface {
    void openConnection();
    void createRecord();
    void openFile();
    void deleteRecord();
}
