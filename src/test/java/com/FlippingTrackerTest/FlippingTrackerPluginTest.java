package com.FlippingTrackerTest;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FlippingTrackerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FlippingTrackerPlugin.class);
		RuneLite.main(args);
	}
}