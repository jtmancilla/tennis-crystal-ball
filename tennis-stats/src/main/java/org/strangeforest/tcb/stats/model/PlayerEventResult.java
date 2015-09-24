package org.strangeforest.tcb.stats.model;

import java.util.*;

public class PlayerEventResult {

	private final int tournamentEventId;
	private final Date date;
	private final String level;
	private final String surface;
	private final String name;
	private final String result;

	public PlayerEventResult(int tournamentEventId, Date date, String level, String surface, String name, String result) {
		this.tournamentEventId = tournamentEventId;
		this.date = date;
		this.level = level;
		this.surface = surface;
		this.name = name;
		this.result = result;
	}

	public int getTournamentEventId() {
		return tournamentEventId;
	}

	public Date getDate() {
		return date;
	}

	public String getLevel() {
		return level;
	}

	public String getSurface() {
		return surface;
	}

	public String getName() {
		return name;
	}

	public String getResult() {
		return result;
	}
}
