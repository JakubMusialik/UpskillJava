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
        assertNull(list.get(0));
        assertNull(list.get(1));
        assertNull(list.get(2));
    }
        //mozna rozbic na 2 testy
    @Test
    void testIfListContainsElement() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        //when
        boolean contains1 = list.contains(10);
        boolean contains = list.contains(15);
        //then
        assertFalse(contains);
        assertTrue(contains1);
    }

    @Test
    void testIfGetMethodGetsCorrectElement() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        //when
        Integer integer = list.get(0);
        Integer integer1 = list.get(52);
        //then
        assertEquals(integer, 10);
        assertNull(integer1);
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
    void testRemovingHeadNodeFromTheList() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        //when
        //then
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
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
        // mozna rozdzielić na 2 testy
    @Test
    void testGettingIndexOfNodeInList() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //when
        int indexOf = list.indexOf(2);
        int indexOf1 = list.indexOf(4);
        //then
        assertEquals(indexOf, 1);
        assertEquals(indexOf1, -1);
    }
        //przerzucić do Node'a
    @Test
    void testSettingNodeValue() {
        //given
        Node<Integer> node = new Node<>(1);
        //when
        node.setValue(10);
        //then
        assertEquals(node.getValue(), 10);
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
