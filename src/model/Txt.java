package model;

import java.io.File;

public class Txt {

	private File arquivo;
	
	public Txt() {
	}
	
	public Txt (File arquivo)
	{
		this.arquivo = arquivo;
	}
	
	public File getTxt() {
		return arquivo;
	}

	public void setTxt(File arquivo) {
		this.arquivo = arquivo;
	}
}
