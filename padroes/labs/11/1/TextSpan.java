public class TextSpan implements TextItem {

  /** The text in this span. */
  private String _text;

  /**
   * @param text the text in this span.
   **/
  public TextSpan(String text) {
    _text = text;
  }

  /**
   * Renders the text of this TextSpan
   * @return the rendered text
   **/
  public String render() {
    return "<span>" + _text + "</span>";
  }
}