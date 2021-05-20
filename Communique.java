package DataLoader;

import java.util.ArrayList;
import java.util.Date;

public class Communique {
	private Date date;
	private String format;
	private int nombreTest, nombreNouvCas, nombreCasCont, nombreCasCom, nombreGueris, nombreDeces;
	private  ArrayList <Localite> localitesConcernes = new ArrayList <Localite> ();
	

	public Communique(Date date, String format, int nombreTest, int nombreNouvCas, int nombreCasCont,
			int nombreCasCom, int nombreGueris, int nombreDeces, ArrayList<Localite> localitesConcernes) {
		super();
		this.date = date;
		this.format = format;
		this.nombreTest = nombreTest;
		this.nombreNouvCas = nombreNouvCas;
		this.nombreCasCont = nombreCasCont;
		this.nombreCasCom = nombreCasCom;
		this.nombreGueris = nombreGueris;
		this.nombreDeces = nombreDeces;
		this.localitesConcernes = localitesConcernes;
	}
	

	public Communique(Date date, String format, int nombreTest, int nombreNouvCas, int nombreCasCont, int nombreCasCom,
			int nombreGueris, int nombreDeces) {
		super();
		this.date = date;
		this.format = format;
		this.nombreTest = nombreTest;
		this.nombreNouvCas = nombreNouvCas;
		this.nombreCasCont = nombreCasCont;
		this.nombreCasCom = nombreCasCom;
		this.nombreGueris = nombreGueris;
		this.nombreDeces = nombreDeces;
	}


	public int getNombreCasCont() {
		return nombreCasCont;
	}

	public void setNombreCasCont(int nombreCasCont) {
		this.nombreCasCont = nombreCasCont;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getNombreTest() {
		return nombreTest;
	}

	public void setNombreTest(int nombreTest) {
		this.nombreTest = nombreTest;
	}

	public int getNombreNouvCas() {
		return nombreNouvCas;
	}

	public void setNombreNouvCas(int nombreNouvCas) {
		this.nombreNouvCas = nombreNouvCas;
	}

	public int getNombreCasCom() {
		return nombreCasCom;
	}

	public void setNombreCasCom(int nombreCasCom) {
		this.nombreCasCom = nombreCasCom;
	}

	public int getNombreGueris() {
		return nombreGueris;
	}

	public void setNombreGueris(int nombreGueris) {
		this.nombreGueris = nombreGueris;
	}

	public int getNombreDeces() {
		return nombreDeces;
	}

	public void setNombreDeces(int nombreDeces) {
		this.nombreDeces = nombreDeces;
	}

	public ArrayList<Localite> getLocalitesConcernes() {
		return localitesConcernes;
	}

	public void setLocalitesConcernes(ArrayList<Localite> localitesConcernes) {
		this.localitesConcernes = localitesConcernes;
	}
	
	
	
	
}
