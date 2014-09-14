package groupproject220marlins;

/**
 * This is an Enum of the possible ratings of a thread, from 1 to 5.
 *
 * @author Derek McGhee
 * @author Andrew Cheatwood 
 * @author Kevin Laws 
 *
 */
public enum Rating {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int value;

    private Rating(int value) {

        this.value = value;

    }

}
