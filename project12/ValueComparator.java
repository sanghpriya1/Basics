package project12;

import java.util.Comparator;



public class ValueComparator implements Comparator<IndexValuePair>{
	
	

	@Override
	public int compare(IndexValuePair o1, IndexValuePair o2) {
		if(o1.getValue() > o2.getValue())
			return 1;
		else if(o1.getValue() < o2.getValue())
			return -1;
		else if(o1.getIndex() > o2.getIndex())
			return 1;
		else if(o1.getIndex() < o2.getIndex())
			return -1;
		return 0;
	}

}
