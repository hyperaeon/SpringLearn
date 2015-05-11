package com.spring.chapter2;

import java.util.Map;

public class OneManBand2 implements Performer {

	private Map<String, Instrument> instruments;
	
	/**
	 * @return the instruments
	 */
	public Map<String, Instrument> getInstruments() {
		return instruments;
	}

	/**
	 * @param instruments the instruments to set
	 */
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	public OneManBand2() {
		
	}
	
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}

	}

}
