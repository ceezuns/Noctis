package me.ceezuns.zeus;

import org.bukkit.entity.Player;

import java.util.List;

public interface SidebarAdapter {

    String getTitle();

    List<String> getLines(Player player);

}