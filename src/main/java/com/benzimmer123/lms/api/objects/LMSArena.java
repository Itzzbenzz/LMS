package com.benzimmer123.lms.api.objects;

import java.util.List;

import org.bukkit.entity.Player;

public interface LMSArena {

	/**
	 * Method to reward players in arena
	 */
	void callRewards();

	/**
	 * Method to add a player to the lms match
	 * 
	 * @param Player player
	 * 
	 */
	void join(Player player);

	/**
	 * Method to check if lms is joinable
	 * 
	 * @return boolean
	 * 
	 */
	boolean isJoinable();
	
	/**
	 * Method to check if lms has a kit
	 * 
	 * @return boolean
	 * 
	 */
	boolean hasLMSKit();

	/**
	 * Method to end the lms match
	 */
	void end();

	/**
	 * Method to teleport a player to a spawn point
	 * 
	 * @param LMSPlayer lmsPlayer
	 * @param int locationNumber
	 * 
	 */
	void teleportPlayer(LMSPlayer lmsPlayer);

	/**
	 * Method to set the lms kit to current players inventory
	 * 
	 * @param Player player
	 * 
	 */
	void setLMSKit(Player player);

	/**
	 * Method to update player details to set as in match
	 * 
	 * @param Player player
	 * 
	 */
	void addPlayer(Player player);

	/**
	 * Method to remove a player 
	 * 
	 * @param LMSPlayer lmsPlayer
	 * 
	 */
	void removePlayer(LMSPlayer lmsPlayer);

	/**
	 * Method to get all players in this lms
	 * 
	 * @return List of LMSPlayers
	 * 
	 */
	List<LMSPlayer> getPlayers();


	/**
	 * Method to set the lms name
	 * 
	 * @param String name
	 * 
	 */
	void setName(String name);

	/**
	 * Method to get the lms name
	 * 
	 * @return String
	 * 
	 */
	String getName();

	/**
	 * Method to get the LMSLocation data
	 * 
	 * @return LMSLocation
	 * 
	 */
	LMSLocation getLMSLocation();

	/**
	 * Method to serialize the arena
	 */
	void save();
}