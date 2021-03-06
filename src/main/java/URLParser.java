/**
 * Created by niebuhr on 12.01.16.
 */
public class URLParser {

    private String url = "";
    private String protocol = "";
    private String site = "";
    private String path = "";


    public URLParser () {}

    public URLParser (String url) {
        setUrl(url);

    }

    public void checkUrl() {
        String[] urlParts = getUrl().split("://");

        if (urlParts.length > 1) {

            setProtocol(urlParts[0]);
            checkSiteAndPath(urlParts[1]);

        } else {

            checkSiteAndPath(getUrl());

        }
    }

    public void checkSiteAndPath(String urlPart) {
        String[] siteAndPath = urlPart.split("/", 2);
        if(siteAndPath.length >= 1) {
            setSite(siteAndPath[0]);

            if(siteAndPath.length > 1) {
                setPath(siteAndPath[1]);
            }
        }
    }

    public void printUrlParts () {
        System.out.println("Url: " + getUrl());
        System.out.println("Protocol: " + getProtocol());
        System.out.println("Site: " + getSite());
        System.out.println("Path: " + getPath());
        System.out.println();
    }


    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;

        checkUrl();
    }
}
