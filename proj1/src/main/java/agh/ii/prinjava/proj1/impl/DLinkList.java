package agh.ii.prinjava.proj1.impl;


public class DLinkList<E> {
    /**
     * last and first are the first and the last node of the linked list
     */
    Node<E> first;
    Node<E> last;
    /**
     * add an element at the beginning of the list
     * @param elem is the element to add
     */
    void addFirst(E elem){
        Node<E> node = new Node<E>(elem);
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
        Node<E> temp = this.first;
        if (this.first  != null  ){
            this.first = this.first.next;
        }
        if(temp == null)
            return null;
        return temp.elem;
    }

    /**
     * remove the last element of the list and return its value
     * @return the value of the last element of the list
     */
    E removeLast(){
        Node<E> temp = this.last;
        if (this.last  != null  ){
            this.last = this.last.prev;
        }
        if(temp == null)
            return null;
        return temp.elem;
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
                '}';
    }


    /**
     * return the value of a given node
     * @param node which contain the value we want to return
     * @return the value of the node
     */
    public E peek_node(Node <E> node){
        if (node == null)
            return null;
        return node.elem;

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
