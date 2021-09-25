package me.targeters.starterplugin.commands;

import me.targeters.starterplugin.utilities.BoardUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            BoardUtil.getBoard(player).setTitle("Fly Scoreboard");
            BoardUtil board = BoardUtil.getBoard(player);
            board.setTitle(ChatColor.GOLD+""+ChatColor.BOLD+"tFly "+ChatColor.RESET+ChatColor.GRAY+"| "+ChatColor.WHITE+"Scoreboard");
            board.setLine(9,"───────────────");
            board.setLine(8,ChatColor.GOLD+"User:");
            board.setLine(7,player.getName());
            board.setLine(6," ");
            board.setLine(5,ChatColor.GOLD+"Flight:");
            board.setLine(3," ");
            board.setLine(2,ChatColor.GREEN+""+ChatColor.ITALIC+"tFly Scoreboard ");
            board.setLine(1,"───────────────");


            if (player.getAllowFlight()){
                BoardUtil.getBoard(player).setLine(4,"Fly = Disabled");
                player.setFlying(false);
                player.setAllowFlight(false);
                player.sendMessage(ChatColor.GREEN+"Your Flight is now disabled.");
                return true;
            }

            player.setAllowFlight(true);
            player.setFlying(true);
            BoardUtil.getBoard(player).setLine(4,"Fly = Enabled");
            player.sendMessage(ChatColor.GREEN+"Your Flight is now enabled.");
        }
        return false;
    }
}
