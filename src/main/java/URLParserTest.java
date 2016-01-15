import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.Assert.*;


/**
 * Created by niebuhr on 12.01.16.
 */

public class URLParserTest {

    private URLParser p = new URLParser();
    private URLParser mockedUrl = mock(URLParser.class);


    @Test
    public void shouldBeAHttpProtocol() {
        mockedUrl.setUrl("http://www.jan-niebuhr.com");
        when(mockedUrl.getProtocol()).thenReturn("http");
    }

    @Test
    public void shouldNotBeAHttpProtocol() {
        p.setUrl("https://www.jan-niebuhr.com");
        assertFalse("Result should not be http!", p.getProtocol().equals("http"));
    }

    @Test
    public void shouldBeAFtpProtocol () {
        p.setUrl("ftp://ftp.jan-niebuhr.com");
        assertTrue("Result should be ftp!", p.getProtocol().equals("ftp"));
    }

    @Test
    public void shouldNotHaveAProtocol () {
        p.setUrl("www.jan-niebuhr.com");
        assertTrue("Result should not have a Protocol!", p.getProtocol().isEmpty());
    }

    @Test
    public void shouldHaveSiteContext () {
        p.setUrl("www.jan-niebuhr.com");
        assertTrue("Result should have site context", p.getSite().equals("www.jan-niebuhr.com"));
    }

    @Test
    public void shouldHaveAPath() {
        p.setUrl("ftp://ftp.jan-niebuhr.com/yeha/man");
        assertTrue("Result should have a path!", p.getPath().equals("yeha/man"));
        assertFalse("Blaaaa", p.getPath().isEmpty());
    }

    @Test
    public void shouldNotHaveAPath () {
        p.setUrl("ftp://ftp.jan-niebuhr.com");
        assertTrue("Result should not have a path!", p.getPath().isEmpty());
    }

}