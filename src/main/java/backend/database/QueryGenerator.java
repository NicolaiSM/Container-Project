package backend.database;

import java.util.ArrayList;


public class QueryGenerator {
	
	private ArrayList<Pair> query;
	
	private static QueryGenerator querygenerator = null;
	
	public QueryGenerator addQuery(String first, String second) {
		query.add( new Pair(first, second));
		return querygenerator;
	}
	
	public static QueryGenerator startQuery()  {
		querygenerator = new QueryGenerator();
		return querygenerator;
	}
	
	public ArrayList<Pair> finishQuery()  {
		return query;
	}

}
