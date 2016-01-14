public class Main {

    public static void main(String[] args) {
        System.out.println("### URL Parser ###");

        URLParser p = new URLParser("https://www.jan-niebuhr.com/profile/address");

        System.out.println();
        System.out.println("Url: " + p.getUrl());
        System.out.println("Protocol: " + p.getProtocol());
        System.out.println("Site: " + p.getSite());
        System.out.println("Path: " + p.getPath());

    }
}
