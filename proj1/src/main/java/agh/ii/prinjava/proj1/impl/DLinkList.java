package agh.ii.prinjava.proj1.impl;


public class DLinkList<E> {
    /**
     * last and first are the first and the last node of the linked list
     */
    Node<E> first;
    Node<E> last;
    int length = 0;
    /**
     * add an element at the beginning of the list
     * @param elem is the element to add
     */
    void addFirst(E elem){
        Node<E> node = new Node<E>(elem);
        length ++;
        if (this.first != null) {
            node.next = first;
        }else{
            this.last = node;
        }

        this.first = node;
    }

    /**
     * add an element at the end of the list
     * @param elem is the element to add
     */
    void addLast(E elem){
        length ++;
        Node<E> node = new Node<E>(elem);
        if (this.last != null){
            this.last.next = node;
            node.prev = this.last;
        }else{
            this.first = node;
        }

        this.last = node;
    }


    /**
     * remove the first element of the list and return its value
     * @return the value of the first element of the list
     */
    E removeFirst(){
        length --;
        if(this.first == null)
            return null;
        E temp = this.first.elem;
        this.first = this.first.next;
        return temp;
    }

    /**
     * remove the last element of the list and return its value
     * @return the value of the last element of the list
     */
    E removeLast(){
        length --;
        if(last == null)
            return null;
        E temp = this.last.elem;
        this.last = this.last.prev;
        return temp;
    }

    /**
     * put the first and last element of the list in a string form
     * @return a string containing the reference of the last and first element of the list
     */
    @Override
    public String toString() {
        return "DLinkList{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }

    /**
     * return the value of a given node
     * @param node which contain the value we want to return
     * @return the value of the node
     */
    E peek_node(Node <E> node){
        if (node == null)
            return null;
        return node.elem;

    }

    /**
     * return the number of node in the list
     * @return the number of element
     */
    int numElem(){
        return length;
    }

    /**
     * nested class simulating the node f the linked list
     * @param <T> the type of the node
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T t){
            this.elem = t;
        }


    }



}
