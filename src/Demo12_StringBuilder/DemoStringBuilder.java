package Demo12_StringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); //

        StringBuilder sb2 = new StringBuilder("I love China!");
        System.out.println(sb2); // I love China!

        System.out.println(sb2.append("yes").append(true).append(3.14));

        System.out.println(sb2.toString());
    }
}
