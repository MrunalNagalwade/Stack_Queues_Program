package stack;

class Stack {
    private final LinkedListNew linkedListNew;

    public Stack() {
        this.linkedListNew = new LinkedListNew();
    }

    public void push(INode node) {
        linkedListNew.add(node);
    }

    public void printStack() {
        linkedListNew.printNodes();
    }

    public INode peak() {
        return linkedListNew.head;
    }
    public INode pop()
    {
        return linkedListNew.pop();
    }
}
