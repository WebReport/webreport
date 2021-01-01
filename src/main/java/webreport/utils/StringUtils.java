package webreport.utils;

/*
        WebReport - A modern solution for handling in-game reports on the web.
        Copyright (C) 2021  Cold-Dev

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU Affero General Public License as published
        by the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU Affero General Public License for more details.

        You should have received a copy of the GNU Affero General Public License
        along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

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
