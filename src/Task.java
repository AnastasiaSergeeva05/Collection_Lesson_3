import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Андрей", 15);
        map.put("Кирилл", 45);
        map.put("Максимм", 50);
        System.out.println(map);
        Task task = new Task();
        task.addInCollection("А", 25);
        System.out.println(map);
        task.addInCollection("Максим", 35);
        System.out.println(map);


    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void addInCollection(String name, Integer salary) {
        if (name == null || name.isEmpty() || name.isBlank() || salary <= 0) {
            throw new IllegalArgumentException("Некорректный ввод");
        }
        if (!map.containsKey(name)) {
            map.put(name, salary);
        } else {
            boolean result = Objects.equals(map.get(name), salary);
            if (result){
                throw new IllegalArgumentException("Такое значение уже есть");
            }else {
                map.put(name, salary);
            }
        }
    }
}