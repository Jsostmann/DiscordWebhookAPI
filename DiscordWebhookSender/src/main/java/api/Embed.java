package api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Embed {
    private static final int MAX_FIELDS = 25;

    private String title;
    private String type;
    private String description;
    private String url;
    private String timestamp;
    private int color;
    private EmbedAuthor author;
    private final ArrayList<Field> fields;



    public Embed() {
        fields = new ArrayList<>();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Utility.hexToInt(color);
    }

    public EmbedAuthor getAuthor() {
        return author;
    }

    public void setAuthor(EmbedAuthor author) {
        this.author = author;
    }

    public void addField(Field field) throws Exception {
        if(fields.size() <= MAX_FIELDS) {
            fields.add(field);
        }
        throw new Exception("Maximum amount of Fields is 10");
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(Utility.format("title")).append(":").append(title);
        result.append("description: ").append(description);
        result.append("color: ").append(color);
        result.append("author: ").append(author.toString());

        return result.toString();
    }

}
