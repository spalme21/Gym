import java.util.ArrayList;

public class Trainer {

     /**
     * The last name of the trainer.
     */
    private String lastName;

    /**
     * The first name of the trainer.
     */
    private String firstName;

    /**
     * The credit balance of the trainer.
     */
    private int creditBalance;

    /**
     * The list of sessions for the trainer.
     */
    private ArrayList<Session> sessionHistory;

    /**
     * Create a new trainer
     * @param lastName      the trainer's last name
     * @param firstName     the trainer's first name
     */
    public Trainer(String lastName, String firstName) {

        // set trainer's name
        this.lastName = lastName;
        this.firstName = firstName;

        // start trainer with 0 credits and 0 sessions
        this.credits = 0;
        this.sessionHistory = new ArrayList<Session>();

        // print log message
        System.out.printf("New trainer %s, %s created.", this.firstName, this.lastName);
    }
}