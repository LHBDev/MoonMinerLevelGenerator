package com.lhbdev.xmlgenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;


public class Generator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		File outFile = new File("1.lvl");
		FileWriter fWriter = new FileWriter(outFile);
		PrintWriter pWriter = new PrintWriter(fWriter);
		
		int width = 1000;
		int height = 1000;
		
		
		pWriter.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		pWriter.println("<level width=\"" + width+"\" height=\"" + height +"\">");
		
		for(int i = 0; i < width+1; i+=25)
		{
			pWriter.println("\t<entity x=\""+i+"\" y=\"150\" type = \"topRock\"/>");
		}
		
		for(int i = 125; i >= 0; i-=25)
		{
			for(int j = 0; j<width+1;j+=25)
			{
				pWriter.println("\t<entity x=\"" +j+"\" y=\"" + i +"\" type = \"midRock\"/>");
			}
		}
		pWriter.println("\t<entity x =\"24\" y=\"177\" type = \"player\"/>");
		pWriter.println("</level>");
		
		pWriter.close();
		fWriter.close();
		
	}

}
