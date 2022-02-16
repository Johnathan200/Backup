package com.main;

public class Main implements Runnable {
	public Thread game;
	public void Start(){
		game = new Thread(this,"game");
		game.start();
	}
	public void Run() {
		
		
	}
	
	public static void init() {
		System.out.println("Initializing game");
		
	}
	
	public static void main(String[] args) {
		new Main().Start();

	}

}
