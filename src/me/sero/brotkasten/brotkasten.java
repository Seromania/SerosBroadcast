package me.sero.brotkasten;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;





public class brotkasten extends JavaPlugin {

	
	@Override
	public void onDisable() {
		
		System.out.println("SerosBrotkasten deaktiviert!");
	}

	@Override
	public void onEnable() {
		
		System.out.println("SerosBrotkasten aktiviert!");
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
	
		boolean succeed = false;
		
		if(sender instanceof Player){
			Player player = (Player) sender;
			
			if(player.isOp()){
			if(cmd.getName().equalsIgnoreCase("bc"))
			{
				if(!(args.length != 0)){
					player.sendMessage(ChatColor.DARK_PURPLE + "[Brotkasten]: " + ChatColor.RED + "Nicht genügend Argumente übergeben!");
					succeed = true;
				} else if(args[0] != null){
					
					if (args.length > 0) {
					
			            StringBuilder message = new StringBuilder();
			            for (int index = 0; index < args.length; ++index) {
			                message.append(args[index]);
			                message.append(" ");
			            }
					this.getServer().broadcastMessage(ChatColor.DARK_PURPLE + "[BrotKasten]:" + ChatColor.GREEN + message.toString());
					
					}
																
					
					succeed = true;
				}				
				}
				
				
			}
			else
			{
				player.sendMessage(ChatColor.DARK_PURPLE + "[Brotkasten]: " + ChatColor.RED + "Du bist kein OP!");
				succeed = true;
			}
			}
		
		

		return succeed;
	}


}
	
	



 
