package desgn.patterns.java.observer;

import javax.swing.JFrame;

public class GraficoBarras implements Observador {

	@Override
	public void mudancaQuantidade(String acao, Integer qtd) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * private DefaultCategoryDataset dataset; private JFrame frame = new JFrame();
	 * 
	 * public GraficoBarras() { dataset = new DefaultCategoryDataset(); JFreeChart
	 * chart = ChartFactory.createBarChart("Carteira de Ações", "Siglas",
	 * "Quantidade", dataset, PlotOrientation.VERTICAL, false, true, false);
	 * 
	 * ChartPanel chartPanel = new ChartPanel(chart);
	 * frame.setContentPane(chartPanel); frame.setSize(500, 270);
	 * frame.setVisible(true); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * }
	 * 
	 * public void mudancaQuantidade(String acao, Integer qtd) {
	 * dataset.setValue(qtd, "Quantidade", acao); }
	 */
}
