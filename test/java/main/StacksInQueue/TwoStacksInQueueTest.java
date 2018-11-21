package main.StacksInQueue;

import jdk.nashorn.internal.runtime.NumberToString;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class TwoStacksInQueueTest {

    private TwoStacksInQueue<Integer> twoStacksInQueue = new TwoStacksInQueue<>();

    @Ignore
    @Test
    void insert() {
    }

    @Test
    void remove() {
        for(int i = 1; i < 5; i++)
            twoStacksInQueue.insert(i);

        for(int i = 1; i < 3; i++){
            Assert.assertEquals(new Integer(i), twoStacksInQueue.remove());
        }



    }

    @Test
    void size() {
        for(int i = 1; i < 5; i++)
            twoStacksInQueue.insert(i);

        Assert.assertEquals(4, twoStacksInQueue.size());
    }

    @Test
    void isEmpty() {
        Assert.assertTrue(twoStacksInQueue.isEmpty());
    }

    @Test
    void NOT_isEmpty(){
        for(int i = 1; i < 5; i++)
            twoStacksInQueue.insert(i);

        Assert.assertFalse(twoStacksInQueue.isEmpty());
    }
}