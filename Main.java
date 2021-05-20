package DataLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class Main {
	public static void main(String[] args) {
		ListFileView lfv = new ListFileView();
		ArrayList <String> comboboxFic = new ArrayList<String>();
		comboboxFic.add("mars2020");
		comboboxFic.add("avril2020");
		comboboxFic.add("mai2020");
		comboboxFic.add("juin2020");
		comboboxFic.add("juillet2020");
		File filejson = lfv.listFileView(comboboxFic);
		JSONObject ficJsonMens = new JSONObject(filejson);
		String mois = (String) ficJsonMens.get("name");
		ListComView lcv = new ListComView();
		ArrayList<Communique> addedCom = lcv.listComView(filejson, mois);
		Dao dao = new Dao();
		for(int i = 0; i<addedCom.size(); i++) {
			dao.loadComToBd(addedCom.get(i));
			
		}
		//String pth = filejson.getAbsolutePath().substring(0, 0);
		//for (int i = pth.length()-1; i<0; i-- )
		
		
	}

}
