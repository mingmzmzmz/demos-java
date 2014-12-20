package jsf.examples.src.com.arcmind.jsfquickstart;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

public class CDManagerBean {
	private String title;
	private Float price;
	private String artist;
	private boolean editMode = false;
	private int rowIndex = -1;

	private List<CD> cds = new ArrayList<CD>();
	private DataModel cdModel = new ListDataModel();

	{
		cdModel.setWrappedData(cds);
	}


	/**
	 * @return Returns the artist.
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist The artist to set.
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return Returns the cds.
	 */
	public DataModel getCds() {
		return cdModel;
	}
	/**
	 * @param cds The cds to set.
	 */
	public void setCds(List cds) {
		this.cds = cds;
	}
	/**
	 * @return Returns the price.
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * @param price The price to set.
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * @return Returns the title.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title The title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String addCD(){
		cds.add(new CD(title, artist, price));
		return "success";
	}

	public String editCD(){
		CD cd = (CD) cdModel.getRowData();
		this.title = cd.getTitle();
		this.artist = cd.getArtist();
		this.price = cd.getPrice();
		this.editMode=true;
		this.rowIndex = cdModel.getRowIndex();
		return "success";
	}

	public String updateCD(){
        CD cd = (CD)cds.get(rowIndex);
        cd.setArtist(this.artist);
        cd.setPrice(this.price);
        cd.setTitle(this.title);
		this.editMode=false;
		this.rowIndex = -1;
        return "success";
	}


	{//instance initializer to generate some sample data
			cds.add(new CD("Scarecrow", "Garth Brooks", 15.89f));
			cds.add(new CD("Downward Spiral", "NIN", 19.89f));
			cds.add(new CD("Meat is Murder", "Smiths", 12.89f));
			cds.add(new CD("Great Big Sea", "Great Big Sea", 8.39f));

	}

	/**
	 * @return Returns the editMode.
	 */
	public boolean isEditMode() {
		return editMode;
	}
	/**
	 * @param editMode The editMode to set.
	 */
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	/**
	 * @return Returns the rowIndex.
	 */
	public int getRowIndex() {
		return rowIndex;
	}
	/**
	 * @param rowIndex The rowIndex to set.
	 */
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
}
