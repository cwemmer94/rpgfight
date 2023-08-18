package me.cwemmer94.rpgfight;

import net.emberengine.core.EmberEngine;

public class Main extends EmberEngine
{
	public static void main(String[] args)
	{
		new Main().setup();
	}

	@Override
	public void setup() 
	{
		System.out.println("Hello, World!");
		this.window.setWindowSize(1280, 720);
		this.window.setWindowTitle("RPG Fight");
		this.window.setWindowFlags(true);
		this.window.setupWindow();
	}
	
}
