package Events;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

import ObamaCare.ObamaCare.ObamaCare.Main;
import Translate.Translate;
import net.milkbowl.vault.economy.Economy;

public class Signs
  implements Listener
{
  private Main plugin;
  private static Economy econ = null;
  
  public Signs(Main plugin)
  {
    this.plugin = plugin;
  }
  
  @EventHandler
  public void signClick(PlayerInteractEvent event)
  {
    Player p = event.getPlayer();
    
    Block clickedBlock = event.getClickedBlock();
    if ((clickedBlock != null) && ((clickedBlock.getState() instanceof Sign)))
    {
      final Sign sign = (Sign)clickedBlock.getState();
      String line1 = sign.getLine(0);
      if (line1.equalsIgnoreCase("[ocheal]"))
      {
        p.sendMessage(Translate.chat("[&bObamaCare&r] &aYou Just Made a Heal Sign."));
        sign.setLine(0, ChatColor.AQUA + "[ObamaCare]");
        sign.setLine(1, ChatColor.WHITE + "Click Me to heal");
        sign.update();
        //START
  	  int price = 500;
  	  if (econ.hasAccount(p)) {
  	       econ.withdrawPlayer(p, price);
  	       p.sendMessage(Translate.chat("&a500$ has been taken from your account."));
		    	p.setHealth(20);
				p.setFoodLevel(20);
				  p.sendMessage(Translate.chat("[&bObamaCare&r] You are now healed."));
  	  } else {
  	       p.sendMessage("&cYou do not have enough money!");
  	  }
        //END
        new BukkitRunnable()
        {
          public void run()
          {
            sign.setLine(0, "[ocheal]");
            sign.setLine(1, "");
          }
        }.runTaskLater(this.plugin, 20L);
      }
    }
  }
}
