package org.zlibrary.model;

public interface ZLTextModel {
    public enum Kind {
        PLAIN_TEXT_MODEL,
    };
    
    // to be removed: in Java we can use 'instanceof' operator instead of this method
    // -- NP
    Kind getKind();
    int getParagraphsNumber();
    ZLTextParagraph getParagraph(int index);

    void addParagraphInternal(ZLTextParagraph paragraph);

    void addControl(byte textKind, boolean isStart);
    void addText(String text);
    void addText(StringBuffer text);

    String dump();    
}
