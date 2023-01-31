package org.bank;

public class SbI extends Tmb{
	public void fixedAmount() {
		System.out.println("Fixed Amount : 1000");
		super.fixedAmount();

	}
	public static void main(String[] args) {
		SbI s = new SbI ();
		s.fixedAmount();
		s.savingAmount();
	}

}
