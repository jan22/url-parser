import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by niebuhr on 12.01.16.
 */

public class URLParserTest {

    @Test
    public void shouldBeAHttpProtocol() {
        URLParser p = new URLParser("http://www.jan-niebuhr.com");
        assertTrue("Result should be http!", p.getProtocol().equals("http"));
    }

    @Test
    public void shouldNotBeAHttpProtocol() {
        URLParser p = new URLParser("https://www.jan-niebuhr.com");
        assertFalse("Result should not be http!", p.getProtocol().equals("http"));
    }

    @Test
    public void shouldBeAFtpProtocol () {
        URLParser p = new URLParser("ftp://ftp.jan-niebuhr.com");
        assertTrue("Result should be ftp!", p.getProtocol().equals("ftp"));
    }

    @Test
    public void shouldNotHaveAProtocol () {
        URLParser p = new URLParser("www.jan-niebuhr.com");
        assertTrue("Result should not have a Protocol!", p.getProtocol().isEmpty());
    }

    @Test
    public void shouldHaveSiteContext () {
        URLParser p = new URLParser("www.jan-niebuhr.com");
        assertTrue("Result should have site context", p.getSite().equals("www.jan-niebuhr.com"));
    }

    @Test
    public void shouldHaveAPath() {
        URLParser p = new URLParser("ftp://ftp.jan-niebuhr.com/yeha/man");
        assertTrue("Result should have a path!", p.getPath().equals("yeha/man"));
    }

    @Test
    public void shouldNotHaveAPath () {
        URLParser p = new URLParser("ftp://ftp.jan-niebuhr.com");
        assertTrue("Result should not have a path!", p.getPath().isEmpty());
    }


}