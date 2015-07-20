package com.bitbit.minild61.pipes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener
{

	public void keyPressed(KeyEvent e) 
	{
		
		switch(e.getKeyCode())
		{
		
		case KeyEvent.VK_W:
			Main.defense++;
			if(Main.defense >= Main.maxdefense)
			{
				Main.defense = Main.maxdefense;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 1 || GenerateDungeon.map[Main.playerx][Main.playery - 1] == 2)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 3)
			{
				AttackDefend.spiderMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 4)
			{
				AttackDefend.slimeMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 5)
			{
				AttackDefend.ratMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 6)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.money += 10;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 7)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.money += 25;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 8)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.money += 100;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 9)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.stone++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 10)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.health += 3;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 11)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.attackbuff++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 12)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.wood++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 13)
			{
				Main.playery -= 1;
				Main.playerdirection = "up";
				Main.wpress = true;
				Main.maxdefense += 2;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			break;
			
		case KeyEvent.VK_A:
			Main.defense++;
			if(Main.defense >= Main.maxdefense)
			{
				Main.defense = Main.maxdefense;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 1 || GenerateDungeon.map[Main.playerx - 1][Main.playery] == 2)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 3)
			{
				AttackDefend.spiderMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 4)
			{
				AttackDefend.slimeMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 5)
			{
				AttackDefend.ratMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 6)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.money += 10;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 7)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.money += 25;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 8)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.money += 100;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 9)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.stone++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 10)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.health += 3;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 11)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.attackbuff++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 12)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.wood++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 13)
			{
				Main.playerx -= 1;
				Main.playerdirection = "left";
				Main.apress = true;
				Main.maxdefense += 2;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			break;
			
		case KeyEvent.VK_S:
			Main.defense++;
			if(Main.defense >= Main.maxdefense)
			{
				Main.defense = Main.maxdefense;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 1 || GenerateDungeon.map[Main.playerx][Main.playery + 1] == 2)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 3)
			{
				AttackDefend.spiderMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 4)
			{
				AttackDefend.slimeMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 5)
			{
				AttackDefend.ratMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 5)
			{
				AttackDefend.ratMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 6)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.money += 10;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 7)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.money += 25;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 8)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.money += 100;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 9)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.stone++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 10)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.health += 3;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 11)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.attackbuff++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 12)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.wood++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 13)
			{
				Main.playery += 1;
				Main.playerdirection = "down";
				Main.spress = true;
				Main.maxdefense += 2;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			break;
			
		case KeyEvent.VK_D:
			Main.defense++;
			if(Main.defense >= Main.maxdefense)
			{
				Main.defense = Main.maxdefense;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 1 || GenerateDungeon.map[Main.playerx + 1][Main.playery] == 2)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 3)
			{
				AttackDefend.spiderMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 4)
			{
				AttackDefend.slimeMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 5)
			{
				AttackDefend.ratMonsterAttack();
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 6)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.money += 10;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 7)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.money += 25;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 8)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.money += 100;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 9)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.stone++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 10)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.health += 3;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 11)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.attackbuff++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 12)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.wood++;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 13)
			{
				Main.playerx += 1;
				Main.playerdirection = "right";
				Main.dpress = true;
				Main.maxdefense += 2;
				GenerateDungeon.map[Main.playerx][Main.playery] = 1;
			}
			break;
			
		case KeyEvent.VK_UP:
			Main.uppress = true;
			if(Main.alive == false)
			{
				Main.alive = true;
				Main.generating = true;
				Main.money = 0;
				Main.defensebuff = 0;
				Main.attackbuff = 0;
				Main.level = 1;
				Main.frame.invalidate();
				Main.frame.validate();
				Main.frame.repaint();
			}
			if(GenerateDungeon.map[Main.playerx][Main.playery - 1] == 3 || GenerateDungeon.map[Main.playerx][Main.playery - 1] == 4 || GenerateDungeon.map[Main.playerx][Main.playery - 1] == 5)
			{
				AttackDefend.dealDamage(Main.playerx, Main.playery - 1);
			}
			break;
		
		case KeyEvent.VK_LEFT:
			Main.leftpress = true;
			if(GenerateDungeon.map[Main.playerx - 1][Main.playery] == 3 || GenerateDungeon.map[Main.playerx - 1][Main.playery] == 4 || GenerateDungeon.map[Main.playerx - 1][Main.playery - 1] == 5)
			{
				AttackDefend.dealDamage(Main.playerx - 1, Main.playery);
			}
			break;
			
		case KeyEvent.VK_RIGHT:
			Main.rightpress = true;
			if(GenerateDungeon.map[Main.playerx + 1][Main.playery] == 3 || GenerateDungeon.map[Main.playerx + 1][Main.playery] == 4 || GenerateDungeon.map[Main.playerx + 1][Main.playery] == 5)
			{
				AttackDefend.dealDamage(Main.playerx + 1, Main.playery);
			}
			break;
			
		case KeyEvent.VK_DOWN:
			Main.downpress = true;
			if(GenerateDungeon.map[Main.playerx][Main.playery + 1] == 3 || GenerateDungeon.map[Main.playerx][Main.playery + 1] == 4 || GenerateDungeon.map[Main.playerx][Main.playery + 1] == 5)
			{
				AttackDefend.dealDamage(Main.playerx, Main.playery + 1);
			}
			break;
			
		case KeyEvent.VK_E:
			Main.epress = true;
			Main.showinginventory = !Main.showinginventory;
			break;
			
		default:
			//nuffin
			break;
			
		}
		
		Main.frame.repaint();
		
	}
	
	public void keyReleased(KeyEvent e) 
	{
		
	}

	public void keyTyped(KeyEvent e) 
	{
		
	}

}
