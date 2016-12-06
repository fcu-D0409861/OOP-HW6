package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	
	public static Player fight(Player p1,Player p2)
	{
		int p1_win=0,p2_win=0;
		int i=0;
		while(i<3)
		{
			PokemonType p1_type=p1.getPokemons()[i].getType();
			PokemonType p2_type=p2.getPokemons()[i].getType();
			
			int p1_cp=p1.getPokemons()[i].getCp();
			int p2_cp=p2.getPokemons()[i].getCp();
			
			Random random=new Random();
			
			switch(p1_type)
			{
				case FIRE:
					if(p2_type==PokemonType.FIRE)
					{
						if(p1_cp>p2_cp)
							p1_win++;
						else if(p1_cp<p2_cp)
							p2_win++;
						else
						{
							int rand;
							rand=random.nextInt(2);
							if(rand==1)
								p1_win++;
							else
								p2_win++;
						}
					}						
					else if(p2_type==PokemonType.WATER)
						p2_win++;
					else
						p1_win++;
					break;
				case WATER:
					if(p2_type==PokemonType.FIRE)
						p1_win++;
					else if(p2_type==PokemonType.WATER)
					{
						{
							if(p1_cp>p2_cp)
								p1_win++;
							else if(p1_cp<p2_cp)
								p2_win++;
							else
							{
								int rand;
								rand=random.nextInt(2);
								if(rand==1)
									p1_win++;
								else
									p2_win++;
							}
						}
					}			
					else
						p2_win++;
					break;
				case GRASS:
					if(p2_type==PokemonType.FIRE)
						p2_win++;
					else if(p2_type==PokemonType.WATER)
						p1_win++;
					else
					{
						if(p1_cp>p2_cp)
							p1_win++;
						else if(p1_cp<p2_cp)
							p2_win++;
						else
						{
							int rand;
							rand=random.nextInt(2);
							if(rand==1)
								p1_win++;
							else
								p2_win++;
						}
					}		{
						
					}
					break;
			}
			if(p1_win>=2||p2_win>=2)
				break;
		}
		if(p1_win>=2)
		{
			int p1_level;	//Ä¹®alevel+1
			p1_level=p1.getLevel();
			p1_level++;
			p1.setLevel(p1_level);
			
			System.out.println("Winner is "+p1.getPlayerName()+" , and his/her level becomes "+p1.getLevel()+" .");
			return p1;
		}
		else
		{
			int p2_level;	//Ä¹®alevel+1
			p2_level=p2.getLevel();
			p2_level++;
			p2.setLevel(p2_level);
			
			System.out.println("Winner is  "+p2.getPlayerName()+" , and his/her level becomes "+p2.getLevel()+" .");
			return p2;
		}
	}
	
}
