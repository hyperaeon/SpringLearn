package com.spring.chapter9;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import com.spring.chapter7.Spittle;

public class AuthController {

	@Secured("ROLE_SPITTER")
	public void addSpitter(Spittle spittle) {

	}

	@Secured({ "ROLE_SPITTER", "ROLE_ADMIN" })
	public void deleteSpitter(Spittle spittle) {

	}

	@PreAuthorize("(hasRole('ROLE_SPITTER') and #spittle.text.length() <= 140) or hasRole('ROLE_PREMIUM')")
	@PostFilter("filterObject.spitter.username == principal.username")
	public void updateSpitter() {

	}

	@PostAuthorize("returnObject.spitter.username == principal.username")
	public Spittle getSpittleById(long id) {
		return null;
	}
}
