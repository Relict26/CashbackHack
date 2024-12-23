package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));
        Assert.assertEquals(0, service.remain(1000));
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void testRemainWithBoundary() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(900, service.remain(1100));
    }
}
