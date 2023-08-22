package login;

public class Member {
	
	String dbid, dbpw, dbPname;

	public Member(String dbid, String dbpw, String dbPname) {
		super();
		this.dbid = dbid;
		this.dbpw = dbpw;
		this.dbPname = dbPname;
	}

	public String getDbid() {
		return dbid;
	}

	public String getDbpw() {
		return dbpw;
	}

	public String getDbPname() {
		return dbPname;
	}
	
	
}
