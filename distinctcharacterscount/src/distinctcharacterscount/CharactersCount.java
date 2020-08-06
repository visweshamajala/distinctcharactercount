package distinctcharacterscount;

public class CharactersCount {
	private String name;
	private int distinctCharecterCount;
	public CharactersCount(String name, int distinctCharecterCount) {
		super();
		this.name = name;
		this.distinctCharecterCount = distinctCharecterCount;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDistinctCharecterCount() {
		return distinctCharecterCount;
	}


	public void setDistinctCharecterCount(int distinctCharecterCount) {
		this.distinctCharecterCount = distinctCharecterCount;
	}


	@Override
	public String toString() {
		return "CharactersCount [name=" + name + ", distinctCharecterCount=" + distinctCharecterCount + "]";
	}
	public CharactersCount() {
		super();
		// TODO Auto-generated constructor stub
	}
}
