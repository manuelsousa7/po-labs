public class Document {
  private String _text;
  private DocumentFormat _format;
  ...  
  public void setWritingFormat(DocumentFormat format) {
    _format = format;
  }
  /**
   * Writes this document into the specified format.
   **/
  public void write() {
     if (_format == WORD) {
        // write document into word format     
     } else if (_format == RTF) {
       // write document into RTF format
    } else if ... // code for other formats
  }
}
