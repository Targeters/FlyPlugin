package me.targeters.starterplugin.listeners;

import me.targeters.starterplugin.utilities.BoardUtil;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListeners implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.setAllowFlight(false);
        player.setFlying(false);
        BoardUtil.getBoard(player).setTitle("Fly Scoreboard");
        BoardUtil board = BoardUtil.getBoard(player);
        board.setTitle(ChatColor.GOLD+""+ChatColor.BOLD+"tFly "+ChatColor.RESET+ChatColor.GRAY+"| "+ChatColor.WHITE+"Scoreboard");
        board.setLine(9,"───────────────");
        board.setLine(8,ChatColor.GOLD+"User:");
        board.setLine(7,player.getName());
        board.setLine(6," ");
        board.setLine(5,ChatColor.GOLD+"Flight:");
        board.setLine(4,"Fly = Disabled");
        board.setLine(3," ");
        board.setLine(2,ChatColor.GREEN+""+ChatColor.ITALIC+"tFly Scoreboard ");
        board.setLine(1,"───────────────");
    }
}
