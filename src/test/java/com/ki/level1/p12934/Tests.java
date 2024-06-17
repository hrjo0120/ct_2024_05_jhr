package com.ki.level1.p12934;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("121 -> 144")
    void t1() {
        assertThat(new Solution().solution(121)).isEqualTo(144);
    }
    @Test
    @DisplayName("3 -> -1")
    void t2() {
        assertThat(new Solution().solution(3)).isEqualTo(-1);
    }
}
