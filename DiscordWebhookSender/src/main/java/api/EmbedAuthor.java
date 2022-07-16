package api;

public class EmbedAuthor {
    private String name;
    private String url;
    private String iconUrl;

    public EmbedAuthor(String name) {
        this(name,null,null);
    }
    public EmbedAuthor() {
        this("Bot", null, null);
    }

    public EmbedAuthor(String name, String url, String iconUrl) {
        this.name = name;
        this.url = url;
        this.iconUrl = iconUrl;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(Utility.LEFT_BRACKET);

        if (null != name) {
            result.append("name: ").append(name);
        }
        if(null != url) {
            result.append("url: ").append(url);
        }
        if(null != iconUrl) {
            result.append("icon_url: ").append(iconUrl);
        }
        result.append(Utility.RIGHT_BRACKET);
       return result.toString();
    }

}
