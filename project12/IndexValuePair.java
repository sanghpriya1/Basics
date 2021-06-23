package project12;

public class IndexValuePair {
	
	private int index;
	private int value;
	
	public IndexValuePair(int index, int value) {
		super();
		this.index = index;
		this.value = value;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IndexValuePair [index=" + index + ", value=" + value + "]";
	}
	
	
}
