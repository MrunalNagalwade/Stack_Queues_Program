package stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        Stack stack = new Stack();
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        INode peak = stack.peak();
        stack.printStack();
        Assertions.assertEquals(thirdNode, peak);
    }
    @Test
    public void given3Numbers_WhenPop_ShouldHaveLastAddedNode() {
        Stack stack = new Stack();
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        INode pop = stack.pop();
        stack.printStack();
        Assertions.assertEquals(thirdNode, pop);
    }

}