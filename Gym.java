import java.util.ArrayList;

public class Gym {

    /**
     * A list of the gym's clients.
     */
    private ArrayList<Client> clients;

    /**
     * A list of the gym's trainers.
     */
    private ArrayList<Trainer> trainers;

    /**
     * Create a new gym
     */
    public Gym() {

        // start with no clients or trainers
        this.clients = new ArrayList<Client>();
        this.trainers = new ArrayList<Trainer>();

    }


    /**
     * Create a new client
     * @param lastName      the client's last name
     * @param firstName     the client's first name
     * @param phoneNumber   the client's phone number
     * @param email         the client's email
     * @return              the new Client object
     */
    public Client addClient(String lastName, String firstName, String phoneNumber, String email) {

        // create a new client and add it to the list of clients
        Client newClient = new Client(lastName, firstName, phoneNumber, email);
        this.clients.add(newClient);

        return newClient;

    }

    public Trainer addTrainer(String lastName, String firstName) {
        
        // create a new trainer and add it to the list of trainers
        Trainer newTrainer = new Trainer(lastName, firstName);
        this.trainers.add(newTrainer);

        return newTrainer;
        
    }
}