package desgn.patterns.java.adapter;

public interface EnviadorSMS {
	public void enviarSMS(String destino, String origem, String[] msgs)
			throws SMSException;
}
