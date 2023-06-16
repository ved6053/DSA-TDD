package dsa.narshima.karumanchi.disjointset.adt;

import java.rmi.NoSuchObjectException;

/**
 * Disjoint Sets -a ADT acts as auxiliary data structure for many other algorithms like Kruskal's
 * Algorithms in Graph Implementation of disjoint set uses equivalence class- a relation which is
 * reflexive, symmetric and transitive. Intersection of two equivalence classes is empty(0-fi) hence
 * sometimes called disjoint sets. Application of DisjointSet a. To represent network connectivity
 * b. Image processing c. To find the least common ancestor d. To define equivalence of FSA(Finite
 * State Automata) e. Kruskal's Algorithms and many other graph problems
 */
public interface DisjointSet<E> {
  /**
   * Create a new set containing a single element
   *
   * @param x
   */
  void makeSet(E x);

  /**
   * create a new set containing the elements x and y in their union and delete the set containing
   * the element x and y
   *
   * @param x
   * @param y
   */
  void union(E x, E y) throws NoSuchObjectException;

  /**
   * @param x Element<E>
   * @return name of the set containing element x;
   */
  E find(E x) throws NoSuchObjectException;
}
