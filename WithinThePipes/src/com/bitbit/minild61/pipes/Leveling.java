package com.bitbit.minild61.pipes;

public class Leveling 
{

	public static void checkLevel()
	{
		//determine level
		if(Main.money >= 10)
		{
			Main.level = 2;
		}
		if(Main.money >= 25)
		{
			Main.level = 3;
		}
		if(Main.money >= 40)
		{
			Main.level = 4;
		}
		if(Main.money >= 70)
		{
			Main.level = 5;
		}
		if(Main.money >= 125)
		{
			Main.level = 6;
		}
		if(Main.money >= 175)
		{
			Main.level = 7;
		}
		if(Main.money >= 275)
		{
			Main.level = 8;
		}
		if(Main.money >= 400)
		{
			Main.level = 9;
		}
		if(Main.money >= 600)
		{
			Main.level = 10;
		}
		if(Main.money >= 1000)
		{
			Main.level = 11;
		}
		
		//buff for level
		if(Main.level == 1)
		{
			Main.attack = 3;
			Main.health = 10;
			Main.maxhealth = 10;
			Main.defense = 1;
			Main.maxdefense = 1;
		}
		if(Main.level == 2)
		{
			Main.attack = 5;
			Main.maxhealth = 12;
			Main.maxdefense = 3;
		}
		if(Main.level == 3)
		{
			Main.attack = 7;
			Main.maxhealth = 12;
			Main.maxdefense = 6;
		}
		if(Main.level == 4)
		{
			Main.attack = 10;
			Main.maxhealth = 13;
			Main.maxdefense = 6;
		}
		if(Main.level == 5)
		{
			Main.attack = 7;
			Main.maxhealth = 15;
			Main.maxdefense = 8;
		}
		if(Main.level == 6)
		{
			Main.attack = 8;
			Main.maxhealth = 16;
			Main.maxdefense = 9;
		}
		if(Main.level == 7)
		{
			Main.attack = 9;
			Main.maxhealth = 16;
			Main.maxdefense = 10;
		}
		if(Main.level == 8)
		{
			Main.attack = 11;
			Main.maxhealth = 17;
			Main.maxdefense = 10;
		}
		if(Main.level == 9)
		{
			Main.attack = 15;
			Main.maxhealth = 20;
			Main.maxdefense = 13;
		}
		if(Main.level == 10)
		{
			Main.attack = 20;
			Main.maxhealth = 24;
			Main.maxdefense = 17;
		}
		if(Main.level == 11)
		{
			Main.attack = 26;
			Main.maxhealth = 29;
			Main.maxdefense = 21;
		}
	}
	
}
