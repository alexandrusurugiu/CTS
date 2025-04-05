package clase;

import java.util.*;

public class Oven {
    //daca ai nr de instante
    private static final List<Oven> registry = new ArrayList<>();

    //daca ai one to one - faci cu map
//    private static Map<Integer, Oven> registry = new HashMap<>();

    private static final int MAX_OVENS = 4;
    private int id;
    private List<Dish> preparationQueue;
    private int maximumGrades;

    private Oven(int maximumGrades) {
        preparationQueue = new ArrayList<>();
        this.maximumGrades = maximumGrades;
    }

    public static void registryOven(int temperature) {
        if (registry.size() < MAX_OVENS) {
            Oven oven = new Oven(temperature);
            registry.add(oven);
        } else {
            throw new RuntimeException("Maximum number of ovens: " + MAX_OVENS);
        }
    }

    public static Oven getOvenById(int id) {
        return registry.get(id);
    }

    public static int getRegistrySize() {
        return registry.size();
    }

    public static boolean ovenExists(int id) {
        return id >= 0 && id < registry.size();
    }

    public int calculateOvenWaitingTime() {
        int totalWaitingTime = 0;
        for (Dish dish : this.preparationQueue) {
            totalWaitingTime += dish.getCookingTime();
        }
        return totalWaitingTime;
    }

    public static void addDish(Dish dish) throws RuntimeException{
        PriorityQueue<Oven> ovensPQ = new PriorityQueue<>(Comparator.comparingInt(Oven::calculateOvenWaitingTime));

        while (!ovensPQ.isEmpty()) {
            Oven oven = ovensPQ.poll();

            if (dish.getCookingGrades() <= oven.maximumGrades) {
                oven.preparationQueue.add(dish);
                return;
            }
        }

        throw new RuntimeException("No oven available for this dish: " + dish.getName());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Oven{");
        sb.append("id=").append(id);
        sb.append(", preparationQueue=").append(preparationQueue);
        sb.append(", maximumGrades=").append(maximumGrades);
        sb.append('}');
        return sb.toString();
    }
}
