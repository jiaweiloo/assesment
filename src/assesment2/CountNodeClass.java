/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment2;

import adt.*;

/**
 *
 * @author B1
 */
public class CountNodeClass<T> {

    private Node firstNode; // reference to first node
    private int numberOfEntries;  	// number of entries in list

    public Node getFirstNode(){
        return firstNode;
    }
    
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);	// create the new node        

        if (isEmpty()) // if empty list
        {
            firstNode = newNode;
        } else {                        // add to end of nonempty list
            Node currentNode = firstNode;					// traverse linked list with p pointing to the current node
            while (currentNode.next != null) {		// while have not reached the last node
                currentNode = currentNode.next;
            }
            currentNode.next = newNode; // make last node reference new node
        }
        numberOfEntries++;
        return true;
    }

    public static int countNodes(Node nextNode) {
        Node currentNode = nextNode;
        if (isEmpty()) // if empty list
        {
            return 0;
        } else {
            //currentNode = firstNode;
            if (currentNode.next != null) {
                return 1 + countNodes(currentNode.next);
            } else {
                return 1;
            }
        }
    }

    public static boolean isEmpty() {
        boolean result;

        result = numberOfEntries == 0;

        return result;
    }

    public static class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    } // end Node

    
    public static void main(String[] args){
        CountNodeClass<Character> CNC = new CountNodeClass<Character>();
        CNC.add('A');
        CNC.add('B');
        CNC.add('C');
        CNC.add('D');
        CNC.add('E');
        countNodes(CNC.firstNode);
    }
}
