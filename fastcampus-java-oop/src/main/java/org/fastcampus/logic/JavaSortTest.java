package org.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @Test
    void given_List_whenExecuting_thenReturnSortingList() {
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();
        //when
        List<Integer> actual = javaSort.sort(List.of(2,3, 1, 5, 4));
        //then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}