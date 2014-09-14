package groupproject220marlins;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *This is the thread class, containing the fields for the data
 * of the individual threads contained in each sub-forum.
 * 
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 */
public class Thread {

    //<editor-fold desc="Fields">
    // The message that is the first and initial post in the Sub-forum
    private Message mainPost = null;
    
    // This will be used when creating/displaying the thread, it is the title 
    // of the thread that will be displayed when viewing all threads 
    //in the sub-forum
    private String postTitle = null;
    
    // This is an ArrayList of the replies to the main post.
    private ArrayList<Message> replies = null;
    
    // This will be the threads average rating from all posters
    private Rating averageRating = null;
    
    // This is the ID number in the database of the thread.
    private int threadID = 0;
    
    // Date and time stamp of the post.
    private LocalDate postDate = null;
    //</editor-fold>

    //<editor-fold desc="Constructor,Getters and Setters">
    public Thread() {
    }

    public Message getMainPost() {
        return mainPost;
    }

    public void setMainPost(Message mainPost) {
        this.mainPost = mainPost;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public ArrayList<Message> getReplies() {
        return replies;
    }

    public void setReplies(ArrayList<Message> replies) {
        this.replies = replies;
    }

    public Rating getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Rating averageRating) {
        this.averageRating = averageRating;
    }

    public int getThreadID() {
        return threadID;
    }

    public void setThreadID(int threadID) {
        this.threadID = threadID;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }
    //</editor-fold>
       
    /**
     * This method calculates the average rating of the thread based 
     * on the ratings given by the users who replied to the thread.
     * 
     * @param replies The replies to the threads main post. 
     * @return Returns the average rating of the post, rounded down/up.
     */
    private ArrayList<Message> calcThreadRating(ArrayList<Message> replies){
        return null;
        
    }

}
