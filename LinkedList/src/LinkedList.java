public class LinkedList {
//================================================================================================
    private Node head;
//================================================================================================
    public Node getHead(){
        return head;
    }
//================================================================================================
    public LinkedList(){
        this.head=null;
    }
//================================================================================================
    public boolean insert(int data)
    {
        Node newNode=new Node(data);
        
        if(newNode == null){
            return false;
        }//Checking whether the LL is full or not

        if(head == null){
            head=newNode;
            return true;
        }

        Node last=head;
        while(last.getNext()!=null){
            last=last.getNext();
        }

        last.setNext(newNode);
        return true;
    }

//================================================================================================
        public void display(){
            Node temp=head;

            while(temp != null){
                System.out.print(temp.getData() + " ");
                temp=temp.getNext();
            }
                System.out.println(" ");
        }
//================================================================================================
        public boolean insertSpecific(int data,int position){
            if(position<=0){
                return false;
            }

            Node newNode=new Node(data);
            if(newNode==null){
                return false;
            }

            if(position==1){
                newNode.setNext(head);
                head=newNode;
                return true;
            }

            Node prev=head;
            for(int i=1;i<position-1;i++){
                prev=prev.getNext();
                if(prev==null){
                    return false;
                }
            }

            newNode.setNext(prev.getNext());
            prev.setNext(newNode);

        
           return true; 
        }
//===============================================================================================

            public boolean display(Node firstNode){
                if(firstNode==null){
                    System.out.println(" ");
                    return true;
                }

                System.out.println(firstNode.getData()+" ");
                display(firstNode.getNext());
                return true;
            }
//===============================================================================================            


}