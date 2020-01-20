package _07kyuu._01_descending_order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    @Test
    void sortDesc() {
        assertEquals(0,DescendingOrder.sortDesc(0));
    }

    @Test
    void sortDesc1() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    void sortDesc2() {
        assertEquals(54421,DescendingOrder.sortDesc(21445));
    }

    @Test
    void sortDesc3() {
        assertEquals(654321,DescendingOrder.sortDesc(145263));
    }

    @Test
    void sortDesc4() {
        assertEquals(987654321,DescendingOrder.sortDesc(123456789));
    }
}