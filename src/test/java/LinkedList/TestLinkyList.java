package LinkedList;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestLinkyList {

        //shouldAddNewNodeToTheList
        //test <-- niepotrzebne
    @Test
    void testAddingNewNodeAsHeadToTheList() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        //when
        list.add(1);
        //then
        assertEquals(list.size(), 1);
//        assertNotNull(list);
        assertEquals(list.get(0),1);
    }

    @Test
    void testAddingNewNodeAsTailToTheList() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        //when
        list.add(15);
        //then
        assertEquals(list.size(), 2);
        assertEquals(list.get(1), 15);
    }

    @Test
    void testClearTheListOfNodes() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        list.add(8);
        list.add(9);
        //when
        list.clear();
        //then
        assertEquals(list.size(), 0);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void testIfListContainsElement() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        //when
        boolean contains1 = list.contains(10);
        //then
        assertTrue(contains1);
    }
    @Test
    void shouldReturnFalseIfListDoesntContainElement(){
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        //when
        boolean contains = list.contains(15);
        //then
        assertFalse(contains);
    }

    @Test
    void testIfGetMethodGetsCorrectElement() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        list.add(15);
        //when
        Integer integer = list.get(1);
        //then
        assertEquals(integer, 15);

    }

    @Test
    void shouldGetThrowExceptionWhenIndexOutOfBounds(){
        //given
        LinkyList<Integer> list = new LinkyList<>();
        //when
        //then
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    void testRemovingNodeFromTheList() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        list.add(15);
        list.add(12);
        //when
        list.remove(2);
        list.remove(1);
        //then
        assertEquals(list.size(), 1);
    }

    @Test
    void shouldThrowExceptionWhenNothingToRemove() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        //when
        //then
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void shouldDeleteHeadNodeFromTheList(){
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(1);
        //when
        list.remove(0);
        //then
        assertEquals(list.size(),0);
    }

    @Test
    void testCheckingListSize() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(1);
        list.add(2);
        //when
        int size = list.size();
        //then
        assertEquals(size, 2);
    }

    @Test
    void testGettingIndexOfNodeInList() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(1);
        list.add(2);
        //when
        int indexOf = list.indexOf(2);
        //then
        assertEquals(indexOf, 1);

    }
    @Test
    void shouldGetReturnNegativeOneIfIndexOutOfBounds(){
        //given
        LinkyList<Integer> list = new LinkyList<>();
        //when
        int indexOf = list.indexOf(2);
        //then
        assertEquals(indexOf, -1);
    }

    @Test
    void testIfRemoveMethodThrowsException() {
        //given
        LinkyList emptyList = new LinkyList();
        //when
        //then
        assertThrows(IndexOutOfBoundsException.class, () -> emptyList.remove(1));
    }
}
