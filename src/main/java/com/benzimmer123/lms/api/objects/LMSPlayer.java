package com.benzimmer123.lms.api.objects;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.benzimmer123.lms.api.enums.PlayerState;

public interface LMSPlayer {

	String getTimeInArena();

	void setJoinTime(long joinTime);

	long getJoinTime();

	boolean isSameLocation(Location currentLocation);

	void setLastLocation(Location location);

	Location getLastLocation();
	
	/**
	 * Method to set if a player is teleporting
	 *
	 * @param boolean isTeleporting
	 * 
	 */
	void setTeleporting(boolean isTeleporting);

	/**
	 * Method to check if a player is teleporting
	 *
	 * @return boolean
	 * 
	 */
	boolean isTeleporting();

	/**
	 * Method to set the end of combat as timestamp
	 * 
	 * @param long combatTime
	 * 
	 */
	void setCombatTime(long combatTime);

	/**
	 * Method to get check if a player is in combat
	 * 
	 * @return boolean
	 * 
	 */
	boolean inCombat();

	/**
	 * Method to get the end of combat as timestamp
	 * 
	 * @return long
	 * 
	 */
	long getCombatTime();

	/**
	 * Method to set the arena the player is currently in
	 * 
	 * @param LMSArena lms
	 * 
	 */
	void setLMS(LMSArena lms);

	/**
	 * Method to get the arena the player is currently in
	 * 
	 * @return LMSArena
	 * 
	 */
	LMSArena getLMS();

	/**
	 * Method to get the bukkit player
	 * 
	 * @return Player
	 * 
	 */
	Player getPlayer();

	/**
	 * Method to get the players state
	 * 
	 * @return PlayerState
	 * 
	 */
	PlayerState getState();

	/**
	 * Method to set the players state
	 * 
	 * @param PlayerState state
	 * 
	 */
	void setState(PlayerState state);
}