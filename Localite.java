package DataLoader;

public class Localite {
	private String nomLoc;
	private String niveauAdm;
	private int nombreTest, nombreNouvCas, nombreCasCont, nombreCasCom, nombreGueris, nombreDeces;
	
	public Localite(String nomLoc, String niveauAdm, int nombreTest, int nombreNouvCas, int nombreCasCont,
			int nombreCasCom, int nombreGueris, int nombreDeces) {
		super();
		this.nomLoc = nomLoc;
		this.niveauAdm = niveauAdm;
		this.nombreTest = nombreTest;
		this.nombreNouvCas = nombreNouvCas;
		this.nombreCasCont = nombreCasCont;
		this.nombreCasCom = nombreCasCom;
		this.nombreGueris = nombreGueris;
		this.nombreDeces = nombreDeces;
	}

	public String getNomLoc() {
		return nomLoc;
	}

	public void setNomLoc(String nomLoc) {
		this.nomLoc = nomLoc;
	}

	public String getNiveauAdm() {
		return niveauAdm;
	}

	public void setNiveauAdm(String niveauAdm) {
		this.niveauAdm = niveauAdm;
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

	public int getNombreCasCont() {
		return nombreCasCont;
	}

	public void setNombreCasCont(int nombreCasCont) {
		this.nombreCasCont = nombreCasCont;
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
	
	
	

}
