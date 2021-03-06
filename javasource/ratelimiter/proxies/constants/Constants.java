// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ratelimiter.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the RateLimiter module

	public static java.lang.String getLognode()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("RateLimiter.Lognode");
	}

	/**
	* per second rate limit
	*/
	public static java.lang.Long getRateLimit()
	{
		return (java.lang.Long)Core.getConfiguration().getConstantValue("RateLimiter.RateLimit");
	}
}