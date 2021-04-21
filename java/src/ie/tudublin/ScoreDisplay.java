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


			//Note n = new Note(row);
			//notes.add(n);


		}

		


		//for loop to iterate through score, and add to notes


		//notes.add(?);
		
	}




	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
