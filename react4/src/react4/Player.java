package react4;

public class Player {
	
	private int id;
	private String firstName;
	private String lastName;
	private String tc;
	private String date;
	
	public Player() {
		super();
	}
	
	public Player(int id, String firstName, String lastName, String tc, String date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tc = tc;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
