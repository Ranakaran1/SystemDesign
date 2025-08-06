package CharacherFlyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    public static Map<Character,ILetter> characherCacheObject = new HashMap<>();

    public static ILetter getCharacterObject(char t){
        if(characherCacheObject.containsKey(t)){
            return characherCacheObject.get(t);
        }else{
            ILetter letter = new CharacterImpl(t, "serif", 1);
            characherCacheObject.put(t, letter);
            return letter;
        }
    }
    
}
