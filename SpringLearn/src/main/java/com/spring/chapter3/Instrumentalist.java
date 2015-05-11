package com.spring.chapter3;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.chapter2.Instrument;
import com.spring.chapter2.PerformanceException;
import com.spring.chapter2.Performer;

public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	
	/**
	 * @return the instrument
	 */
	public Instrument getInstrument() {
		return instrument;
	}


	/**
	 * @param instrument the instrument to set
	 */
	@Autowired
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub

	}

}
