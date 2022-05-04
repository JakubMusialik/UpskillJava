package LinkedList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class NodeTest {

    @Test
    void testSettingNodeValue() {
        //given
        Node<Integer> node = new Node<>(1);
        //when
        node.setValue(10);
        //then
        assertEquals(node.getValue(), 10);
    }
}