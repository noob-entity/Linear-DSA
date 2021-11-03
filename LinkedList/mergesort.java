public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
    LinkedList ml = new LinkedList();

    Node one = l1.head;
    Node two = l2.head;
    while (one != null && two != null) {
      if (one.data < two.data) {
        ml.addLast(one.data);
        one = one.next;
      } else {
        ml.addLast(two.data);
        two = two.next;
      }
    }

    while (one != null) {
      ml.addLast(one.data);
      one = one.next;
    }

    while (two != null) {
      ml.addLast(two.data);
      two = two.next;
    }

    return ml;
  }

  public static LinkedList mergeSort(Node head, Node tail){
    if(head==tail){
        LinkedList bl=new LinkedList();
        bl.addFirst(head.data);
        return bl;
    }
    Node mid=midNode(head,tail);
    LinkedList ll=mergeSort(head,mid);
    LinkedList rl=mergeSort(mid.next,tail);
    LinkedList ans=mergeTwoSortedLists(ll,rl);
    return ans;
  }