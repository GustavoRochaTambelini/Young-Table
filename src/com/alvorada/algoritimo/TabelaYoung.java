package com.alvorada.algoritimo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TabelaYoung {
	static FileReader fr;
	static ArrayList<Integer>array =new ArrayList<Integer>();
	static String[] p;
	static int aux;
	
	
	@SuppressWarnings({ "resource", "unused" })
	public static void criandoArquivo() throws IOException {

		FileReader fr = new FileReader("ArquivoCriado.txt");
		BufferedReader br = new BufferedReader(fr);// tendo posse do conteúdo
		String s;

		s = br.readLine();
		p = s.split(";");
		int arry [][]=new int[Integer.parseInt(p[0])][Integer.parseInt(p[1])];
		// s = br.readLine()-> pegando
			
			
		
		for(int i =0;i<arry.length;i++){
			if((s = br.readLine()) !=null){
			p = s.split(";");
			for(int y =0;y<p.length;y++){
				
				arry[i][y]=Integer.parseInt(p[y]);
			}System.out.println(arry[i][0]+";"+arry[i][1]+";"+arry[i][2]);
		}
		}
			
		}
		
	
	
	
	

	

		
	
		
	public static void main(String[] args) throws IOException {
		criandoArquivo();
		
	}
}
