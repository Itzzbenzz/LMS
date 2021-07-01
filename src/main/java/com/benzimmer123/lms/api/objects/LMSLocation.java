package com.benzimmer123.lms.api.objects;

import org.bukkit.Location;

public interface LMSLocation {

	/**
	 * Method to set the spawn location
	 * 
	 * @param Location loc
	 * 
	 */
	void setSpawnLocation(Location loc);

	/**
	 * Method to set the lobby location
	 * 
	 * @param Location loc
	 * 
	 */
	void setCenterLocation(Location loc);

	/**
	 * Method to check if locations are set
	 * 
	 * @return boolean
	 * 
	 */
	boolean isLocationsSet();

}