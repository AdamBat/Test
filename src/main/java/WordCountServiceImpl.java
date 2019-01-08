import java.util.HashMap;
import java.util.Map;

public class WordCountServiceImpl implements  WordCountService {
    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> result = new HashMap<>();
        String [] words = text.split("\\W+");
        for (String str: words){
            if(!result.keySet().contains(str)){
                result.put(str,1);
            }
            else{
                result.put(str,result.get(str)+1);
            }
        }
        return result;
    }
}
