import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main{
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 42, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7));
        Set<Integer> numsSet = new HashSet<>();
        for (Integer integer : nums){
            numsSet.add(integer);
        }
        for (Integer integer : numsSet) {
            if(integer % 2 != 0){
                System.out.print(integer + " ");
            }
        };

        System.out.println();

        for (Integer integer : numsSet){
            if(integer % 2 == 0){
                System.out.print(integer + " ");
            }
        }

        System.out.println();

        List<String> stringsList = new ArrayList<>(Arrays.asList(
        "В", "мире", "горы", "есть", "и", "долины", "есть", "\n",
        "В", "мире", "хоры", "есть", "и", "низины", "есть", "\n",
        "В", "мире", "море", "есть", "и", "лавины", "есть", "\n",
        "В", "мире", "боги", "есть", "и", "богини", "есть"));
        Set<String> stringsSet = new HashSet<>();
        for (String string : stringsList) {
            stringsSet.add(string);
        }
        System.out.println(stringsSet);

        int num = 0;
        String ch = "";

        HashMap<String, Integer> stringsMap = new HashMap<>();

        for (String string : stringsList) {
            if(!stringsMap.containsKey(string)){
                stringsMap.put(string, 1);
            }
            else 
                stringsMap.put(string, stringsMap.get(string) + 1);
        }
        for (String string : stringsMap.keySet()) {
            if(stringsMap.get(string) > 1){
                System.out.println(stringsMap.get(string));
            }
        }
    }
}