package br.com.kauan.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.kauan.calc.modelo.Memoria;
import br.com.kauan.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display  extends JPanel implements MemoriaObservador{

	private JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObeservador(this);
		
		setBackground(new Color(32,32,32));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("arial", Font.PLAIN,35));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,60));
		
		add(label);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}
}
