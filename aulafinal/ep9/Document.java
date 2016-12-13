package ep9;

import ep9.DocumentFormat;

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
        _format.doOperation();
    }
}
