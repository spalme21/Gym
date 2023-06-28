import java.util.Date;

public class Session {
    
    /**
     * The trainer leading the session.
     */
    private Trainer trainer;

    /**
     * The client being trained.
     */
    private Client client;

    /**
     * The date of the session.
     */
    private Date date;

    /**
     * Create a new training session
     * @param trainer   the trainer running the session
     * @param client    the client being trained
     */
    public Session(Trainer trainer, Client client) {

        this.trainer = trainer;
        this.client = client;

        // set date as today
        this.date = new Date();
        
    }

}