package uiBundle;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ListResourceBundle;

import javax.swing.SwingConstants;
 
public class FormBundle_iw_IL extends ListResourceBundle {

	private static final Object[][] content={
		{"align",SwingConstants.RIGHT},
		{"title","���� �����"},
		{"dateMsg","����� ������"},
		{"date","���"},
		{"dateVal",DateFormat.getDateInstance(DateFormat.SHORT)},
		{"time","���"},
		{"timeVal",DateFormat.getTimeInstance(DateFormat.SHORT)},
		{"orderMsg","���� �����"},
		{"item","��� ����"},
		{"units","��' ������"},
		{"unitsVal",NumberFormat.getNumberInstance()},
		{"unitPrice","���� ������"},
		{"unitPriceVal",NumberFormat.getCurrencyInstance()},
		{"total","��\"� ������"},
		{"ok","�����"},
		{"cancel","�����"}
	};
	
	@Override
	protected Object[][] getContents() {
		return content;
	}


}
