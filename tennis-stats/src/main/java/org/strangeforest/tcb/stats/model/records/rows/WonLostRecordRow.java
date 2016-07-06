package org.strangeforest.tcb.stats.model.records.rows;

import java.sql.*;

import org.strangeforest.tcb.stats.model.*;
import org.strangeforest.tcb.stats.model.records.*;

public abstract class WonLostRecordRow extends RecordRow {

	protected WonLost wonLost;

	public WonLostRecordRow(int rank, int playerId, String name, String countryId, Boolean active) {
		super(rank, playerId, name, countryId, active);
	}

	@Override public void read(ResultSet rs, boolean activePlayers) throws SQLException {
		wonLost = new WonLost(rs.getInt("won"), rs.getInt("lost"));
	}
}