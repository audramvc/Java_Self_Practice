package java_day_11_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Chef> chefs = new ArrayList<>(Arrays.asList());

    public ArrayList<Server> servers = new ArrayList<>(Arrays.asList());

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);

    }

    public void HireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chef) {
        this.chefs.addAll(Arrays.asList(chef));
    }

    public void terminateChef(int employeeID) {
        chefs.remove(employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.remove(employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", chefs=" + chefs +
                ", servers=" + servers +
                '}';
    }
}
