package api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Utility {
    public static final int SUCESS_CODE_CREATED = 201;
    public static final int SUCESS_CODE = 200;
    public static final int SUCCESS_CODE_NO_CONTENT = 204;
    public static final String LEFT_BRACKET = "{";
    public static final String RIGHT_BRACKET = "}";
    public static final String LEFT_SQUARE_BRACKET = "[";
    public static final String RIGHT_SQUARE_BRACKET= "]";
    public static final char SINGLE_QUOTE = '\'';
    public static final char DOUBLE_QUOTE = '\"';
    public static final String COMMA = ",";

    public static String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return formatter.format(now);
    }

    public static int hexToInt(String hex) {
        return Integer.parseInt(hex.replaceAll("#",""),16);
    }

    public static String format(String key) {
        return "\"" + key + "\"";
    }

}
