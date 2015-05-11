package com.spring.chapter2;

import java.util.Properties;

public class OneManBand3 implements Performer {

	private Properties instruments;

	/**
	 * @return the instruments
	 */
	public Properties getInstruments() {
		return instruments;
	}

	/**
	 * @param instruments
	 *            the instruments to set
	 */
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}

	public OneManBand3() {

	}

	public void perform() throws PerformanceException {

	}

}
