package process.model;

public class PlayDohSnek
{
	private int length;
	
	public PlayDohSnek()
	{
		this.length = 10;
	}
	
	public PlayDohSnek(int length)
	{
		this.length = length;
	}
	
	public String toString()
	{
		String description = "Here is a snek! it's this long! " + length;
		return description;
	}
}

