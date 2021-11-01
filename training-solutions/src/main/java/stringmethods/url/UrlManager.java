package stringmethods.url;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public static void main(String[] args) {
        UrlManager urlManager = new UrlManager();

        String url = "HTTPS://EarthQuake.USgs.gov:8080/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        String result = urlManager.urlProcessor(url);
        System.out.println("URL ellenőrzés: " + result);
        System.out.println(urlManager);

        url = "www.EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        result = urlManager.urlProcessor(url);
        System.out.println("URL ellenőrzés: " + result);
        System.out.println(urlManager);

        System.out.println(urlManager.hasProperty("starttime"));
        System.out.println(urlManager.getProperty("starttime"));
    }

    public String urlProcessor(String url) {
        url = url.trim();
        String[] protocol = getUrlProtocol(url);
        if(!protocol[1].equals("OK")) return protocol[1];

        url = getUrlHost(protocol[0]);
        url = getUrlPort(url);
        url = getUrlPath(url);
        url = getUrlQuery(url);

        return "OK";
    }

    public String[] getUrlProtocol(String url) {
        int index = url.indexOf("://");
        int firstindex = url.indexOf(".");
        if (firstindex == -1) return new String[]{url,"Hibás Url"};
        if (index == -1) {
            this.protocol = null;
        } else if (firstindex > index) {
            this.protocol = url.substring(0, index).toLowerCase();
            url = url.substring(index + 3);
        } else {
            this.protocol = null;
            return new String[]{url,"Hibás Url"};
        }
        return new String[]{url,"OK"};
    }

    public String getUrlHost(String url) {
        int index = url.indexOf(":");
        int firstindex = index;
        index = url.indexOf("/");
        firstindex = firstindex == -1 ? index : Math.min(index, firstindex);
        index = url.indexOf("?");
        firstindex = firstindex == -1 ? index : Math.min(index, firstindex);
        if (firstindex == -1) {
            this.host = url.toLowerCase();
            url="";
        } else {
            this.host = url.substring(0, firstindex).toLowerCase();
            url = url.substring(firstindex);
        }
        return url;
    }

    public String getUrlPort(String url) {
        int index = url.indexOf("/");
        int firstindex = index;
        index = url.indexOf("?");
        firstindex = firstindex == -1 ? index : Math.min(index, firstindex);
        if (url.substring(0, 1).equals(":")) {
            if (firstindex == -1) {
                this.port = Integer.parseInt(url);
                url="";
            } else {
                this.port = Integer.parseInt(url.substring(1, firstindex));
                url = url.substring(firstindex);
            }
        } else {
            this.port = null;
        }
        return url;
    }

    public String getUrlPath(String url) {
        int index = url.indexOf("?");
        if (url.substring(0, 1).equals("/")) {
            if (index == -1) {
                this.path = url;
                url="";
            } else {
                this.path = url.substring(0, index);
                url = url.substring(index);
            }
        } else {
            this.path = null;
        }
        return url;
    }
    public String getUrlQuery(String url) {
        if (url.substring(0, 1).equals("?")) {
            this.query = url;
            url="";
        } else {
            this.query = null;
        }
        return url;
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (String property : properties) {
            String[] parts = property.split("=");
            if (parts[0].equals(key)) return parts[1];
        }
        return null;
    }
    @Override
    public String toString() {
        return  " protocol='" + protocol + "\n" +
                " port=" + port + "\n" +
                " host='" + host + "\n" +
                " path='" + path + "\n" +
                " query='" + query + "\n" +
                '}';
    }
}

