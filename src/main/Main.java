// Febryan Stefanus Tandian - 2301942406 
// COMP6122001 - Framework Layer Architecture

package main;

import java.util.Vector;

import collections.WeddingCollection;
import helpers.Helper;
import iterators.IWeddingIterator;
import templates.Elegant;
import templates.Glamorous;
import templates.Wedding;

public class Main {
	
	Wedding weddingParty;
	WeddingCollection weddingPartyCollection;
	Vector<Wedding> weddingParties = new Vector<>();
	
	
	
	public void whitEveMenu() {
		int choice = 0;
		
		do {
			System.out.println("WhitEve\n===========");
			System.out.println("1. Plan a Wedding Party");
			System.out.println("2. Show All Wedding Parties");
			System.out.println("3. Exit");
			System.out.print(">> ");
			
			choice = Helper.scan.nextInt(); Helper.scan.nextLine();
			
			switch (choice) {
			case 1:
				planWedding();
				break;

			case 2:
				showAllWedding();
				break;
			}
		} while (choice != 3);
		
		System.out.println("\nThank You!");
		System.out.println("Press enter to continue...");
		Helper.scan.nextLine();
	}
	
	private void showAllWedding() {
		if(weddingParties.isEmpty()) {
			System.out.println("\nNo Wedding Plan Yet.");
		} else {
			weddingPartyCollection = new WeddingCollection(weddingParties);
			IWeddingIterator iterator = weddingPartyCollection.createIterator();
			while(iterator.hasNext()) {
				weddingParty = iterator.next();
				System.out.println("Total guests: " + weddingParty.getGuest());
				System.out.println("Invitation");
				if(weddingParty.getClass() == Elegant.class) {
					System.out.println("Theme: Elegant");
					System.out.println("Ribbon Color: " + ((Elegant) weddingParty).getRibbon());
				} else if (weddingParty.getClass() == Glamorous.class) {
					System.out.println("Theme: Glamorous");
					System.out.println("Cover Type: " + ((Glamorous) weddingParty).getCover());					
				}
				System.out.println("============================");
			}
			
		}
		System.out.println("Press enter to continue...");
		Helper.scan.nextLine();
	}

	private void planWedding() {
		String theme = "";
		int guest = 0;
		
		System.out.println("General Information\n==========");
		
		do {
			System.out.print("Input wedding theme [Elegant | Glamorous]: ");
			
			theme = Helper.scan.nextLine();
		} while (!theme.equals("Elegant") && !theme.equals("Glamorous"));
		
		do {
			System.out.print("Input total guest [50 - 500]: ");
			
			guest = Helper.scan.nextInt(); Helper.scan.nextLine();
		} while (guest < 50 || guest > 500);
		
		System.out.println("\nInvitation card information\n=================");
		
		String ribbon = "";
		int ribbonPrice = 0;
		String cover = "";
		int coverPrice = 0;
		
		if(theme.equals("Elegant")) {
			do {
				System.out.print("Input ribbon color [White | Pink]: ");
				
				ribbon = Helper.scan.nextLine();
			} while (!ribbon.equals("White") && !ribbon.equals("Pink"));
			
			do {
				System.out.print("Input ribbon price [$50 - $75]: ");
				
				ribbonPrice = Helper.scan.nextInt(); Helper.scan.nextLine();
			} while (ribbonPrice < 50 || ribbonPrice > 75);

			System.out.println();
			weddingParty = new Elegant(guest, ribbon, ribbonPrice);
			weddingParty.arrangeWedding();
			weddingParties.add(weddingParty);
			
		} else if (theme.equals("Glamorous")) {
			do {
				System.out.print("Input cover type [Soft | Hard]: ");
				
				cover = Helper.scan.nextLine();
			} while (!cover.equals("Soft") && !cover.equals("Hard"));
			
			do {
				System.out.print("Input cover price [$50 - $75]: ");
				
				coverPrice = Helper.scan.nextInt(); Helper.scan.nextLine();
			} while (coverPrice < 50 || coverPrice > 75);
			
			System.out.println();
			weddingParty = new Glamorous(guest, cover, coverPrice);
			weddingParty.arrangeWedding();
			weddingParties.add(weddingParty);
		}
		
		System.out.println("Press enter to continue...");
		Helper.scan.nextLine();
	}

	public Main() {
		whitEveMenu();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
