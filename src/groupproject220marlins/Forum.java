package groupproject220marlins;

import java.util.ArrayList;

/**
 * Very Basic and empty class currently, will have more later probably.
 * This will end up being the one object used for all manipulation
 * of the forum itself.
 *
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 */
public class Forum {
    
    String forumName = null;
    ArrayList<SubForum> subForums = null;

    public Forum() {
    }

    public String getForumName() {
        return forumName;
    }

    public void setForumName(String forumName) {
        this.forumName = forumName;
    }

    public ArrayList<SubForum> getSubForums() {
        return subForums;
    }

    public void setSubForums(ArrayList<SubForum> subForums) {
        this.subForums = subForums;
    }
    




}
