package groupproject220marlins;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * This class will be for all of our Database functions, and for manipulating
 * all the data into instances of our java classes.
 *
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 */
public class MySqlFunctions {

    //<editor-fold desc="Fields">
    
    // This is the connection to the database on a machine hosted
    // at Dereks house. Could be a server anywhere in the world
    private Connection connect = null;
    // Variable used for statements for database manipulation
    private Statement statement = null;
    // Variable used for creating prepared statements for database manipulation
    private PreparedStatement preparedStatement = null;
    //  Variable used for the data returned by queries to the database
    private ResultSet resultSet = null;
    
    //</editor-fold>

    //<editor-fold desc="Constructors, Getters and Setters" >
    public MySqlFunctions() {
    }

    public Connection getConnect() {
        return connect;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    //</editor-fold>
    
    /**
     * This method connects to our MySQL database then loads our data from our
     * database. We use other methods to parse the data and populate the forum
     * with the data.
     *
     * @param tableID The ID of the Table in the Database
     *
     * @throws java.lang.Exception
     */
    public void readDataBase(int tableID) throws Exception {
        try {

            // this will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // setup the connection with the DB.
            connect = DriverManager
                    .getConnection("jdbc:mysql://IPADDRESS USER PW GO HERE");

            // statements allow to issue SQL queries to the database
            statement = connect.createStatement();

            // this will be where we load all data from all the tables in the
            // database.
            // resultSet gets the result of the SQL query
            resultSet = statement
                    .executeQuery("THIS WILL BE OUR SELECT STATEMENT TO "
                            + "RETRIEVE THE DATA FROM THE DB");

            // or we can use a prepared statement to make the 
            // preparedStatements can use variables and are more efficient
            // parameters start with 1
            //  preparedStatement = connect
            //        .prepareStatement("insert into  FEEDBACK.COMMENTS values (default, ?, ?, ?, ? , ?, ?)");
            // we can use prepared statements to post
            // preparedStatement.executeUpdate();
            // resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {

        } finally {
            closeDatabaseConnections();
        }
    }

    /**
     * This method closes all database connections at once.
     *
     */
    private void closeDatabaseConnections() {
        // you need to close all three to make sure
        closeDatabaseConnections((Closeable) resultSet);
        closeDatabaseConnections((Closeable) statement);
        closeDatabaseConnections((Closeable) connect);
    }

    /**
     * This method closes a database connection individually.
     *
     * @param c Individual connection to be closed.
     */
    private void closeDatabaseConnections(Closeable c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            // don't throw now as it might leave following closables in undefined state
        }
    }

    /**
     * This method will be used to create a new <Thread> in our database, and
     * insert it into the proper table, using the proper data from the instances
     * of the classes used
     *
     * @param tableID The ID of the table containing the data in the database
     * @throws SQLException
     */
    private void writeNewThreadToDatabase(int tableID) throws SQLException {

    }

    /**
     * This method will be used to write a new reply to a <Thread> into our
     * database to the proper table using the table id
     *
     * @param tableID The ID of the table containing the data in the database
     * @throws SQLException
     */
    private void writeNewReplyToDatabase(int tableID) throws SQLException {

    }

    /**
     * This method takes our result set from our database query and loads the
     * data into an instance of the Forum Class. This will be the base instance
     * of the forum, and will contain all data once all the data loading and
     * parsing has completed.
     */
    private void loadForum() {

    }

    /**
     * This method takes our result set from our database query and loads the
     * data into an ArrayList of Users
     *
     * @return Returns an ArrayList of <User> containing all the user data
     */
    private ArrayList<User> loadUsers() {
        return null;
    }

    /**
     * This method will parse the tables data for each sub-forum, and create the
     * an instance of the sub-forum class, and populate it with the data
     * retrieved from the database
     *
     */
    private void loadSubForum() {

    }

    /**
     * This method will parse the data for each thread and create instances of
     * the thread class for each thread contained in the sub-forum.
     *
     * @return Returns an ArrayList of <Thread> for each sub-forum
     */
    private ArrayList<Thread> loadThreads() {
        return null;

    }

    /**
     * This method will parse the replies for each thread contained in the
     * sub-forum, by creating instances of the <Message> class
     *
     * @return Returns an ArrayList of <Message> for each <Thread> replies
     */
    private ArrayList<Message> loadReplies() {
        return null;

    }

    /**
     * TODO
     */
    public void postNewThread() {

    }

    /**
     * TODO
     */
    public void postReplyToThread() {

    }

}
