package org.minechef.event;

import java.util.Properties;

import org.bukkit.event.Listener;

public abstract class AbstractListener implements Listener {
	private Properties mConfig;

	public AbstractListener() {
		this(new Properties());
	}

	public AbstractListener(Properties config) {
		mConfig = config;
	}

	protected boolean getBool(String key, boolean def) {
		String val = getString(key, "");

		if (val.equalsIgnoreCase("true"))
			return true;
		else if (val.equalsIgnoreCase("false"))
			return false;
		else
			return def;
	}

	protected String getString(String key, String def) {
		return mConfig.getProperty(key, def);
	}
}
