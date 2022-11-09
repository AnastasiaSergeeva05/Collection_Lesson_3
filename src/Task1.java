
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Task1 {
    private final Map<String, List<Integer>> map = new HashMap<>();
    private final Map<String, Integer> map2 = new HashMap<>();

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.replaceMetod();
    }

    public void replaceMetod() {
        Random random = new Random();
        map.put("Ковалева", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map.put("Мотронов", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map.put("Кремнев", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map.put("Петоров", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map.put("Иваненко", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        int sum = 0;
        for (Map.Entry<String, List<Integer>> stringListEntry : map.entrySet()) {
            int i = 0;
            while (i < stringListEntry.getValue().size()) {
                sum += stringListEntry.getValue().get(i);
                i++;
            }

            map2.put(stringListEntry.getKey(), sum);
            sum = 0;

        }
        System.out.println(map.values());
        System.out.println(map2);
    }
}