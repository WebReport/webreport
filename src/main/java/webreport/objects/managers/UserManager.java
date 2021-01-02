package webreport.objects.managers;

import org.bukkit.entity.Player;
import webreport.objects.User;

import java.util.HashMap;

public class UserManager {

    private static final HashMap<Player, User> users = new HashMap<>();

    public static void addUser(Player player){
        users.put(player, new User(player));
    }

    public static void removeUser(Player player) {
        users.remove(player);
    }

    public static User getUser(Player player) {
        return users.get(player);
    }

    public static HashMap<Player, User> getUsers() {
        return users;
    }

}
