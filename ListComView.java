package DataLoader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.ArrayList;
import java.util.Date;

public class ListComView {
	JFrame fenetre;
	public  ArrayList<Communique> listComView(File file, String mois) {		
		fenetre =  new  JFrame("Liste des communiqués de " +mois);
		Fichier fichierMens = new Fichier(mois, file);
		JLabel l=new JLabel("Veuillez sélectionner les communiqués à ajouter à la base de données");
		fenetre.add(l);
		Communique [] listeCommunique = fichierMens.getListeCommunique();
		ArrayList<Communique> addedCom = new ArrayList<Communique>();
		for (int i = 0; i <= listeCommunique.length; i++) {
			Communique com = listeCommunique[i];
			String j = Integer.toString(i);
			//String checkboxi = "checkbox"+i;
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dateStr = dateFormat.format(com.getDate());
			JCheckBox checkboxi =  new JCheckBox(dateStr); 
			fenetre.add(checkboxi);
			checkboxi.addActionListener(new CheckedListener());
			JButton btn = new JButton("Ajouter");
			btn.addActionListener(/*new ActionListener()
			{
			  public void actionPerformed(ActionEvent e)
			  {
			    //afficher le jdialog lorsque le bouton est cliqué
			    JDialog dialog = new JDialog(fenetre, "Les communiqués ont été ajouter à la base de données", true);
			    dialog.setLocationRelativeTo(fenetre);
			    dialog.setVisible(true);
			  }
			}*/ new SubmitListener());
			if (checkboxi.isSelected())
				addedCom.add(com);
		}
		return addedCom;
		
	}
	class CheckedListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	       
	    }
	}
	class SubmitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		    //afficher le jdialog lorsque le bouton est cliqué
		    JDialog dialog = new JDialog(fenetre, "Les communiqués ont été ajouter à la base de données", true);
		    dialog.setLocationRelativeTo(fenetre);
		    dialog.setVisible(true);
		}
	}

		
}

 