package groupproject220marlins;

import java.time.LocalDate;

/**
 * This class is the actual message contents, containing all the data of the
 * individual posts to the forum.
 *
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 */
public class Message {

    //<editor-fold desc="Fields">
    
    // <User> of the post
    private User user = null;
    // Rating the <User> gave the thread
    private Rating threadRating = null;
    // Date and Time of post
    private LocalDate postTime = null;
    // Subject of the post
    private String postSubject = null;
    // Actual Post Contents
    private String postContents = null;
    // ID of the thread that the <User>'s post is replying to
    private int threadID = 0;

    //</editor-fold>
    
    //<editor-fold desc="Constructor,Getter and Setter">
    public Message() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rating getThreadRating() {
        return threadRating;
    }

    public void setThreadRating(Rating threadRating) {
        this.threadRating = threadRating;
    }

    public LocalDate getPostTime() {
        return postTime;
    }

    public void setPostTime(LocalDate postTime) {
        this.postTime = postTime;
    }

    public String getPostSubject() {
        return postSubject;
    }

    public void setPostSubject(String postSubject) {
        this.postSubject = postSubject;
    }

    public String getPostContents() {
        return postContents;
    }

    public void setPostContents(String postContents) {
        this.postContents = postContents;
    }

    public int getThreadID() {
        return threadID;
    }

    public void setThreadID(int threadID) {
        this.threadID = threadID;
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
        String s = "";
        return s;
    }

}
