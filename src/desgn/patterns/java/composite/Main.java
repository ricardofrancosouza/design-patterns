package desgn.patterns.java.composite;

public class Main {
	public static void main(String...strings ) {
		TrechoSimples ts1 = new TrechoSimples("S�o Paulo", "Bras�lia", 500);
		TrechoSimples ts2 = new TrechoSimples("Bras�lia", "Recife", 300);
		TrechoSimples ts3 = new TrechoSimples("Recife","Natal", 350);
		TrechoComposto tc1 = new TrechoComposto(ts2, ts3, 30);
		TrechoComposto tc2 = new TrechoComposto(ts1, tc1, 50);
	}
}
