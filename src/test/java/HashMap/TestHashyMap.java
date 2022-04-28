package HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestHashyMap {
        //dodac test z wrzucaniem 2 el do 1 bucketa
    @Test
    void testAddEntryToMap() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "Test");
        //when
        int size = map.size();
        //then
        assertEquals(size, 1);
        assertNotNull(map.get(1));
    }

    @Test
    void testOverridingExistingRecordInMap() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "Test");
        map.add(1, "Override record");
        //when
        Object o = map.get(1);
        //then
        assertEquals(o, "Override record");
        assertNotNull(map.get(1));
    }

    @Test
    void testGettingObjectFromMap() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "1");
        map.add(2, "2");
        //when
        Object o = map.get(1);
        Object o1 = map.get(2);
        Object o2 = map.get(null);
        //then
        assertEquals(o, "1");
        assertNotNull(o);
        assertEquals(o1, "2");
        assertNotNull(o);
        assertNull(o2);
    }

    @Test
    void testIfSizeReturnsCorrectValue() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "3");
        map.add(2, "3");
        //when
        int size = map.size();
        //then
        assertEquals(size, 2);
    }

    @Test
    void testIfClearMethodResetsSize() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "1");
        map.add(2, "1");
        //when
        map.clear();
        //then
        assertEquals(map.size(), 0);
    }

    @Test
    void testIfClearMethodFillsMapWithNulls() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "1");
        map.add(2, "1");
        //when
        map.clear();
        //then
        assertNull(map.get(1));
        assertNull(map.get(2));
    }

    @Test
    void testIfRemoveMethodRemovesEntry() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "1");
        map.add(2, "2");
        //when
        map.remove(2);
        //then
        assertEquals(map.size(), 1);
        assertNull(map.get(2));
        assertNotNull(map.get(1));
    }

    @Test
    void testIfContainsValueReturnsTrueWhenValueIsNotFoundInMap() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "ABC");
        //when
        boolean abc = map.containsValue("ABC");
        //then
        assertTrue(abc);
    }

    @Test
    void testIfContainsValueReturnsFalseWhenValueIsNotFoundInMap() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "DEF");
        //when
        boolean abc = map.containsValue("ABC");
        //then
        assertFalse(abc);
    }

    @Test
    void testIfContainsKeyReturnsTrueIfKeyExists() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "DEF");
        map.add(2, "DEF");
        map.add(3, "DEF");
        //when
        boolean b = map.containsKey(2);
        boolean c = map.containsKey(3);
        //then
        assertTrue(b);
        assertTrue(c);
    }

    @Test
    void testIfContainsKeyReturnsFalseIfKeyDoesntExist() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "DEF");
        //when
        boolean b = map.containsKey(2);
        //then
        assertFalse(b);
    }

    @Test
    void testGettingAllExistingKeysFromMap() {
        //given
        HashyMap map = new HashyMap<>();
        map.add(1, "DEF");
        map.add(2, "DEF");
        map.add(3, "DEF");
        //when
        Set keys = map.getKeys();
        //then
        assertEquals(keys.size(), 3);
        assertNotNull(keys);
    }

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