package com.spring.chapter1;

public class BraveKnight2 implements Knight {

	private Quest quest;
	private Minstrel minstrel;
	
	public BraveKnight2(Quest quest, Minstrel minstrel) {
		this.quest = quest;
		this.minstrel = minstrel;
	}
	public void embarkOnQuest() throws Exception {
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}

}
