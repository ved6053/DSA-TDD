package dsa.narshima.karumanchi.disjointset.adt;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuickUnionAndFastFindRankedBySizeDisjointSet<E> implements DisjointSet<E> {
  private final List<E> setNames;
  private final List<Integer> setRank;
  private final Map<E, Integer> lookUpTable;
  private int setNamesTop;

  /** TimeComplexity : O(n) */
  public QuickUnionAndFastFindRankedBySizeDisjointSet(E[] setOfDistinctArray) {

    setNames = new ArrayList<>(setOfDistinctArray.length);
    setRank = new ArrayList<>(setOfDistinctArray.length);
    lookUpTable = new HashMap<>();
    setNamesTop = -1;
    for (E e : setOfDistinctArray) {
      makeSet(e);
    }
  }

  @Override
  public void makeSet(E x) {
    setRank.add(-1);
    setNames.add(x);
    lookUpTable.put(x, ++setNamesTop);
  }

  @Override
  public void union(E x, E y) throws NoSuchObjectException {
    E setNameOfX = find(x);
    int indexOfRootX = getIndex(setNameOfX);
    E setNameOfY = find(y);
    int indexOfRootY = getIndex(setNameOfY);

    if (setRank.get(indexOfRootX) < setRank.get(indexOfRootY)) {
      makeParentOf(indexOfRootY, setNameOfX);
      setRankOf(indexOfRootX, setRank.get(indexOfRootX) + setRank.get(indexOfRootY));
    } else {
      makeParentOf(indexOfRootX, setNameOfY);
      setRankOf(indexOfRootY, setRank.get(indexOfRootX) + setRank.get(indexOfRootY));
    }
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

  private void makeParentOf(int x, E y) {
    setNames.set(x, y);
  }

  private void setRankOf(int x, int rank) {
    setRank.set(x, rank);
  }

  private E getSetName(int index) {
    return setNames.get(index);
  }
}
