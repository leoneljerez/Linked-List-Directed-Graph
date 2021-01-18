package model;

public class Friend {
	/******* CLASS VARIABLES ****************************************/
	private String firstName = null;
	private String lastName = null;
	
	/******* GETTERS AND SETTERS ***********************************/
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getInitials(){
		char first = getFirstName().charAt(0);
		char last = getLastName().charAt(0);
		String initials = new StringBuilder().append(first).append(last).toString();
		return initials;
	}
	
	/******* CONSTRUCTOR ******************************************/
	public Friend(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/******* METHODS *********************************************/
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append(getFirstName());
		buf.append(" ");
		buf.append(getLastName());
		return buf.toString();
	}
}
