package org.strangeforest.tcb.stats.model.core;

public class TieBreakRules {

	public static final TieBreakRules COMMON_TIE_BREAK = new TieBreakRules(7, 2);
	public static final TieBreakRules SUPER_TIE_BREAK = new TieBreakRules(10, 2);

	private final int points;
	private final int pointsDiff;

	public TieBreakRules(int points, int pointsDiff) {
		this.points = points;
		this.pointsDiff = pointsDiff;
	}

	public int getPoints() {
		return points;
	}

	public int getPointsDiff() {
		return pointsDiff;
	}
}