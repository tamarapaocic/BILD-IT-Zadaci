package zadaci_13_02_2017;

public class Zadatak2 {

	public static void main(String[] args) {
		//niz od 52 karte
		int[] decks = new int[52];
		//niz za znakove karti
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		//niz za broj karte
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        //incijalizacija niza
		for(int i = 0; i < decks.length; i++){
			decks[i] = i;
		}
		//mjesanje spila
		for (int i = 0; i<decks.length;i++){
			int index = (int)(Math.random() * 52);
			int temp = decks[i];
			decks[i] = decks[index];
			decks[index] = temp;
		}

		for(int i=0; i<1;i++){
			String suit = suits[decks[i] / 13];
		    String rank = ranks[decks[i] % 13];
		    System.out.println("Karta koju ste izvukli je "+ rank + " " + suit);
		} 
			}

		}
