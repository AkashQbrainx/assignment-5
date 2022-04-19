import java.util.HashMap;
import java.util.Map;

public class MaxAndMin {
    public static void main(String[] args) {

        String str="aabaacb";
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
                map.put(str.charAt(i),1);
        }
        int max= map.entrySet().stream().map(f->f.getValue()).max(Integer::compare).get();
        int min=map.entrySet().stream().map(f->f.getValue()).min(Integer::compare).get();

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==max) System.out.println("Maximum occurence "+e.getKey());
            if(e.getValue()==min) System.out.println("Minimum occurence "+e.getKey());
        }

    }
}
