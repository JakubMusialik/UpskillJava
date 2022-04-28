package HashSet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestHashySet {

    @Test
    void testAddingNewElementToCollection(){
        //given
        HashySet set = new HashySet();
        //when
        set.add(10);
        //then
        assertEquals(set.size(),1);
    }

    @Test
    void testAddingSameValueToSetShouldntIncrementSize(){
        //given
        HashySet set = new HashySet();
        //when
        set.add(10);
        set.add(10);
        //then
        assertEquals(set.size(),1);
    }

    @Test
    void testIfSizeReturnsCorrectValue(){
        //given
        HashySet set = new HashySet();
        //when
        set.add(10);
        set.add(10);
        set.add(12);
        set.add(14);
        //then
        assertNotEquals(set.size(),4);
        assertEquals(set.size(),3);
    }

    @Test
    void testIfRemoveMethodDecrementsSize(){
        //given
        HashySet set = new HashySet();
        set.add(10);
        //when
        set.remove(10);
        //then
        assertEquals(set.size(),0);
    }

    @Test
    void testIfRemoveMethodThrowsExceptionWhenNoSuchElementInCollection(){
        //given
        HashySet emptySet = new HashySet<>();
        //when
        //then
        assertThrows(NoSuchElementException.class, () -> emptySet.remove(1));
    }

    @Test
    void testIfRemoveMethodRemovesCorrectEntry(){
        //given
        HashySet set = new HashySet();
        set.add(10);
        set.add(12);
        //when
        set.remove(12);
        //then
        assertFalse(set.contains(12));
        assertEquals(set.size(),1);
    }

    @Test
    void testIfContainsReturnsTrueWhenElementExists(){
        //given
        HashySet hashySet = new HashySet<>();
        hashySet.add(10);
        //when
        boolean contains = hashySet.contains(10);
        //then
        assertTrue(contains);
    }

    @Test
    void testIfContainsMethodReturnsFalseWhenElementDoesntExist(){
        //given
        HashySet hashySet = new HashySet<>();
        //when
        boolean contains = hashySet.contains(10);
        //then
        assertFalse(contains);
    }

    @Test
    void testIfClearMethodClearsCollection(){
        //given
        HashySet set = new HashySet<>();
        set.add(10);
        set.add(20);
        //when
        set.clear();
        //then
        assertEquals(set.size(),0);
    }

    @Test
    void testHashMethodInEntryClass(){
        //given
        Entry entry = new Entry<>(1);
        Entry entry2 = new Entry<>(2);
        Entry entry3 = new Entry<>(1);
        //when
        int hashCode= entry.hashCode();
        int notEqualsHash = entry2.hashCode();
        int equalsHash = entry3.hashCode();
        //then
        assertEquals(hashCode,equalsHash);
        assertNotEquals(hashCode,notEqualsHash);
        assertNotEquals(notEqualsHash,equalsHash);
    }

    @Test
    void testEqualsMethodInEntryClass(){
        //given
       Entry entry = new Entry<>(1);
       Entry notEqualsEntry = new Entry<>(2);
       Entry equalsEntry = new Entry<>(1);
        //when
        boolean notEquals = entry.equals(notEqualsEntry);
        boolean equals = entry.equals(equalsEntry);
        //then
        assertTrue(equals);
        assertFalse(notEquals);
    }
}
