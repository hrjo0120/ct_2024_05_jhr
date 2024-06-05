package com.ki.level0.p120802;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("2,3 -> 5")
    void t1() {
        assertThat(new Solution().solution(2, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("100,2 -> 102")
    void t2() {
        assertThat(new Solution().solution(100, 2)).isEqualTo(102);
    }
}
