import java.util.HashMap;

public class OccurenceChecker { hash
    public static void main(String[] args) 
    { 

        //CANT BE FIXED
        String phrase = "Good Morning. Welcome to my store. My store is a grocery store.";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] ignored = phrase.split("\n\t\r(){},:;!?.[]");

        //CAN BE FIX THIS POINT ON.
        for (String ignore : ignored) 
        {
            Integer count = map.get(ignore);
            if (count == null) 
            {
                count = 0;
            }
            map.put(ignore, count + 1);
        }

        for (int i = 0; i< ignored.length; i++)
        {
            System.out.println(ignored[i]);
        }
        System.out.println(map);
    }
}