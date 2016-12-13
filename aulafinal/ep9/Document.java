package ep9;

import ep9.*;

public class Document {

  private String _text;
  private DocumentFormat _format;

  public void setWritingFormat(DocumentFormat format) {
    _format = format;
  }

  /**
   * Writes this document into the specified format.
   **/
  public void write() {
    _format.writeDocument();
  }

  public static void main(String[] args) {
    Document doc = new Document();
    DocumentFormat word = new FormatWord();
    doc.setWritingFormat(word);
    doc.write();
    DocumentFormat rtf = new FormatRTF();
    doc.setWritingFormat(rtf);
    doc.write();
  }
}
