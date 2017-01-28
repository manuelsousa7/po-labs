public class Test{
	public static void main(String [] args){
		Document doc = new Document();
		doc.setWritingFormat(new Word());
		doc.write();
	}
}