package pl.camp.it.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringBox = findString(false);

        if(stringBox.isPresent()) {
            System.out.println("Hura mamy stringa !!!");
            String prezent = stringBox.get();

            System.out.println(prezent);
        } else {
            System.out.println("Pudełko przyszło puste !!");
        }

        String cos = stringBox.orElse("Jakiś domyślny String");

        System.out.println(cos);

        String a = nullMethod();
        boolean result = a.equals("sdf");
        System.out.println(result);
    }

    public static Optional<String> findString(boolean a) {
        if(a) {
            return Optional.of("asdfsad");
        } else {
            return Optional.empty();
        }
    }

    public static String nullMethod() {
        return null;
    }
}
