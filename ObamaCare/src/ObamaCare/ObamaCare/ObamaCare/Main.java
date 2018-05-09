package ObamaCare.ObamaCare.ObamaCare;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import Translate.Translate;

public class Main extends JavaPlugin implements Listener {

    public static Main instance;
    
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("[ObamaCare] is now enabled.]");
		
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("[ObamaCare] is now disabled.]");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  {
			  Player p = (Player) sender;
		       
			  if (cmd.getName().equalsIgnoreCase("obamacare")) {
				  if (args.length == 0) {
			      if (p.hasPermission("obamacare.obamacare.command")){  //Permission
					  p.sendMessage(Translate.chat("&6&l+---------------------+"));
					  p.sendMessage(Translate.chat("[&b&lObamaCare Help&r] Commands Are:"));
					  p.sendMessage(Translate.chat(""));
					  p.sendMessage(Translate.chat("&6/obamacare heal")); //DONE
					  p.sendMessage(Translate.chat("&6/obamacare version")); //DONE
					  p.sendMessage(Translate.chat("&6/obamacare info")); //DONE
					  p.sendMessage(Translate.chat("&6/obamacare reload")); //DONE BUT NOT WORKING
					  p.sendMessage(Translate.chat("&6/obamacare permissions")); //DONE
					  return true;
			      }else {
					  p.sendMessage(Translate.chat("&4You Don't Have Permission To Use This Command."));
				  }
			      // Heal
				  }else if (args.length == 1) {
						  if (args[0].equalsIgnoreCase("heal")) {
						      if (p.hasPermission("obamacare.heal.command")){  //Permission
						    	p.setHealth(20);
								p.setFoodLevel(20);
							  p.sendMessage(Translate.chat("[&bObamaCare&r] You are now healed."));
							  return true;
						  }else {
							  p.sendMessage(Translate.chat("&4You Don't Have Permission To Use This Command."));
							  //END of heal
						  }
						      //Version
						  }else if (args.length == 1) {
							  if (args[0].equalsIgnoreCase("version")) {
							  if (p.hasPermission("obamacare.version.command")){  //Permission
								  p.sendMessage(Translate.chat("[&b&lObamaCare Version&r]"));
								  p.sendMessage(Translate.chat("&6&l+---------------------+"));
								  p.sendMessage(Translate.chat("Version is"));
								  p.sendMessage(Translate.chat(""));
								  p.sendMessage(Translate.chat("[Version: 1.1]"));
								  return true;
							  }else {
								  p.sendMessage(Translate.chat("&4You Don't Have Permission To Use This Command."));
								  //END of version
							  }
							  //Info
							  }else if (args.length == 1) {
								  if (args[0].equalsIgnoreCase("info")) {
								      if (p.hasPermission("obamacare.info.command")){  //Permission
								    	  p.sendMessage(Translate.chat("[&b&lObamaCare Info&r]"));
								    	  p.sendMessage(Translate.chat("&6&l+---------------------+"));
								    	  p.sendMessage(Translate.chat("Info is"));
								    	  p.sendMessage(Translate.chat(""));
								    	  p.sendMessage(Translate.chat("&9This plugin is when you are about to die"));
								    	  p.sendMessage(Translate.chat("&9You can type /obamacare heal you will get healed and charged."));
								    	  p.sendMessage(Translate.chat("&9300$ in minecraft money using vault plugin."));
								    	  p.sendMessage(Translate.chat("&4&lNOTE THAT THIS PLUGIN IS NOT FINSHED YET...."));
									  return true;
						}else {
							p.sendMessage(Translate.chat("&4You Don't Have Permission To Use This Command."));
								    	  //END of info
						}
								      //Reload
						}else if (args.length == 1) {
						if (args[0].equalsIgnoreCase("reload")) {
						if (p.hasPermission("obamacare.reload.command")){  //Permission
							p.sendMessage(Translate.chat("Reload is not added yet."));
							return true;
						}else {
							p.sendMessage(Translate.chat("&4You Don't Have Permission To Use This Command."));
							//END of reload
						}
					      //Permissions
			}else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("permissions")) {
			if (p.hasPermission("obamacare.permissions.command")){  //Permission
				p.sendMessage(Translate.chat("[&b&lObamaCare Permissions&r]"));
				p.sendMessage(Translate.chat("&6&l+---------------------+"));
				p.sendMessage(Translate.chat("Permissions Are:"));
				p.sendMessage(Translate.chat(""));
				p.sendMessage(Translate.chat("&6obamacare.obamacare.command"));
				p.sendMessage(Translate.chat("&6obamacare.heal.command"));
				p.sendMessage(Translate.chat("&6obamacare.version.command"));
				p.sendMessage(Translate.chat("&6obamacare.info.command"));
				p.sendMessage(Translate.chat("&6obamacare.reload.command"));
				p.sendMessage(Translate.chat("&6obamacare.permissions.command"));
				return true;
			}else {
				p.sendMessage(Translate.chat("&4You Don't Have Permission To Use This Command."));
				//END of permissions
			}
			}
			}
						}
							  }
						  }
				  }
			  }
		  }
		return false;
	}
}