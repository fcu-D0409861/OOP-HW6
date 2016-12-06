package fcu.iecs.oop.pokemon;

public class Player {
	
	private	String playerName;
	private	Pokemon[] pokemons;
	private int level=1;
	
	Player(String name)
	{
		playerName=name;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	public String setPlayerName(String rename)
	{
		playerName=rename;
		return playerName;
	}
	public Pokemon[] getPokemons()
	{
		return pokemons;
	}
	public Pokemon[] setPokemons(Pokemon[] re_pokemons)
	{
		pokemons=re_pokemons;
		return pokemons;
	}
	public int getLevel()
	{
		return level;
	}
	public int setLevel(int re_level)
	{
		level=re_level;
		return level;
	}
}
