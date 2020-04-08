package backend.database;

import java.util.ArrayList;


public class QueryGenerator {
	
	private ArrayList<Pair<?,?>> query;
	
	private static QueryGenerator querygenerator = null;
	
	public <K,V> QueryGenerator addQuery(K first, V second) {
		query.add( new Pair<K, V>(first, second));
		return querygenerator;
	}
	
	public static QueryGenerator startQuery()  {
		querygenerator = new QueryGenerator();
		return querygenerator;
	}
	
	public ArrayList<Pair<?,?>> finishQuery()  {
		return query;
	}

}
