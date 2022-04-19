import java.util.HashMap;
import java.util.Map;

public class MaximumLenInString {
    public static void main(String[] args) {
        String str="We live happily";
        String[] arr=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],arr[i].length());
        }
        int max= map.entrySet().stream().map(f->f.getValue()).max(Integer::compare).get();
        int min=map.entrySet().stream().map(f->f.getValue()).min(Integer::compare).get();

        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==max) System.out.println("Largest length "+e.getKey());
            if(e.getValue()==min) System.out.println("Smallest length "+e.getKey());
        }

    }
    }

