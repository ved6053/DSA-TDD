package dsa.leetcode.string;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Equator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {
  private static GroupAnagrams groupAnagrams;

  @BeforeAll
  static void setGroupAnagrams() {
    groupAnagrams = new GroupAnagrams();
  }

  @Test
  /**
   * Input: strs = ["eat","tea","tan","ate","nat","bat"] Output:
   * [["bat"],["nat","tan"],["ate","eat","tea"]]
   */
  void whenTestCase1_thenCall_groupAnagrams() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> expectedResult = new ArrayList<>();
    expectedResult.add(new ArrayList<>(List.of("bat")));
    expectedResult.add(new ArrayList<>(Arrays.asList("nat", "tan")));
    expectedResult.add(new ArrayList<>(Arrays.asList("ate", "eat", "tea")));
    assertTrue(
        CollectionUtils.isEqualCollection(
            expectedResult,
            groupAnagrams.groupAnagrams(strs),
            new Equator<List<String>>() {
              @Override
              public boolean equate(List<String> list1, List<String> list2) {
                return CollectionUtils.isEqualCollection(list1, list2);
              }

              @Override
              public int hash(List<String> lists) {
                return 0;
              }
            }));
  }
}
