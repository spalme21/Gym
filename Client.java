import java.util.ArrayList;

public class Client {

    /**
     * The last name of the client.
     */
    private String lastName;

    /**
     * The first name of the client.
     */
    private String firstName;

    /**
     * The phone number of the client.
     */
    private String phoneNumber;

    /**
     * The email of the client.
     */
    private String email;

    /**
     * The credit balance of the client.
     */
    private int creditBalance;

    /**
     * The list of sessions for the client.
     */
    private ArrayList<Session> sessionHistory;

    /**
     * Create a new client
     * @param lastName      the client's last name
     * @param firstName     the client's first name
     * @param phoneNumber   the client's phone number
     * @param email         the client's email
     */
    public Client(String lastName, String firstName, String phoneNumber, String email) {

        // set client's name and contact info
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;

        // start client with 0 credits and 0 sessions
        this.credits = 0;
        this.sessionHistory = new ArrayList<Session>();

        // print log message
        System.out.printf("New client %s, %s created.", this.firstName, this.lastName);
    }
}