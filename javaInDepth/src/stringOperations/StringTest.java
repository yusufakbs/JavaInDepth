package stringOperations;

public class StringTest {
    public static void main(String[] args) {
        String text = "Godoro Java Gorsel Egitim";
        int index = text.indexOf("java");
        System.out.println(index);

        int space = text.indexOf(" ");
        System.out.println(space);

        int next = text.indexOf(" ",space+1);
        System.out.println(next);

        int last = text.lastIndexOf(" ");
        System.out.println(last);

        char c = text.charAt(10);
        System.out.println("Character : " + c);

        String sub = text.substring(7,11);
        System.out.println(sub);

        System.out.println("Godoro ile mi basliyor ? : " + text.startsWith("Godoro"));
        System.out.println("Godoro ile mi basliyor ? : " + text.endsWith("Godoro"));
        System.out.println("Boyu : " + text.length());
        System.out.println("Değiştirilmiş Hali : " + text.replaceAll("Java" , "C++"));
    }
}
