package com.spring.chapter1;

public class DamselResuingKnight implements Knight {

	private RescueDamselQuest quest;
	
	public DamselResuingKnight() {
		quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest() throws Exception {
		quest.embark();
	}
}
