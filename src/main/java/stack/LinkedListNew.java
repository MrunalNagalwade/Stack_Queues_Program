package stack;

public class LinkedListNew {
    public INode head;
    public INode tail;

    public LinkedListNew() {
        this.head = null;
        this.tail = null;
    }
    public void add(INode newNode)
    {
        if (this.tail == null)
        {
            this.tail = newNode;
        }
        if (this.head == null)
        {
            this.head = newNode;
        }
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode node)
    {
        if( this.tail == null)
        {
            this.tail = node;
        }
        if ( this.head == null)
        {
            this.head = node;
        }
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }
    public void insert(INode node, INode newNode)
    {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public INode search(INode searchKey)
    {
        INode tempNode = this.head;
        while (tempNode != null)
        {
            if (tempNode == searchKey)
            {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    public INode insertBetweenNodes(INode head, INode newNode, int position)
    {
        INode previous = head;
        int count = 1;
        while (count < position - 1)
        {
            previous = previous.getNext();
            count++;
        }
        INode current = previous.getNext();
        newNode.setNext(current);
        previous.setNext(newNode);
        return head;
    }
    public void searchDelete(int node) {
        INode tempNode = head;
        while (tempNode.getNext() != null){
            if(tempNode.getNext().getKey().equals(node)){
                INode temp = tempNode.getNext().getNext();
                tempNode.setNext(temp);
            }
            tempNode = tempNode.getNext();
        }
    }
    public void printNodes()
    {
        StringBuffer nodes = new StringBuffer("Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            nodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)){
                nodes.append("->");
            }
            tempNode = tempNode.getNext();
        }
        nodes.append(tempNode.getKey());
        System.out.println(nodes);
    }
    public INode pop()
    {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

}
