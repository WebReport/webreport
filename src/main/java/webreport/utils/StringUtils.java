package webreport.utils;

import org.bukkit.ChatColor;

import java.util.Random;

public class StringUtils {

    public static String cc(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String randomString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < length; i++) {
            stringBuilder.append(randomChar(chars));
        }
        return stringBuilder.toString();
    }

    private static char randomChar(String str) {
        Random random = new Random();
        return str.charAt(random.nextInt(str.length()));
    }

}
