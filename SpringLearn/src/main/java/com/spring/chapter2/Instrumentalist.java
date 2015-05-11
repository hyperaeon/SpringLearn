package com.spring.chapter2;

public class Instrumentalist implements Performer {

	private String song;

	private Instrument instrument;

	/**
	 * @return the song
	 */
	public String getSong() {
		return song;
	}

	/**
	 * @param song
	 *            the song to set
	 */
	public void setSong(String song) {
		this.song = song;
	}

	public String screamSong() {
		return song;
	}
	public Instrumentalist() {

	}

	/**
	 * @param instrument
	 *            the instrument to set
	 */
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

}
