import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "+796145587456");
        map.put("Петров", "+79614587355");
        map.put("Куцнецов", "+79614544456");
        map.put("Котов", "+79614584536");
        map.put("Дуньков", "+79614587654");
        map.put("Волошенко", "+796145874678");
        map.put("Козлов", "+796145873456");
        map.put("Прянко", "+796145825785");
        map.put("Велнко", "+79614584647");
        map.put("Валянков", "+796145823456");
        map.put("Поленков", "+7961458565434");
        map.put("Миторешнко", "+796145857576");
        map.put("Куличковунко", "+79614865456");
        map.put("Мироешев", "+7961452434");
        map.put("Иващенков", "+796343587456");
        map.put("Петроевнко", "+796145825665");
        map.put("Маненко", "+7961458734");
        for (Map.Entry<String,String>PhoneBook: map.entrySet()){
            System.out.println(PhoneBook);
        }

    }
}