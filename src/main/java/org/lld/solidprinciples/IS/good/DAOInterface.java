package org.lld.solidprinciples.IS.good;

/** Here, DAOInterface only accomodates common operations of DB and File Connections.
 *  And, we segregate BadDAOInterface into multiple smaller interfaces
 *  which can be implemented as and when needed by independent DAO connections.
 */
public interface DAOInterface {
    void createRecord();
    void deleteRecord();
}
