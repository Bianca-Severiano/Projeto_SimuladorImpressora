package controller;

import model.Fila;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}
	
	public void InsereDocumento(Fila<String> f, String Nome) {
		f.insert(Nome);
	}
	
	public void ImprimeDocumento(Fila<String> f) {
		
		try {
			String aux = f.remove();
			String partesNome[] = aux.split(";");
			long tempo = (long)((Math.random()*1001)+1000);
			Thread.sleep(tempo);
			System.out.println("[#PC: "+ partesNome[0] + " - Arquivo: " + partesNome[1] + "]" );
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
