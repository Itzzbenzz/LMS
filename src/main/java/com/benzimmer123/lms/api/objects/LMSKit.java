package com.benzimmer123.lms.api.objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface LMSKit {

	/**
	 * Method to load the kit on a player
	 * 
	 * @param Player player
	 * @return boolean
	 * 
	 */
	void loadKit(Player player);

	/**
	 * Method to get the serialized string to bukkit itemstack
	 * 
	 * @param String item
	 * @return ItemStack
	 * 
	 */
	ItemStack toItemStack(String item);

}