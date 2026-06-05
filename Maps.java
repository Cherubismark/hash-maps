
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Bismark", 4435);
        empIds.put("Kofi", 4436);
        empIds.put("Kwame", 4437);

        // System.out.println(empIds);
        System.out.println(empIds.get("Bismark"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(4435));


        
    }

}
