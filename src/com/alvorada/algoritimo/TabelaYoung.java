package com.alvorada.algoritimo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TabelaYoung {
	static FileReader fr;

	@SuppressWarnings({ "resource", "unused" })
	public static void criandoArquivo() throws IOException {

		FileReader fr = new FileReader("ArquivoCriado.txt");
		BufferedReader br = new BufferedReader(fr);// tendo posse do conteúdo
		String s;

		while ((s = br.readLine()) != null) {// s = br.readLine()-> pegando
												// todas as linha com o while
			System.out.println(s);
		}
	}

	public static void main(String[] args) throws IOException {
		criandoArquivo();
	}
}
