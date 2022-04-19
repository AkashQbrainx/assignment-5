import java.util.Locale;

public class RotationString {
    public static void main(String[] args) {
        String str1 = "deabc";
        String str2 = "abcde";

        if (str1.length() != str2.length()) {
            System.out.println("String is not rotation of another string");
        } else {
            String str3 = str1 + str1;
            if (str3.contains(str2)) {
                System.out.println("String is  rotation of another string");
            } else {
                System.out.println("String is not rotation of another string");
            }
        }

    }
}
