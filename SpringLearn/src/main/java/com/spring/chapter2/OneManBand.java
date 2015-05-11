package com.spring.chapter2;

import java.util.Collection;

public class OneManBand implements Performer {

	private Collection<Instrument> instruments;

	/**
	 * @return the instruments
	 */
	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	/**
	 * @param instruments
	 *            the instruments to set
	 */
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	public OneManBand() {

	}

	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}

	}

}
