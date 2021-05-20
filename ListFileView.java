package DataLoader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ListFileView {//correspond à la liste des fichiers json contenant les com du mois
	JFrame fenetre;
	public File listFileView (ArrayList <String> fichierMens) {
		JComboBox bookListBox = new JComboBox<>();
		bookListBox.addItem("mois");
		for(int i=0; i<fichierMens.size(); i++)
			bookListBox.addItem(fichierMens.get(i));
		bookListBox.addActionListener(new BoxListener());
		int i = bookListBox.getSelectedIndex();
		String path = fichierMens.get(i)+".json";
		File file = new File(path);
		
		return file;
		
	}
	class BoxListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){}
	    
	}
	
	

}
