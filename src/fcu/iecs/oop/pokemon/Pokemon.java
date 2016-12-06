package fcu.iecs.oop.pokemon;

import java.util.Scanner;

public class Pokemon {
	
	private String name;
	private PokemonType type;
	private int cp;
	Scanner scn = new Scanner(System.in);
	
	Pokemon (String name,PokemonType type,int cp)
	{
		this.name=name;
		this.type=type;
		this.cp=cp;		
	}
	public String getName()
	{
		return name;
	}
	public PokemonType getType()
	{
		return type;
	}
	public int setCp(int num)
	{
		cp=num;
		return cp;
	}
	public int getCp()
	{
		return cp;
	}
}
