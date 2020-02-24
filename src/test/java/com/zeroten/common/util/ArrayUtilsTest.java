package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayUtilsTest {

    @Test
    public void testSort() {
        //对传入的 int 数组进行排序，从小到大，并返回排序后的结果。
        int[] arr1 = new int[]{5,43,23,1,17};
        int[] ans1 = new int[]{1,5,17,23,43};
        Assert.assertEquals(ArrayUtils.sort(arr1),ans1);
    }
}
