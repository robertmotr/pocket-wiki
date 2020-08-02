package com.robert.wikiplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CommandWiki implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            ItemStack item = player.getInventory().getItemInMainHand();

            Material materialType = item.getType();

            String materialURL = String.valueOf(materialType);

            materialURL = materialURL.toLowerCase();

            if(materialURL.contains("spawn_egg")) {

                player.sendMessage(ChatColor.BLUE + "[Pocket Wiki]: " + ChatColor.GREEN + "https://minecraft.gamepedia.com/spawn_egg");

            }

            else {

                player.sendMessage(ChatColor.BLUE + "[Pocket Wiki]: " + ChatColor.GREEN + "https://minecraft.gamepedia.com/" + materialURL);

            }

            return true;

        }

        else {

            sender.sendMessage("This command can only be triggered from a player.");

            return false;
        }


    }
}
