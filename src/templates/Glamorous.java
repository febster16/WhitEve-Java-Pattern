package templates;

public class Glamorous extends Wedding{
	private String cover;
	private int coverPrice;
	
	public Glamorous(int guest, String cover, int coverPrice) {
		super(guest);
		this.cover = cover;
		this.coverPrice = coverPrice;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}



	public int getCoverPrice() {
		return coverPrice;
	}



	public void setCoverPrice(int coverPrice) {
		this.coverPrice = coverPrice;
	}

	@Override
	public void startParty() {
		System.out.println("Your party is ready! Have a great party!");
	}

	@Override
	public void inviteGuests() {
		System.out.println("Inviting " + getGuest() + " guests...");
	}

	@Override
	public void createCardInfo() {
		System.out.println("Placing invitations to the " + cover + " Cover...");
	}

	@Override
	public void createInvitations() {
		System.out.println("Creating Glamorous Invitations...");
	}

}
