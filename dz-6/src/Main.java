import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String [] rows = new String[] {"мама","тато","баба","їж їжак желе","коко"};
        //masuv(rows);
        ArrayList<Character> result = masuv(rows);
        System.out.println(result);


    }
    public static ArrayList<Character> masuv(String[] rows){
        int countString=0;
        LinkedList<String> slova = new LinkedList<>();
        ArrayList<Character> unique_litery = new ArrayList<>();
    // перебераємо слова в масиві
        for(int i=0;i<rows.length;i++){
        // rows[i].toCharArray();
        Map<Character, Integer> uniquechar = new HashMap<>();

        char[] masuvchar = rows[i].toCharArray();
        // перебераємо кожну букву в слові
        for (Character bykva : masuvchar) {
            if(uniquechar.containsKey(bykva)){
            int countbykva = uniquechar.get(bykva);
            countbykva++;
            uniquechar.put(bykva,countbykva);
            }
            else {
                uniquechar.put(bykva,1);
            }
        }
        boolean countelement = true;
        // перевіряємо чи кожна літера трапляється парну кількість разів (спочатку вважаємо, що так)
        for (Character key : uniquechar.keySet()) {
            if (uniquechar.get(key) % 2 != 0){
                countelement = false;
                break;
               }
            }
        if(countelement == true) {
            countString++;
            slova.add(rows[i]);
            // unique_litery.add(slova(b));
            System.out.println(String.format("%s. %s кожна буква повторюється парну кількість разів ", countString, rows[i]));
        }
        if(countString == 2){
           break;
        }

    }
        // перебераємо 2 слова в масиві
        //for(int i=0;i<slova.length;i++){
            //slova[i].toCharArray();
        for(String slovo : slova){

            char[] masuvslovo = slovo.toCharArray();
            // перебераємо кожну букву в слові
            for (Character litera : masuvslovo) {
                if(!unique_litery.contains(litera)){
                    unique_litery.add(litera);
                }
            }
    };

return unique_litery;
    }
}