public class ItalicDecorator extends TextDecorator{
	public ItalicDecorator(TextItem text){
		super(text);
	}
	@Override
	public String render(){
		return bold(_textItem);
	}
	public String bold(TextItem t){
		return "<italic>" + t.render() + "</italic>";
	}
}