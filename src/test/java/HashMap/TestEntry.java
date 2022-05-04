package HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class TestEntry {

    @Test
    void testEqualsMethodInEntryClass() {
        //given
        Entry entry = new Entry<>(1, 2);
        Entry entry1 = new Entry<>(2, 1);
        Entry entry2 = new Entry<>(1, 2);
        //when
        boolean notEquals = entry.equals(entry1);
        boolean equals = entry.equals(entry2);
        //then
        assertTrue(equals);
        assertFalse(notEquals);
    }

    @Test
    void testHashCodeMethodInEntryClass() {
        //given
        Entry entry = new Entry<>(1, 2);
        Entry entry1 = new Entry<>(2, 1);
        Entry entry2 = new Entry<>(1, 3);
        //when
        int hashCode = entry.hashCode();
        int notEqualsHash = entry1.hashCode();
        int equalsHash = entry2.hashCode();
        //then
        assertEquals(hashCode, equalsHash);
        assertNotEquals(hashCode, notEqualsHash);
        assertNotEquals(notEqualsHash, equalsHash);

    }
}