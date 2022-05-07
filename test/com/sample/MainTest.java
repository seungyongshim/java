package com.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{
    @Test
    void addSpec() {
        // arrange
        var sut = new Main();

        // act
        var ret = sut.add().apply(1).apply(2);

        // asserts
        Assertions.assertEquals(3, ret);
    }
}