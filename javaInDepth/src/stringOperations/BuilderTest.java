package stringOperations;

public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asd").append("java").append("asdas").append("123123");
        stringBuilder.append(" ").append(",").append(" Test23");

        String text = stringBuilder.toString();
        System.out.println(text);

        long l = 123L;
        String s = "Godoro";
        double d = 2.3;
        String text2 = String.format("%5d,%10s,%20f",l,s,d);
        System.out.println("Biçimli : " + text2);

    }
}
