public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        URLParser p = new URLParser("https://www.jan-niebuhr.com/profile/address");

        System.out.println("Protocol: " + p.getProtocol());
        System.out.println("Site: " + p.getSite());
        System.out.println("Path: " + p.getPath());

    }
}
