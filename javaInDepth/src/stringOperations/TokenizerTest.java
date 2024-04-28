package stringOperations;

import java.util.StringTokenizer;

public class TokenizerTest {
    public static void main(String[] args) {
        String text = "Godoro Java & OOP, JSP/JDBC/JAXP, JSF/JPA/CDI, EJB,JAX-WS";
        StringTokenizer tokenizer = new StringTokenizer(text," ,/&.?");
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println("Parça: " + token);
        }

        StringTokenizer stringTokenizer2 = new StringTokenizer(text);
        String first = stringTokenizer2.nextToken();
        String second = stringTokenizer2.nextToken();
        String third = stringTokenizer2.nextToken();
        String forth = stringTokenizer2.nextToken();
        String fifth = stringTokenizer2.nextToken();

        System.out.println(first + " " + second + " " + third + " " + forth + " " + fifth);

        String[] tokens = text.split(" ");
        for (String token : tokens){
            System.out.println("Ayrık: " + token);
        }

        String text3 = "123;Godoro;13.4";
        StringTokenizer stringTokenizer3 = new StringTokenizer(text3,";");
        int i = Integer.parseInt(stringTokenizer3.nextToken());
        String s = stringTokenizer3.nextToken();
        double d = Double.parseDouble(stringTokenizer3.nextToken());
        System.out.println("Değerler : " + i + " " + s + " " + d);

    }
}
