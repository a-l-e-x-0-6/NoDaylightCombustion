package com.github.a_l_e_x_0_6.NoDaylightCombustion;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;

public class MyListener implements Listener {
private boolean sun = true;
@EventHandler(priority = EventPriority.HIGHEST)
public void onEntityCombustByEntity(EntityCombustByEntityEvent event)
{
                sun = false;
}

@EventHandler(priority = EventPriority.HIGHEST)
public void onEntityCombustByBlock(EntityCombustByBlockEvent event)
{
                sun = false;
}
@EventHandler(priority = EventPriority.LOWEST)
public void onEntityCombust(EntityCombustEvent event)
{
            if (sun)
                 {
            	event.setCancelled(true);
                  }
            sun = true;
}

}
