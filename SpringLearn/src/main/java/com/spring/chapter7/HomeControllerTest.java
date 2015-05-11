package com.spring.chapter7;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class HomeControllerTest {

	private static int DEFAULT_PER_PAGE = 25;
	
	@Test
	public void shouldDisplayRecentSpittles() {
		List<Spittle> expectedSpittles = asList(new Spittle(), new Spittle(), new Spittle());
		SpitterService spitterService = mock(SpitterService.class);
		when(spitterService.getRecentSpittles(DEFAULT_PER_PAGE)).thenReturn(expectedSpittles);
		HomeController controller = new HomeController(spitterService);
		HashMap<String, Object> model = new HashMap<String, Object>();
		String viewName = controller.showHomePage(model);
		assertEquals("home", viewName);
		assertSame(expectedSpittles, model.get("spittles"));
		verify(spitterService).getRecentSpittles(DEFAULT_PER_PAGE);
	}
}
