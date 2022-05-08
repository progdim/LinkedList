package com.company;

public class Main {

    public static void main(String[] args) {
	Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(27);
        List list1 = new List(node1);

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);

        list1.push(-4);
        list1.push(1000,4);
        list1.printList();
        System.out.println();




        list1.pop(4);
        list1.printList();
//        System.out.println(node1.getValue());
//        System.out.println(node1.getNextNode().getValue());
////        System.out.println(node1.getNextNode().getNextNode().getValue());
//        Node nodeTnp = node1;
//        while (nodeTnp !=null) {
//            System.out.println(nodeTnp.getValue());
//            nodeTnp = nodeTnp.getNextNode();

        }
    }

