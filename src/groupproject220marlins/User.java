
package groupproject220marlins;

import java.util.ArrayList;

/**
 * This is the User Class, containing the data for our users of the forum
 *
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 */
public class User {
    
    // String containing the users name 
    private String userName = null;
    // Int that is the users ID, will also be the DB key.
    private int userId = 0;

    //<editor-fold desc="Constructor, Getter and Setter">
    
    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    //</editor-fold>
    

    
    
}
