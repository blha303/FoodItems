package me.ceramictitan.foodItems;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class fiCommand implements CommandExecutor {

	public FoodItems plugin; 

	public fiCommand(FoodItems plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		if(cmd.getName().equals("fi") && args.length == 0){
			plugin.printHelp(sender);
			return true;	
		}
		if(args.length == 1){
			sender.sendMessage(ChatColor.RED+"Not enough arugments!");
			plugin.printHelp(sender);
		}
		if (args.length > 2){
			String name = String.valueOf(args[0]);
			if(args[1].matches("0-9")){
				int item = Integer.valueOf(args[1]);
			}
			if(args[2].equalsIgnoreCase("confusion")){

			}
		}
		return false;
	}

}
