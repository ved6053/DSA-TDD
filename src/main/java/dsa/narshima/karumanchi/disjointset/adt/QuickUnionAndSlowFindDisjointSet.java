package dsa.narshima.karumanchi.disjointset.adt;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickUnionAndSlowFindDisjointSet<E> implements DisjointSet<E> {
  private final List<E> setNames;
  private final Map<E, Integer> lookUpTable;
  private int setNamesTop;

  /** TimeComplexity : O(n) */
  public QuickUnionAndSlowFindDisjointSet(E[] setArray) {
    setNames = new ArrayList<>(setArray.length);
    lookUpTable = new HashMap<>();
    setNamesTop = -1;
    for (E e : setArray) {
      makeSet(e);
    }
  }

  @Override
  public void makeSet(E x) {
    setNames.add(x);
    lookUpTable.put(x, ++setNamesTop);
  }

  @Override
  public void union(E x, E y) throws NoSuchObjectException {
    E setNameOfX = find(x);
    int indexOfRootX = getIndex(setNameOfX);
    E setNameOfY = find(y);
    updateSetName(indexOfRootX, setNameOfY);
  }

  @Override
  public E find(E x) throws NoSuchObjectException {
    if (!lookUpTable.containsKey(x)) {
      throw new NoSuchObjectException("Element{" + "data=" + x + "} is not present in DisjointSet");
    }

    int indexOfX = lookUpTable.get(x);
    E y = getSetName(indexOfX);
    return y.equals(x) ? x : find(y);
  }

  private int getIndex(E e) {
    return lookUpTable.get(e);
  }

  private void updateSetName(int index, E e) {
    setNames.set(index, e);
  }

  private E getSetName(int index) {
    return setNames.get(index);
  }
}
