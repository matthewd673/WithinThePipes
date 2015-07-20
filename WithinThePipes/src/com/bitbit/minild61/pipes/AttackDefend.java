package com.bitbit.minild61.pipes;

import java.util.Random;

public class AttackDefend 
{

	public static void slimeMonsterAttack()
	{
		
		Random dmggen = new Random();
		int dmgresult = dmggen.nextInt(21) + 9;
		
		int olddef = Main.defense;
		
		Main.defense -= dmgresult;
		if(Main.defense < 1 && dmgresult > Main.defense)
		{
			Main.health -= dmgresult - olddef;
			Main.defense = 0;
		}
		
	}
	
	public static void spiderMonsterAttack()
	{
		
		Random dmggen = new Random();
		int dmgresult = dmggen.nextInt(4) + 2;
		
		int olddef = Main.defense;
		
		Main.defense -= dmgresult;
		if(Main.defense < 1 && dmgresult > Main.defense)
		{
			Main.health -= dmgresult - olddef;
			Main.defense = 0;
		}
		
	}
	
	public static void ratMonsterAttack()
	{
		
		Random dmggen = new Random();
		int dmgresult = dmggen.nextInt(11) + 5;
		
		int olddef = Main.defense;
		
		Main.defense -= dmgresult;
		if(Main.defense < 1 && dmgresult > Main.defense)
		{
			Main.health -= dmgresult - olddef;
			Main.defense = 0;
		}
		
	}
	
	public static void dealDamage(int monsterx, int monstery)
	{
		if(GenerateDungeon.monsters[monsterx][monstery] > 0)
		{
			GenerateDungeon.monsters[monsterx][monstery] -= Main.attack + Main.attackbuff;
			if(GenerateDungeon.monsters[monsterx][monstery] < 1)
			{
				GenerateDungeon.generateTreasure(monsterx, monstery, GenerateDungeon.map[monsterx][monstery]);
			}
			if(GenerateDungeon.map[monsterx][monstery] == 3)
			{
				spiderMonsterAttack();
			}
			if(GenerateDungeon.map[monsterx][monstery] == 4)
			{
				slimeMonsterAttack();
			}
			if(GenerateDungeon.map[monsterx][monstery] == 5)
			{
				ratMonsterAttack();
			}
		}
	}
	
}
