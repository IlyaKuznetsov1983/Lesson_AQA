import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {
                "samsung",
                "honor",
                "nokia",
                "vivo",
                "xiaomi",
                "oppo",
                "redmi",
                "sony ericsson",
                "tcl",
                "siemens",
                "vertu",
                "yota",
                "BQ",
                "cube",
                "asus",
                "3Q",
                "BBK",
                "honor",
                "vivo",
                "redmi",
                "honor",
                "nokia"
        };

        Set<String> uniqueBrands = new HashSet<>(Arrays.asList(strings));
        System.out.println(uniqueBrands);

        Map<String, Integer> duplicateInfo = new HashMap<>();

        for(String brand : strings) {
            if (duplicateInfo.containsKey(brand)) {
                duplicateInfo.put(brand, duplicateInfo.get(brand) + 1);
            } else {
                duplicateInfo.put(brand, 1);
            }
        }

        System.out.println(duplicateInfo);

        System.out.println("..............................");

        PhoneDirectory.addNumberPhone("Панин", "Алексей","+79533551109");
        PhoneDirectory.addNumberPhone("Монгол", "Олег", "+79312543879");
        PhoneDirectory.addNumberPhone("Кологривый", "Никита","+79455557687");
        PhoneDirectory.addNumberPhone("Ивлев", "Павел", "+79477777555");
        PhoneDirectory.addNumberPhone("Джигурда", "Никита", "+79212773888");
        PhoneDirectory.addNumberPhone("Хасбулла", "Магомедов","+79476543989");
        PhoneDirectory.addNumberPhone("Харламов", "Игорь", "+79477987654");

        System.out.println(PhoneDirectory.getNumberPhone("Кологривый"));
        System.out.println("..............................");
    }
}