public abstract class TextDecorator implements TextItem {
	protected TextItem _textItem;
	public TextDecorator(TextItem text) {
		_textItem = text;
	}
	public String render() {
		return _textItem.render();
	}

}