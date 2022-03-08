package templates;

public abstract class Wedding {
	
	private int guest;

	public Wedding(int guest) {
		super();
		this.guest = guest;
	}

	public int getGuest() {
		return guest;
	}

	public void setGuest(int guest) {
		this.guest = guest;
	}
	
	public void arrangeWedding() {
		createInvitations();
		createCardInfo();
		inviteGuests();
		startParty();
	}

	protected abstract void startParty();

	protected abstract void inviteGuests();

	protected abstract void createCardInfo();

	protected abstract void createInvitations();
	
}
