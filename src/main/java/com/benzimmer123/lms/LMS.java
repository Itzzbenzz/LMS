package com.benzimmer123.lms;

import org.bukkit.plugin.java.JavaPlugin;

import com.benzimmer123.lms.managers.LMSManager;

public class LMS extends JavaPlugin {

	private static final LMS instance = new LMS();
	private static final LMSManager lmsManager = new LMSManager();

	public static LMS getInstance() {
		return instance;
	}

	public LMSManager getLMSManager() {
		return lmsManager;
	}
}
