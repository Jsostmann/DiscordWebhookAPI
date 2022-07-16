package discord;

import api.DiscordClient;

import java.util.Date;

public class DiscordWebhook {

    public static void sendLoginMessage(String webhookUrl) {
        DiscordClient client = new DiscordClient(webhookUrl);

    }
}
