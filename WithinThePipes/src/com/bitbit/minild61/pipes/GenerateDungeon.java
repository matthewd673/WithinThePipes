package com.bitbit.minild61.pipes;

import java.util.Random;

public class GenerateDungeon 
{
	
	public static int[][] rooms = new int[121][121];
	
	public static int[][] map = new int[1001][1001];
	public static int[][] monsters = new int[1001][1001];
	
	public static int spawnmonschance = 0;
	public static int spawnitemchance = 0;
	
	public static void generate()
	{
		
		Random rndgen = new Random();
		
		for(int i = 0; i <= 120; i++)
		{
			for(int j = 0; j <= 120; j++)
			{
				int roomtrue = rndgen.nextInt(5);
				rooms[i][j] = roomtrue;
			}
		}
		
		if(Main.generating)
		{
			
			Random roomgen = new Random();
			
			for(int i = 0; i <= 120; i++)
			{
				for(int j = 0; j <= 120; j++)
				{
					
					map[i][j] = 0;
					
					for(int k = 0; k <= 100; k++)
					{
						for(int l = 0; l <= 1000; l++)
						{
							map[k * 10][l] = 1;
							map[l][k * 10] = 1;
						}
					}
					
					if(GenerateDungeon.rooms[i][j] == 1)
					{
						int roomwidth = roomgen.nextInt(12) + 5;
						int roomheight = roomgen.nextInt(12) + 5;
						
						if(i * 9 + roomwidth <= 1000 && j * 9 + roomheight <= 1000)
						{
							for(int k = 0; k <= roomwidth; k++)
							{
								for(int l = 0; l <= roomheight; l++)
								{
									map[i * 9 + k][j * 9 + l] = 2;
								}
							}
						}
						
					}
				}
			}
		}
		
		Main.generating = false;
		
		generateMonsters();
		
		if(map[Main.playerx][Main.playery] != 1)
		{
			Main.generating = true;
			generate();
		}
		
	}
	
	public static void generateMonsters()
	{
		
		Random monsgen = new Random();
		Random monshealth = new Random();
		
		for(int i = 0; i <= 1000; i++)
		{
			for(int j = 0; j <= 1000; j++)
			{
				int spawntrue = monsgen.nextInt(17);
				if(spawntrue == 3 && map[i][j] == 1)
				{
					map[i][j] = 3;
					int health = monshealth.nextInt(5) + 1;
					monsters[i][j] = health;
				}
				spawntrue = monsgen.nextInt(31);
				if(spawntrue == 3 && map[i][j] == 2)
				{
					boolean shouldspawn = true;
					for(int k = -3; k <= 3; k++)
					{
						for(int l = -3; l <= 3; l++)
						{
							if(i + k >= 0 && i + k <= 1000 && j + l >= 0 && j + l <= 1000)
							{
								if(map[i + k][j + l] == 4)
								{
									shouldspawn = false;
								}
							}
						}
					}
					if(shouldspawn)
					{
						map[i][j] = 4;
						int health = monshealth.nextInt(22) + 13;
						monsters[i][j] = health;
					}
				}
				spawntrue = monsgen.nextInt(26);
				if(spawntrue == 3)
				{
					if(map[i][j] == 1 || map[i][j] == 2)
					{
						map[i][j] = 5;
						int health = monshealth.nextInt(13) + 5;
						monsters[i][j] = health;
					}
				}
			}
		}
	}
	
	public static void generateTreasure(int tx, int ty, int monstertype)
	{
		
		Random tgen = new Random();
		
		if(monstertype == 3)
		{
			int tint = tgen.nextInt(3);
			if(tint == 0)
			{
				//gold
				map[tx][ty] = 6;
			}
			if(tint == 1)
			{
				//food
				map[tx][ty] = 10;
			}
			if(tint == 2)
			{
				//stick
				map[tx][ty] = 11;
			}
		}
		if(monstertype == 4)
		{
			int tint = tgen.nextInt(4);
			if(tint == 0)
			{
				//chest
				map[tx][ty] = 8;
			}
			if(tint == 1)
			{
				//chalice
				map[tx][ty] = 7;
			}
			if(tint == 2)
			{
				//stone
				map[tx][ty] = 9;
			}
			if(tint == 3)
			{
				//sheild
				map[tx][ty] = 13;
			}
		}
		if(monstertype == 5)
		{
			int tint = tgen.nextInt(4);
			if(tint == 0)
			{
				//chalice
				map[tx][ty] = 7;
			}
			if(tint == 1)
			{
				//wood
				map[tx][ty] = 12;
			}
			if(tint == 2)
			{
				//gold
				map[tx][ty] = 6;
			}
			if(tint == 3)
			{
				//food
				map[tx][ty] = 10;
			}
		}
	}
	
}
