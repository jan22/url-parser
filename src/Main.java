public class Main {

    public static void main(String[] args) {
        System.out.println("### URL Parser ###");
        System.out.println();

        URLParser url = new URLParser();
        url.setUrl("https://www.jan-niebuhr.com/profile/address");
        url.printUrlParts();

        URLParser some_url = new URLParser("http://jan-niebuhr.com/some-stuff");
        some_url.printUrlParts();

    }
}
