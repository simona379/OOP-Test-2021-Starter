package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;


public class ScoreDisplay extends PApplet
{
	//declare an ArrayList for holding instances of the Note class
	ArrayList<Note> notes = new ArrayList<Note>();


	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	private float border;
	private float leftBorder;
	private float y;
	private float x;


	//if loadScore() was functional, this should iterate over ArrayList & print the score
    public void printScores()
    {
        for(Note n:notes)
        {
			//toString() implicitly called 
            println(n);
        }
    }




	//write a method called loadScore that populates the ArrayList from the contents of the String score
	public void loadScore()
	{
		String s = score;

		//wanted to iterate backwards but need to add duration = 2 if there was a number after letter
		for( int i = 0; i < s.length(); i++ )
		{
			//using s.charAt
			s.charAt(i);

			//using Character.isDigit
			boolean check = Character.isDigit(i);

			//converting to int
			int num = s.charAt(i) - '0';

			if(check == true)
			{		
				//the note before the number
				char note = s.charAt(i--);
				String type = "Crotchet";
				int duration = 2;
			}
			else
			{
				char note = s.charAt(i);
				String type = "Quaver";
				int duration = 1;
			}

			//need to get these three values into my ArrayList
			//Note n = new Note(row);
			//notes.add(n);

			//Table table = loadTable(score);

			//notes.add(duration);

			//for() loop again ?
		}	
	}




	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		//char c = '7'; // c holds the character 7 (55)
		//int i = c - '0'; // i holds the number 7 (55 - 48) 
		//println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
		leftBorder = width * 0.2f;;
        border = width * 0.2f;
        colorMode(HSB);
	}

	public void draw()
	{
		background(255);
		drawNotes();
		
	}

	void drawNotes()
	{
		//5 verticle lines
		stroke(0);
		
        for(int i = 0 ; i < 5 ; i ++)
        {
			//get y co-ordinates 
			float y = map(i, 1, 5, border, height - border);

			//drawing
			line(border, y, width - border, y);
		}

		//adding text
		fill(0);
		textAlign(LEFT, CENTER);

		for(int i = 0 ; i < score.length() ; i ++)
		{
			//get x co-ordinates 			
			float x = map(i, 0, score.length(), border, width - border);

			text(score.charAt(i), x, border / 2);
		}

	}
}
