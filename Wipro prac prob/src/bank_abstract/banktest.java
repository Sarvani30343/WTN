package bank_abstract;

import bank_abstract.GeneralBank;
import bank_abstract.ICICIBank;
import bank_abstract.KotMBank;

public class banktest{

	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();

		System.out.println(iciciBank.getSavingInterestRate());
		System.out.println(iciciBank.getFixedInterestRate());
		System.out.println(kotMBank.getSavingInterestRate());
		System.out.println(kotMBank.getFixedInterestRate());
		
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KotMBank();
		
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
	}

}
