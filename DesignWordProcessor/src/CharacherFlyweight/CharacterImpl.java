package CharacherFlyweight;

public class CharacterImpl implements ILetter {

    char charVal;
    String fontType;
    int size;

    public CharacterImpl(char charVal, String fontType, int size) {
        this.charVal = charVal;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int x, int y) {
        System.out.println(charVal + "Displayed at "+ x + " y: "+y);
    }

    public char getCharVal() {
        return charVal;
    }

    public void setCharVal(char charVal) {
        this.charVal = charVal;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    

    
    
}
