public class BoldDecorator extends TextDecorator{
	public BoldDecorator(TextItem text){
		super(text);
	}
	@Override
	public String render(){
		return bold(_textItem);
	}
	public String bold(TextItem t){
		return "<b>" + t.render() + "</b>";
	}
}