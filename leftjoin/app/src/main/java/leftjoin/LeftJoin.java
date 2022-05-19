package leftjoin;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {

    public List<String> leftJoin(HashTable table1, HashTable table2){

        List<String> leftJoinList = new ArrayList<>();
        for(Object key : table1.keys()){
            if(table1.contains(key)){
                leftJoinList.add(" [ " + key +  " , " + table1.get(key)+ " , " + table2.get(key)+ " ]  ");
            } else{
                leftJoinList.add(" [ " + key + " , " + table1.get(key) + " , " + null + " ]  ");
            }
        }
        return leftJoinList;
    }
}
