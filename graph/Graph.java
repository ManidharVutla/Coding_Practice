import java.util.Scanner;


public class Graph extends Node
{

    Node [] adjList()
    {
        HashMap <Integer, Node> hm= new HashMap <Integer, Node>(); 
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Graph Node:");
            int value=sc.nextInt();
            System.out.print(" --> ");
            int cvalue=sc.nextInt();
            if(cvalue==01)
                break;
            Node head=new Node();
            head.val=cvalue;
            Node traverse=head;
            while(true)
            {
                System.out.print(" --> ");
                int cvalue=sc.nextInt();
                if(cvalue==01)
                    break;
                Node gnode=new Node();
                gnode.val=cvalue;
                traverse.next=gnode;
                traverse=gnode;
            }
            System.out.println();
        }

        return arr;
    }

    void adjMatrix()
    {
            /*Empty Function*/
    }
    
    void display_list(Node arr[])
    {
        System.out.println("Node\tValue");
        for(Map.Entry hm_entry : hm.entrySet())
        {
            System.out.print(arr[i].val);
            while(traverse!=null)
            {
                System.out.print("\t"+traverse.val);
                traverse=traverse.next;
            }
            System.out.println();
        }
    }
}