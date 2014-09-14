
package groupproject220marlins;

import java.util.ArrayList;

/**
 * This class is the Sub-Forums of our message board. It contains
 * all the threads of the sub-forum, and its database table ID
 *
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 */
public class SubForum {
    
    //<editor-fold desc="Fields">
    
    // the name of the Sub-Forum
    private String subForumName = null;
    // Subject Tagline to tell the user the subject of the sub-forum
    private String subForumSubject = null;
    // ID number, used as key in DB
    private int subForumTableID = 0;
    // collection of threads contained in the sub-forum
    private ArrayList<Thread> threads = null;

    //</editor-fold>
    
    //<editor-fold desc="Constructor, Getter and Setter">
    public SubForum() {
    }

    public String getSubForumName() {
        return subForumName;
    }

    public void setSubForumName(String subForumName) {
        this.subForumName = subForumName;
    }

    public String getSubForumSubject() {
        return subForumSubject;
    }

    public void setSubForumSubject(String subForumSubject) {
        this.subForumSubject = subForumSubject;
    }

    public int getSubForumTableID() {
        return subForumTableID;
    }

    public void setSubForumTableID(int subForumTableID) {
        this.subForumTableID = subForumTableID;
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }

    public void setThreads(ArrayList<Thread> threads) {
        this.threads = threads;
    }
    //</editor-fold>
    
    /**
     * Override of the ToString() to format the string how we want it to be
     * displayed to the end-user.
     *
     * @return Returns the post in a readable/displayable format.
     */
    @Override
    public String toString() {
        return "";
    }
 
    
}