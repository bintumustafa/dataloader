package DataLoader;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//on a telechargé le jar qui contient les classes json
//import java.awt.EventQueue;
//import java.sql;


public class Fichier {//correspond aux fichiers de stockage des communiqués du mois
	private String nom; //année_mois
	private Communique [] listeCommunique = new Communique [31]; 
	private Date dateExtraction;
	private File fichierMens;
	
	public Fichier(String nom, Communique[] listeCommunique, Date dateExtraction) {
		super();
		this.nom = nom;
		this.listeCommunique = listeCommunique;
		this.dateExtraction = dateExtraction;
	}

	public Fichier(String nom, Date dateExtraction, File fichierMens) {
		super();
		this.nom = nom;
		this.dateExtraction = dateExtraction;
		this.fichierMens = fichierMens;
	}

	public Fichier(String nom, File fichierMens) {
		super();
		this.nom = nom;
		this.fichierMens = fichierMens;
	}

	public File getFichierMens() {
		return fichierMens;
	}

	public void setFichierMens(File fichierMens) {
		this.fichierMens = fichierMens;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Communique[] getListeCommunique() {
		return recupererFichierMensuel(this.fichierMens);
	}

	public void setListeCommunique(Communique[] listeCommunique) {
		this.listeCommunique = listeCommunique;
	}

	public Date getDateExtraction() {
		return dateExtraction;
	}

	public void setDateExtraction(Date dateExtraction) {
		this.dateExtraction = dateExtraction;
	}
	
	
	public Communique [] recupererFichierMensuel(File fichierMens)	{//le lien du fichier mensuel est fourni en parametre
		JSONObject ficJsonMens = new JSONObject(fichierMens); //on cree un jsonObjet à partir du fichier mensuel
	    JSONArray communiqueArray = ficJsonMens.optJSONArray("communiques"); //un arraylist pour stocker l'ensemble des communiqués du mois
	    int j = communiqueArray.length();
	    Communique [] lesComMens = new Communique[j];
	    for (int i = 0; i < j; i++) {
	    	JSONObject communiqueObject = communiqueArray.getJSONObject(i);
	    	//JSONObject communiqueObject = communiqueObjt.parse(new FileReader(fichierMens));
	    	Date date = null;
	    	try {//on recupère la date qui est en format txte au niveau du fichier et on le convertit en date
				date = new SimpleDateFormat("dd/MM/yyyy").parse(communiqueObject.getString("date"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String format = communiqueObject.getString("format"); //image ou pdf
	    	int nombreTest = communiqueObject.getInt("NbTest");
	    	int nombreNouvCas = communiqueObject.getInt("NbNouveauxCas");
	    	int nombreCasCont = communiqueObject.getInt("NbCasContacts");
	    	int nombreCasCom = communiqueObject.getInt("NbCasCommunautaires");
	    	int nombreGueris = communiqueObject.getInt("NbGueris");
	    	int nombreDeces = communiqueObject.getInt("NbDeces");
			Communique com = new Communique(date,format,nombreTest,nombreNouvCas,nombreCasCont,nombreCasCom,nombreGueris,nombreDeces );
	    	lesComMens[i]= com;	    	
	    }
	    return lesComMens;
	}
	
	
}


