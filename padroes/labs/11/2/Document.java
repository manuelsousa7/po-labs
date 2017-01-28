public class Document {
  private DocumentFormat _format;

  public void setWritingFormat(DocumentFormat format) {
    _format = format;
  }
  /**
   * Writes this document into the specified format.
   **/
  public void write() {
    _format.writeToFile(this);
  }
}