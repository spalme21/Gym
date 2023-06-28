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
     * Create a new client
     * @param lastName      the client's last name
     * @param firstName     the client's first name
     * @param phoneNumber   the client's phone number
     * @param email         the client's email
     */
    public Client(String lastName, String firstName, String phoneNumber, String email) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;

        // print log message
        System.out.printf("New client %s, %s created.", this.firstName, this.lastName);
    }
}