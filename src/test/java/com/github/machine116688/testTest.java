package com.github.machine116688;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testTest {
    @Test

    public void getType() throws Exception {
        // Arrange
        test triangle = new test(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
