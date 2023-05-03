package dsa.narshima.karumanchi.disjointset.adt;



import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickFindDisjointSet<E> implements DisjointSet<E>{
    private final List<E> setNames;
    private final Map<E, Integer> lookUpTable;
    private int setNamesTop;

    /**
     * TimeComplexity : O(n)
     **/
    public QuickFindDisjointSet(E [] setOfDistinctArray) {
        
        setNames = new ArrayList<>(setOfDistinctArray.length);
        lookUpTable = new HashMap<>();
        setNamesTop = -1;
        for(E e :setOfDistinctArray ){
            makeSet(e);
        }
    }

    /**
     * TimeComplexity : O(1)
     **/
    @Override
    public void makeSet(E x) throws ArrayIndexOutOfBoundsException{
        setNames.add(x);
        lookUpTable.put(x, ++setNamesTop);
    }

    /**
     * Time complexity : O(n)
     **/
    @Override
    public void union(E x, E y) throws NoSuchObjectException {
        E setNameOfX = find(x);
        E setNameOfY = find(y);
        for(Integer i = 0; i <= setNamesTop;i++){
            if(getSetName(i).equals(setNameOfY)){
              updateSetName(i, setNameOfX);
            }
        }
    }

    /**
     * Time complexity : O(1)
     **/
    @Override
    public E find(E x) throws NoSuchObjectException {
        if(!lookUpTable.containsKey(x)){
            throw new NoSuchObjectException("Element{" + "data=" + x + "} is not present in DisjointSet");
        }
        int index = getIndex(x);
        return getSetName(index);
    }

    private int getIndex(E e){
        return lookUpTable.get(e);
    }
    private void updateSetName(int index, E e) {
        setNames.set(index, e);
    }
    private E getSetName(int index) {
        return setNames.get(index);
    }
}
