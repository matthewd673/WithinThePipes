package com.bitbit.minild61.pipes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class GraphicSurface extends JComponent
{
	
	//Images
	public static BufferedImage tilesheet;
	public static BufferedImage loading;
	public static BufferedImage movetut;
	public static BufferedImage attacktut;
	public static BufferedImage inventtut;
	public static BufferedImage inventscreen;
	public static BufferedImage skull;
	
	public static int tileSize = 64;

	public void paint(Graphics g)
	{
		
		if(Main.firstrun == true)
		{
			g.setColor(new Color(43, 43, 43));
			g.fillRect(0, 0, 2500, 2500);
			g.drawImage(loading, Main.frame.getWidth() / 2 - 400, Main.frame.getHeight() / 2 - 300, Main.frame.getWidth() / 2 + 400, Main.frame.getHeight() / 2 + 300, 0, 0, 800, 600, null);
			Main.firstrun = false;
			Main.frame.invalidate();
			Main.frame.validate();
			Main.frame.repaint();
		}
		else
		{
		
			if(Main.health < 1)
			{
				Main.alive = false;
			}
			
			if(Main.health > Main.maxhealth)
			{
				Main.health = Main.maxhealth;
			}
			
			if(Main.alive)
			{
	
				Leveling.checkLevel();
				
				try 
				{
					tilesheet = ImageIO.read(new File("./res/tiles.png"));
					loading = ImageIO.read(new File("./res/loading.png"));
					movetut = ImageIO.read(new File("./res/movetut.png"));
					attacktut = ImageIO.read(new File("./res/attacktut.png"));
					inventtut = ImageIO.read(new File("./res/inventorytut.png"));
					inventscreen = ImageIO.read(new File("./res/inventscreen.png"));
					skull = ImageIO.read(new File("./res/dead.png"));
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
				//generate first time
				if(Main.generating)
				{
					GenerateDungeon.generate();
				}
				
				//rendering dungeon
				for(int i = 0; i <= 27; i++)
				{
					for(int j = 0; j <= 27; j++)
					{
						//da basics
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] != 0)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 80, 0, 96, 16, null);
						}
						else if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 0)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 64, 0, 80, 16, null);
						}
						
						//for monster etc.
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 3)
						{
							//g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 80, 0, 96, 16, null);
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 96, 0, 112, 16, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 4)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 112, 0, 128, 16, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 5)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 32, 32, 48, 48, null);
						}
						
						//for treasure
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 6)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 0, 16, 16, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 7)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 32, 16, 48, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 8)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 16, 16, 32, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 9)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 64, 16, 80, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 10)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 112, 16, 128, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 11)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 96, 16, 112, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 12)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 48, 16, 64, 32, null);
						}
						if(GenerateDungeon.map[i + Main.playerx - 13][j + Main.playery - 13] == 13)
						{
							g.drawImage(tilesheet, tileSize * i, tileSize * j, tileSize * i + tileSize, tileSize * j + tileSize, 64, 32, 80, 48, null);
						}
					}
				}
				
				//switching player sprite
				switch(Main.playerdirection)
				{
				
				case "up":
					g.drawImage(tilesheet, tileSize * 13, tileSize * 13, tileSize * 13 + tileSize, tileSize * 13 + tileSize, 48, 0, 64, 16, null);
					break;
				case "down":
					g.drawImage(tilesheet, tileSize * 13, tileSize * 13, tileSize * 13 + tileSize, tileSize * 13 + tileSize, 0, 0, 16, 16, null);
					break;
					
				case "left":
					g.drawImage(tilesheet, tileSize * 13, tileSize * 13, tileSize * 13 + tileSize, tileSize * 13 + tileSize, 32, 0, 48, 16, null);
					break;
					
				case "right":
					g.drawImage(tilesheet, tileSize * 13, tileSize * 13, tileSize * 13 + tileSize, tileSize * 13 + tileSize, 16, 0, 32, 16, null);
					break;
				}
				
				//for the tuts
				if(!Main.wpress || !Main.apress || !Main.spress || !Main.dpress)
				{
					g.drawImage(movetut, 10, 10, 210, 110, 0, 0, 100, 50, null);
				}
				
				if(!Main.uppress || !Main.leftpress || !Main.rightpress || !Main.downpress)
				{
					g.drawImage(attacktut, 10, 130, 210, 240, 0, 0, 100, 50, null);
				}
				
				/*
				if(!Main.epress)
				{
					g.drawImage(inventtut, 10, 260, 210, 370, 0, 0, 100, 50, null);
				}
	
				if(Main.showinginventory)
				{
					g.setColor(new Color(0, 0, 0));
					g.drawImage(inventscreen, 32, 32, Main.frame.getWidth() - 32, Main.frame.getHeight() - 32, 0, 0, 32, 24, null);
					g.drawImage(tilesheet, 48, 48, 168, 168, 80, 32, 96, 48, null);
					g.drawString("(+3 attack) 30g", 48, 174);
					g.drawImage(tilesheet, 168, 48, 288, 168, 80, 16, 96, 32, null);
					g.drawString("(+6 attack) 80g", 168, 174);
					g.drawImage(tilesheet, 288, 48, 408, 168, 64, 16, 80, 32, null);
					g.drawString("(+3 sheild) 100g", 288, 174);
				}
				*/
				
				//UI stuff THIS SHOULD BE DRAWN LAST!!!
				g.drawImage(tilesheet, 16, 16, 48, 48, 0, 32, 16, 48, null);
				g.drawImage(tilesheet, 16, 48, 48, 80, 16, 32, 32, 48, null);
				g.drawImage(tilesheet, 16, 80, 48, 112, 80, 16, 96, 32, null);
				
				//And the strings
				g.setColor(new Color(255, 0, 0));
				g.drawString(Integer.toString(Main.health) + "/" + Integer.toString(Main.maxhealth), 48, 32);
				g.setColor(new Color(160, 210, 255));
				g.drawString(Integer.toString(Main.defense) + "/" + Integer.toString(Main.maxdefense), 100, 32);
				g.setColor(new Color(255, 200, 0));
				g.drawString(Integer.toString(Main.money), 48, 70);
				g.setColor(new Color(0, 190, 0));
				g.drawString(Integer.toString(Main.attack + Main.attackbuff), 48, 96);
				
				g.dispose();
			
			}
			else
			{
				g.setColor(new Color(0, 0, 0));
				g.fillRect(0, 0, 4000, 4000);
				g.drawImage(skull, 0, 0, Main.frame.getWidth(), Main.frame.getHeight(), 0, 0, 24, 24, null);
				g.setColor(new Color(190, 0, 0));
				g.drawString("You've died! Restart the game to play again.", 256, 32);
			}
		}
	}
	
}
