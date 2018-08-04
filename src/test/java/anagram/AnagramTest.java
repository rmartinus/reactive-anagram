package anagram;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramTest {
    @Test
    public void shouldReturnTheSameGivenOneLetterString() {
        assertThat(Anagram.generatePermutation("a")).containsOnlyOnce("a");
    }

    @Test
    public void shouldReturnAllPossibleCombosGivenTwoLetters() {
        assertThat(Anagram.generatePermutation("ab")).containsOnlyOnce("ba", "ab");
    }

    @Test
    public void shouldReturnAllPossibleCombosGivenThreeLetters() {
        assertThat(Anagram.generatePermutation("abc")).containsOnlyOnce(
                "abc", "cab", "bca",
                "acb", "cba", "bac");
    }

    @Test
    public void shouldReturnAllPossibleCombosGivenFourLetters() {
        assertThat(Anagram.generatePermutation("abcd")).containsOnlyOnce(
                "acbd", "adbc", "bcad", "bdac", "cbad", "cdab", "abdc", "acdb", "bacd", "bdca", "cabd", "cdba",
                "dbac","dcab", "abcd", "adcb", "badc", "bcda", "dcba", "dabc", "cbda", "cadb", "dbca", "dacb"
        );
    }

    @Test
    public void shouldSwapCharacters() {
        assertThat(Anagram.swap("abcd", 0, 2)).isEqualTo("cbad");
    }
}