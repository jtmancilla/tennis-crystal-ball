package org.strangeforest.tcb.dataload

import groovy.sql.*

def sqlPool = new SqlPool()
sqlPool.withSql { Sql sql ->
	loadRankings(sql)
}

static loadRankings(Sql sql) {
	def rankingsLoader = new ATPTourRankingsLoader(sql)

	println 'Loading missing rankings...'
	rankingsLoader.load('1977-08-23', 500)
	rankingsLoader.load('1977-08-30', 500)
	rankingsLoader.load('1978-06-12', 500, ['Adam Drysdale'])
	rankingsLoader.load('1978-06-19', 500)
	rankingsLoader.load('1978-06-26', 500)
	rankingsLoader.load('1978-07-12', 500, ['Yasufumi Yamamoto', 'Unknown Klay', 'Andre Van Der Merwe'])
	rankingsLoader.delete('1978-07-17')
	rankingsLoader.load('1978-07-17', 500)
	rankingsLoader.load('1978-07-31', 500)
	rankingsLoader.load('1978-08-21', 500)
	rankingsLoader.load('1978-09-11', 500)
	rankingsLoader.load('1978-10-16', 500)
	rankingsLoader.load('1978-10-23', 500)
	rankingsLoader.load('1978-10-30', 500)
	rankingsLoader.load('1978-11-06', 500)
	rankingsLoader.load('1978-11-13', 500)
	rankingsLoader.load('1978-11-20', 500)
	rankingsLoader.load('1978-12-04', 500)
	rankingsLoader.load('1978-12-28', 500)
	rankingsLoader.load('1979-01-22', 500)
	rankingsLoader.load('1979-02-05', 500)
	rankingsLoader.load('1979-02-19', 500)
	rankingsLoader.load('1979-02-26', 500)
	rankingsLoader.load('1979-03-05', 500)
	rankingsLoader.load('1979-04-02', 500)
	rankingsLoader.load('1979-04-09', 500)
	rankingsLoader.load('1979-04-16', 500)
	rankingsLoader.load('1979-04-23', 500)
	rankingsLoader.load('1979-04-30', 500)
	rankingsLoader.load('1979-05-21', 500)
	rankingsLoader.load('1979-05-28', 500)
	rankingsLoader.load('1979-06-11', 500)
	rankingsLoader.load('1979-06-18', 500)
	rankingsLoader.load('1979-06-25', 500)
	rankingsLoader.load('1979-07-09', 500)
	rankingsLoader.load('1979-07-16', 500)
	rankingsLoader.load('1979-07-23', 500)
	rankingsLoader.load('1979-08-06', 500)
	rankingsLoader.load('1979-08-20', 500)
	rankingsLoader.load('1979-08-27', 500)
	rankingsLoader.load('1979-09-10', 500)
	rankingsLoader.load('1979-09-17', 500)
	rankingsLoader.load('1979-09-24', 500)
	rankingsLoader.load('1979-10-01', 500)
	rankingsLoader.load('1979-10-08', 500)
	rankingsLoader.load('1979-10-15', 500)
	rankingsLoader.load('1979-10-22', 500)
	rankingsLoader.load('1979-10-29', 500)
	rankingsLoader.load('1979-11-12', 500)
	rankingsLoader.load('1979-11-19', 500)
	rankingsLoader.load('1979-11-26', 500)
	rankingsLoader.load('1979-12-03', 500)
	rankingsLoader.load('1979-12-10', 500)
	rankingsLoader.load('1979-12-26', 500, ['Scott Clark'])
	rankingsLoader.load('1980-01-07', 500)
	rankingsLoader.load('1980-01-21', 500)
	rankingsLoader.load('1980-01-28', 500)
	rankingsLoader.load('1980-02-04', 500)
	rankingsLoader.load('1980-02-18', 500)
	rankingsLoader.load('1980-02-25', 500)
	rankingsLoader.load('1980-03-03', 500)
	rankingsLoader.load('1980-03-10', 500)
	rankingsLoader.load('1980-03-17', 500)
	rankingsLoader.load('1980-03-24', 500)
	rankingsLoader.load('1980-03-31', 500)
	rankingsLoader.load('1980-04-07', 500)
	rankingsLoader.load('1980-04-14', 500)
	rankingsLoader.load('1980-04-21', 500)
	rankingsLoader.load('1980-04-28', 500)
	rankingsLoader.load('1980-05-05', 500)
	rankingsLoader.load('1980-05-19', 500)
	rankingsLoader.load('1980-05-26', 500)
	rankingsLoader.load('1980-06-09', 500)
	rankingsLoader.load('1980-06-16', 500)
	rankingsLoader.load('1980-06-23', 500)
	rankingsLoader.load('1980-06-30', 500)
	rankingsLoader.load('1980-07-07', 500)
	rankingsLoader.load('1980-07-14', 500)
	rankingsLoader.load('1980-07-21', 500)
	rankingsLoader.load('1980-07-28', 500)
	rankingsLoader.load('1980-08-04', 500)
	rankingsLoader.load('1980-08-11', 500)
	rankingsLoader.load('1980-08-18', 500)
	rankingsLoader.load('1980-08-25', 500)
	rankingsLoader.load('1980-09-08', 500)
	rankingsLoader.load('1980-09-15', 500)
	rankingsLoader.load('1980-09-22', 500)
	rankingsLoader.load('1980-09-29', 500)
	rankingsLoader.load('1980-10-06', 500)
	rankingsLoader.load('1980-10-13', 500)
	rankingsLoader.load('1980-10-20', 500)
	rankingsLoader.load('1980-10-27', 500)
	rankingsLoader.load('1980-11-03', 500)
	rankingsLoader.load('1980-11-10', 500)
	rankingsLoader.load('1980-11-17', 500)
	rankingsLoader.load('1980-11-24', 500)
	rankingsLoader.load('1980-12-01', 500)
	rankingsLoader.load('1980-12-29', 500)
	rankingsLoader.load('1981-01-04', 500)
	rankingsLoader.load('1981-01-05', 500)
	rankingsLoader.load('1981-01-12', 500)
	rankingsLoader.load('1981-01-26', 500)
	rankingsLoader.load('1981-02-02', 500)
	rankingsLoader.load('1981-02-09', 500)
	rankingsLoader.load('1981-02-23', 500)
	rankingsLoader.load('1981-03-02', 500)
	rankingsLoader.load('1981-03-09', 500)
	rankingsLoader.load('1981-03-16', 500)
	rankingsLoader.load('1981-03-23', 500)
	rankingsLoader.load('1981-03-30', 500)
	rankingsLoader.load('1981-04-06', 500)
	rankingsLoader.load('1981-04-13', 500)
	rankingsLoader.load('1981-04-20', 500)
	rankingsLoader.load('1981-04-27', 500)
	rankingsLoader.load('1981-05-11', 500)
	rankingsLoader.load('1981-05-18', 500)
	rankingsLoader.load('1981-05-25', 500)
	rankingsLoader.load('1981-06-08', 500)
	rankingsLoader.load('1981-06-15', 500)
	rankingsLoader.load('1981-06-22', 500)
	rankingsLoader.load('1981-07-06', 500)
	rankingsLoader.load('1981-07-13', 500)
	rankingsLoader.load('1981-07-20', 500)
	rankingsLoader.load('1981-07-27', 500)
	rankingsLoader.load('1981-08-03', 500)
	rankingsLoader.load('1981-08-10', 500)
	rankingsLoader.load('1981-08-17', 500)
	rankingsLoader.load('1981-08-24', 500)
	rankingsLoader.load('1981-09-14', 500)
	rankingsLoader.load('1981-09-21', 500)
	rankingsLoader.load('1981-10-05', 500)
	rankingsLoader.load('1981-10-12', 500)
	rankingsLoader.load('1981-10-19', 500)
	rankingsLoader.load('1981-10-26', 500)
	rankingsLoader.load('1981-11-02', 500)
	rankingsLoader.load('1981-11-09', 500)
	rankingsLoader.load('1981-11-16', 500)
	rankingsLoader.load('1981-11-23', 500)
	rankingsLoader.load('1981-11-30', 500)
	rankingsLoader.load('1981-12-21', 500)
	rankingsLoader.load('1982-01-04', 500, ['Paulo Wildmann'])
	rankingsLoader.load('1982-01-11', 500)
	rankingsLoader.load('1982-01-18', 500)
	rankingsLoader.load('1982-02-01', 500)
	rankingsLoader.load('1982-02-08', 500)
	rankingsLoader.load('1982-02-15', 500)
	rankingsLoader.load('1982-02-22', 500)
	rankingsLoader.load('1982-03-01', 500)
	rankingsLoader.load('1982-03-15', 500)
	rankingsLoader.load('1982-03-22', 500)
	rankingsLoader.load('1982-03-29', 500)
	rankingsLoader.load('1982-04-05', 500)
	rankingsLoader.load('1982-04-12', 500)
	rankingsLoader.load('1982-04-19', 500)
	rankingsLoader.load('1982-04-26', 500)
	rankingsLoader.load('1982-05-03', 500)
	rankingsLoader.load('1982-05-17', 500)
	rankingsLoader.load('1982-05-24', 500)
	rankingsLoader.load('1982-06-07', 500)
	rankingsLoader.load('1982-06-14', 500)
	rankingsLoader.load('1982-06-21', 500)
	rankingsLoader.load('1982-07-05', 500)
	rankingsLoader.load('1982-07-12', 500)
	rankingsLoader.load('1982-07-19', 500)
	rankingsLoader.load('1982-07-26', 500)
	rankingsLoader.load('1982-08-02', 500)
	rankingsLoader.load('1982-08-09', 500)
	rankingsLoader.load('1982-08-16', 500)
	rankingsLoader.load('1982-08-23', 500)
	rankingsLoader.load('1982-09-13', 500)
	rankingsLoader.load('1982-09-20', 500)
	rankingsLoader.load('1982-09-27', 500)
	rankingsLoader.load('1982-10-04', 500)
	rankingsLoader.load('1982-10-11', 500)
	rankingsLoader.load('1982-10-18', 500)
	rankingsLoader.load('1982-10-25', 500)
	rankingsLoader.load('1982-11-01', 500)
	rankingsLoader.load('1982-11-08', 500)
	rankingsLoader.load('1982-11-15', 500)
	rankingsLoader.load('1982-11-22', 500)
	rankingsLoader.load('1982-11-29', 500)
	rankingsLoader.load('1982-12-13', 500)
	rankingsLoader.load('1982-12-20', 500)
	rankingsLoader.load('1982-12-27', 500)
	rankingsLoader.load('1983-01-17', 500)
	rankingsLoader.load('1983-01-31', 500)
	rankingsLoader.load('1983-02-07', 500)
	rankingsLoader.load('1983-02-14', 500)
	rankingsLoader.load('1983-02-21', 500)
	rankingsLoader.load('1983-02-28', 500)
	rankingsLoader.load('1983-03-07', 500)
	rankingsLoader.load('1983-03-14', 500)
	rankingsLoader.load('1983-03-21', 500)
	rankingsLoader.load('1983-03-28', 500)
	rankingsLoader.load('1983-04-04', 500)
	rankingsLoader.load('1983-04-11', 500)
	rankingsLoader.load('1983-04-18', 500)
	rankingsLoader.load('1983-04-25', 500)
	rankingsLoader.load('1983-05-02', 500)
	rankingsLoader.load('1983-05-16', 500)
	rankingsLoader.load('1983-05-23', 500)
	rankingsLoader.load('1983-06-06', 500)
	rankingsLoader.load('1983-06-13', 500)
	rankingsLoader.load('1983-06-20', 500)
	rankingsLoader.load('1983-07-04', 500)
	rankingsLoader.load('1983-07-11', 500)
	rankingsLoader.load('1983-07-18', 500)
	rankingsLoader.load('1983-07-25', 500)
	rankingsLoader.load('1983-08-01', 500)
	rankingsLoader.load('1983-08-08', 500)
	rankingsLoader.load('1983-08-15', 500)
	rankingsLoader.load('1983-08-22', 500)
	rankingsLoader.load('1983-09-12', 500)
	rankingsLoader.load('1983-09-19', 500)
	rankingsLoader.load('1983-09-26', 500)
	rankingsLoader.load('1983-10-03', 500)
	rankingsLoader.load('1983-10-10', 500)
	rankingsLoader.load('1983-10-17', 500)
	rankingsLoader.load('1983-10-24', 500)
	rankingsLoader.load('1983-10-31', 500)
	rankingsLoader.load('1983-11-07', 500)
	rankingsLoader.load('1983-11-14', 500)
	rankingsLoader.load('1983-11-21', 500)
	rankingsLoader.load('1983-11-28', 500)
	rankingsLoader.load('1983-12-12', 500)
	rankingsLoader.load('1983-12-19', 500)
	rankingsLoader.load('1984-01-09', 500)
	rankingsLoader.load('1984-01-16', 500)
	rankingsLoader.load('1984-01-30', 500)
	rankingsLoader.load('1984-02-06', 500)
	rankingsLoader.load('1984-02-13', 500)
	rankingsLoader.load('1984-02-20', 500)
	rankingsLoader.load('1984-03-05', 500)
	rankingsLoader.load('1984-03-12', 500)
	rankingsLoader.load('1984-03-19', 500)
	rankingsLoader.load('1984-03-26', 500)
	rankingsLoader.load('1984-04-02', 500)
	rankingsLoader.load('1984-04-09', 500)
	rankingsLoader.load('1984-04-16', 500)
	rankingsLoader.load('1984-04-23', 500)
	rankingsLoader.load('1984-04-30', 500)
	rankingsLoader.load('1984-05-14', 500)
	rankingsLoader.load('1984-05-21', 500)
	rankingsLoader.load('1984-06-11', 500)
	rankingsLoader.load('1984-06-18', 500)

	println 'Fixing invalid rankings...'
	rankingsLoader.load('1994-12-26', 500)
	rankingsLoader.load('1996-09-02', 500)
	rankingsLoader.load('1996-12-23', 500)
	rankingsLoader.load('1996-12-30', 500)
	rankingsLoader.load('1997-01-20', 500)
	rankingsLoader.load('1997-03-24', 500)
	rankingsLoader.load('1997-06-02', 500)
	rankingsLoader.load('1997-06-30', 500)
	rankingsLoader.load('1997-09-01', 500)
	rankingsLoader.load('1997-12-22', 500)
	rankingsLoader.load('1997-12-29', 500)
	rankingsLoader.load('1998-01-05', 500)
	rankingsLoader.load('1998-01-26', 500)
	rankingsLoader.load('1998-03-23', 500)
	rankingsLoader.load('1998-06-01', 500)
	rankingsLoader.load('1998-06-29', 500)
	rankingsLoader.load('1998-09-07', 500)
	rankingsLoader.load('1998-12-21', 500)
	rankingsLoader.load('1998-12-28', 500)
	rankingsLoader.load('1999-01-25', 500)
	rankingsLoader.load('1999-03-22', 500)
	rankingsLoader.load('1999-05-31', 500)
	rankingsLoader.load('1999-06-28', 500)
	rankingsLoader.load('1999-09-06', 500)
	rankingsLoader.load('1999-12-20', 500)
	rankingsLoader.load('1999-12-27', 500)
	rankingsLoader.load('2000-01-10', 500)
}
