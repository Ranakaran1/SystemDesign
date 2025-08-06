package CharacherFlyweight;

public class CharachterFlywayMain {

    public static void main(String[] args) {
        
        ILetter tObj = CharacterFactory.getCharacterObject('t');
        tObj.display(4,5 );
        
    }
    

}
