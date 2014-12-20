package designpatterns.exercises.prototype;

public class GUIFactory {
	private Button button;
	private ComboBox combo;

	public GUIFactory(Button button, ComboBox combo)
	{
		this.button = button;
		this.combo = combo;
	}

	public Button createButton()
	{
		return (Button) button.clone();
	}

	public ComboBox createComboBox()
	{
		return (ComboBox) combo.clone();
	}
}