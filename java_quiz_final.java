import java.util.*;

public class MyClass {
    
    linkedList list;
    
    public MyClass(linkedList list)
    {
         this.list = list;
    }
    
    
    public static void main(String args[]) {
       
        
       linkedList list = new linkedList(); 
       
       
       //Append elements into linkedlist
       list.insertAtStart(1);
       list.insertAtStart(2);
       list.insertAtStart(3);
        list.insertAtStart(4);
         list.insertAtStart(5);
       
       //Remove the tail element in the linkedlist
       //list.deleteAtPos(list.getSize());
       
        System.out.println("Size = "+ list.getSize() +" \n");
        
        //list.deleteLast();
        
       list.display();
        
        
        
        int pos = list.search(4);
        
        System.out.println("\nAfter deleting.....\n");
        
       list.display();
       
    }
    

}




class linkedList
{
    protected Node start;
    protected Node end ;
    public int size ;
 
    /*  Constructor  */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    
    /*  Function to insert an element at begining  */
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            nptr.setLink(start);
            start = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink() ;
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++ ;
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            start = start.getLink();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }    
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
    
    
    
    public void removeAllBasedOnInputValue(int val){
    if (isEmpty())
    {
       System.out.println("empty");
        
    }else{

           if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
       
        System.out.println(start.data);
        Node ptr = start.getLink();
        
        while(ptr.getLink() != null)
        {
             System.out.println(ptr.data);
             
            if(ptr.data > 7)
            {
                System.out.println("xxx");
            }
             
            ptr = ptr.getLink();
        }
        
        System.out.println(ptr.data);
        
    }
    }
    
    
    
    public void deleteLast()
    {
                if ( start == null )
        { throw new NoSuchElementException();}
        
         if(start.link == null)  
         { 
            
             int dataToReturn = start.data;
        
           
             start = null;
        
            }
        
            Node position = start;
            Node temp = start;   
            int dataAtEnd =0;
        
            while (position.link != null)
            {   dataAtEnd = position.data;    
                temp =position;              
               position = position.link;     
              }
        
           position = null;
           temp.link = null;
        
         
    }
    
    
    public int search(int x)
    {
        
        ArrayList<Integer> posArray = new ArrayList();
        
        boolean res =false;
        
        int pos =1;
        
       //System.out.print("\nSingly Linked List = \n");
        
        
        /*if (size == 0) 
        {
            System.out.print("empty\n");
            res = false;
        }*/
        
        
        
        
        if (start.getLink() == null) 
        {
            System.out.println(start.getData());
            res =  false;
        }
        Node ptr = start;
        
       
        
       // System.out.print(start.getData()+ "~1->");
        
        /*if(String.valueOf(start.getData()).equals(String.valueOf(x)))
        {*/
            pos = 1;
            //System.out.println("Position "+pos);
            
            
            if(Integer.parseInt(String.valueOf(start.getData())) > Integer.parseInt(String.valueOf(x)))
            {
                //System.out.println("Got a greater value: "+Integer.parseInt(String.valueOf(start.getData()))+" at pos "+pos);
            
               posArray.add(pos);
                
                //deleteAtPos(pos);
            }
            
           
            res = true;
           
       // }
        
        
        
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
           // System.out.print(ptr.getData()+ "->");
            
            pos++;
            
            /*if(String.valueOf(ptr.getData()).equals(String.valueOf(x)))
            {*/
                // System.out.println("Position: "+pos);
                 res = true;
                 
                 //System.out.println(Integer.parseInt(String.valueOf(ptr.getData())));
                 
                 if(Integer.parseInt(String.valueOf(ptr.getData())) > Integer.parseInt(String.valueOf(x)))
                 {
                    //System.out.println("Got a greater value loop: "+Integer.parseInt(String.valueOf(ptr.getData()))+" at pos "+pos);
                    //deleteAtPos(pos);
                     posArray.add(pos);
                 }
                
           // }
            
            
            
            ptr = ptr.getLink();
            
            
        }
        //System.out.print(ptr.getData()+ "\n");
        
        /*if(String.valueOf(ptr.getData()).equals(String.valueOf(x)))
        {*/
                pos++;
            
                 //System.out.println("Position: "+pos);
                 res = true;
                 
                 if(Integer.parseInt(String.valueOf(ptr.getData())) > Integer.parseInt(String.valueOf(x)))
                 {
                    //System.out.println("Got a greater value thired: "+Integer.parseInt(String.valueOf(ptr.getData())));
                    
                    //deleteAtPos(pos);
                     posArray.add(pos);
                 }
        //}
        
        
        for(int i=0; i<posArray.size(); i++)
        {
           // System.out.println("Position to del "+posArray.get(i));
           
           
           int pos1 = posArray.get(i);
           
           
           if (pos1 == 1) 
        {
            start = start.getLink();
            size--; 
           
        }
        if (pos1 == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
           
        }
        Node ptr1 = start;
        pos1 = pos1 - 1 ;
        for (int j = 1; j < size - 1; j++) 
        {
            if (j == pos1) 
            {
                Node tmp = ptr1.getLink();
                tmp = tmp.getLink();
                ptr1.setLink(tmp);
                break;
            }
            ptr1 = ptr1.getLink();
        }
        size-- ;
           
        
           
            search(x);
        }
        
        
        return pos;
    }
}








class Node
{
    protected  int data;
    protected  Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
