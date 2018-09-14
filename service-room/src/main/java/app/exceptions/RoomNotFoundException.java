package app.exceptions;

public class RoomNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RoomNotFoundException() {
		super("Room not found");
	}

}
