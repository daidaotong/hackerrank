/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
   Node p = head;
   ArrayList list = new ArrayList();
   while (p!=null){
       list.add(p.data);
       p = p.next;
   }
    Collections.reverse(list);
    for(int i=0; i<list.size();i++)
        System.out.println(list.get(i));
}
