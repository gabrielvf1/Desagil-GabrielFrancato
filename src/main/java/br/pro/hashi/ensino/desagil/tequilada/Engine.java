package br.pro.hashi.ensino.desagil.tequilada;

public class Engine {
	private Board board;
	private Player cpuPlayer;
	private Player humanPlayer;
	
	public Engine() {
		board = new Board("board.txt");
		
		cpuPlayer = new Player(0,0);
		humanPlayer = new Player (0,0);
		
	}
	public void update() {
		cpuPlayer.move(1, 2);
	}
	
	public Player getCpuPlayer() {
		return cpuPlayer;
	}
}
