/**
 * Created by niebuhr on 12.01.16.
 */
public class URLParser {

    private String protocol = "";
    private String site = "";
    private String path = "";


    public URLParser (String url) {

        String[] urlParts = url.split("://");

        if (urlParts.length > 1) {

            setProtocol(urlParts[0]);
            checkSiteAndPath(urlParts[1]);

        } else {

            checkSiteAndPath(url);

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
}
