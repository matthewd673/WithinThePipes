package com.bitbit.minild61.pipes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main 
{

	public static JFrame frame;
	
	public static int playerx = 550;
	public static int playery = 550;
	
	public static int attack = 3;
	public static int defense = 1;
	public static int health = 10;
	public static int level = 1;
	
	//gotta cap it somewhere
	public static int maxhealth = 10;
	public static int maxdefense = 1;
	
	public static String playerdirection = "down";
	
	public static boolean generating = true;
	
	//for the tutorial
	public static boolean wpress = false;
	public static boolean apress = false;
	public static boolean spress = false;
	public static boolean dpress = false;
	public static boolean uppress = false;
	public static boolean leftpress = false;
	public static boolean rightpress = false;
	public static boolean downpress = false;
	public static boolean epress = false;
	
	//RESOURCES
	public static int money = 0;
	public static int wood = 0;
	public static int stone = 0;
	public static int attackbuff = 0;
	public static int defensebuff = 0;
	
	public static boolean showinginventory = false;
	
	public static boolean alive = true;
	
	public static boolean firstrun = true;
	
	public static void main(String[] args)
	{
		initFrame();
	}
	
	public static void initFrame()
	{
		
		//icon = new ImageIcon("res/img/icon.png");
		
		frame = new JFrame("Within the Pipes");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int) ( screenSize.height / 2 - ( screenSize.height / 2.7)), 0, screenSize.height, screenSize.height);
		GraphicSurface.tileSize = (int) frame.getWidth() / 26;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		//frame.setIconImage(icon.getImage());
		frame.add(new GraphicSurface());
		frame.addKeyListener(new KeyInput());
		
	}
	
}
