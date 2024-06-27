import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;



    public class PhoneDirectory {
        static private Map<String, List<String>> listOfAbonents = new HashMap<>();

        public static List<String> getNumberPhone(String lastName) {
            return listOfAbonents.get(lastName);
        }

        public static void addNumberPhone(String lastName, String firstName, String numberPhone) {
            if (listOfAbonents.containsKey(lastName)) {
                List<String> numbersPhone = listOfAbonents.get(lastName);
                numbersPhone.add(String.format("%s %s - %s", lastName, firstName, numberPhone));
            } else {
                List<String> numbersPhone = new ArrayList<>();
                numbersPhone.add(String.format("%s %s - %s", lastName, firstName, numberPhone));

                listOfAbonents.put(lastName, numbersPhone);
            }
        }
    }

