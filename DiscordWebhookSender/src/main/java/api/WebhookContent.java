package api;

import java.util.ArrayList;

public class WebhookContent {
    private static final int MAX_EMBEDS = 10;
    private String content;
    private String userName;
    private final ArrayList<Embed> embeds;


    public WebhookContent() {
        this.embeds = new ArrayList<>();
    }

    public void addEmbed(Embed embed) throws Exception {
        if(embeds.size() <= MAX_EMBEDS) {
            embeds.add(embed);
        }
        throw new Exception("Maximum amount of embeds is 10");
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserName(String username) {
        this.userName = username;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(Utility.LEFT_BRACKET);
        result.append("content: ").append(content).append(Utility.COMMA);
        result.append("userName: ").append(userName).append(Utility.COMMA);
        result.append("embeds: ");
        result.append(Utility.LEFT_SQUARE_BRACKET);
        for(int i = 0; i < embeds.size() - 1; i++) {
            result.append(embeds.get(i)).append(Utility.COMMA);
        }
        if(embeds.size() > 0) {
            result.append(embeds.get(embeds.size() - 1));
        }
        result.append(Utility.RIGHT_SQUARE_BRACKET);
        result.append(Utility.RIGHT_BRACKET);
        return result.toString();
    }
}
