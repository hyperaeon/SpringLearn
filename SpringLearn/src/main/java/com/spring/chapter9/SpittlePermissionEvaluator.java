package com.spring.chapter9;

import java.io.Serializable;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import com.spring.chapter7.Spittle;

public class SpittlePermissionEvaluator implements PermissionEvaluator {

	public boolean hasPermission(Authentication authentication, Object target, Object permission) {
		if (target instanceof Spittle) {
			Spittle spittle = (Spittle) target;
			if ("delete".equals(permission)) {
				return spittle.getSpitter().getUserName().equals(authentication.getName()) 
						|| hasProfanity(spittle);
			}
		}
		throw new UnsupportedOperationException("un permission");
	}

	private boolean hasProfanity(Spittle spittle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasPermission(Authentication arg0, Serializable arg1,
			String arg2, Object arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
