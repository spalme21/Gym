import java.util.ArrayList;

public class Gym {

    /**
     * The name of the gym.
     */
    private String name;

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
     * @param name  The name of the gym
     */
    public Gym(String name) {
        
        this.name = name;

        // start with no clients or trainers
        this.clients = new ArrayList<Client>();
        this.trainers = new ArrayList<Trainer>();

    }
}