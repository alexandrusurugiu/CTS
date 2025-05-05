package clase;

import java.util.*;

public class Oven {
    //daca ai nr de instante
    private static final List<Oven> registry = new ArrayList<>();

    //daca ai one to one - faci cu map
//    private static Map<Integer, Oven> registry = new HashMap<>();

    private static final int MAX_OVENS = 4;
    private static int nextId = 0;
    private int id;
    private List<Dish> preparationQueue;
    private int maximumGrades;

    private Oven(int maximumGrades) {
        this.id = nextId++;
        this.preparationQueue = new ArrayList<>();
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
        if (id >= 0 && id < registry.size()) {
            return registry.get(id);
        }
        throw new RuntimeException("Oven with ID " + id + " not found");
    }

    public int calculateOvenWaitingTime() {
        return preparationQueue.stream()
                .mapToInt(Dish::getCookingTime)
                .sum();
    }

    public static void addDish(Dish dish) {
        PriorityQueue<Oven> ovensPQ = new PriorityQueue<>(
                Comparator.comparingInt(Oven::calculateOvenWaitingTime));

        registry.stream()
                .filter(oven -> oven.maximumGrades >= dish.getCookingGrades())
                .forEach(ovensPQ::offer);

        if (ovensPQ.isEmpty()) {
            throw new RuntimeException("No oven available for this dish: " + dish.getName() +
                    ". Required temperature: " + dish.getCookingGrades());
        }

        Oven bestOven = ovensPQ.poll();
        bestOven.preparationQueue.add(dish);
    }

    public static int getRegistrySize() {
        return registry.size();
    }

    @Override
    public String toString() {
        return "Oven{" +
                "id=" + id +
                ", preparationQueue=" + preparationQueue +
                ", maximumGrades=" + maximumGrades +
                '}';
    }
}
