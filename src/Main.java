public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        URLParser p = new URLParser("http://www.jan-niebuhr.com");

        System.out.println("Protocol: " + p.getProtocol());
    }
}
