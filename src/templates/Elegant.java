package templates;

public class Elegant extends Wedding{
	private String ribbon;
	private int ribbonPrice;
	
	public Elegant(int guest, String ribbon, int ribbonPrice) {
		super(guest);
		this.ribbon = ribbon;
		this.ribbonPrice = ribbonPrice;
	}

	public String getRibbon() {
		return ribbon;
	}



	public void setRibbon(String ribbon) {
		this.ribbon = ribbon;
	}



	public int getRibbonPrice() {
		return ribbonPrice;
	}



	public void setRibbonPrice(int ribbonPrice) {
		this.ribbonPrice = ribbonPrice;
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
		System.out.println("Placing " + ribbon + " Ribbons...");
	}

	@Override
	public void createInvitations() {
		System.out.println("Creating Elegant Invitations...");
	}

}
