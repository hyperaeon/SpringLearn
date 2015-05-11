package com.spring.chapter1;

public class BraveKnight implements Knight {

	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() throws Exception {
		quest.embark();
	}
}
