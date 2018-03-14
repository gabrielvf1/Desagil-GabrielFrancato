package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//A expressão "implements ActionListener" estabelece
//que objetos dessa classe podem reagir ao relógio.
public class Controller implements ActionListener, KeyListener {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// Esse método especial, que a expressão "implements ActionListener"
	// obriga a ter, é o método chamado pelo relógio a cada segundo.
	@Override
	public void actionPerformed(ActionEvent event) {
		model.update();
		view.repaint();
	}

	// Esses métodos especiais, que a expressão "implements KeyListener"
	// obriga a ter, são os métodos chamados em reação ao teclado.
	@Override
	public void keyPressed(KeyEvent event) {

		if(event.getKeyCode() == KeyEvent.VK_UP) {
			int rowShift=-1;
			int colShift=0;
			model.updatePlayer(rowShift,colShift);
		}
		else {
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			int rowShift=0;
			int colShift=-1;
			model.updatePlayer(rowShift,colShift);
		}
		else {
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			int rowShift=1;
			int colShift=0;
			model.updatePlayer(rowShift,colShift);
		}
		else {
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			int rowShift=0;
			int colShift=1;
			model.updatePlayer(rowShift,colShift);
		}}}}
	}
	@Override
	public void keyReleased(KeyEvent event) {
	}
	@Override
	public void keyTyped(KeyEvent event) {
	}
}
