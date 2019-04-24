#include<stdlib.h>
#include <stdio.h>


struct Node{
   int val;
   int weight;
   struct Node *next;
};



int main()
{
    struct Node* nodes[20];
    FILE *fp;
    int num;
    fp = fopen("nodes.txt", "r");

    if (fp == NULL)
    {
        perror("Error while opening the file.\n");
        exit(EXIT_FAILURE);
    }
   
    int node_num=1, other_nodes=0,count=1,i=0;
    struct Node *temp;
    while(fscanf(fp,"%d", &num)==1)
    {
    
                if(count==1)
                {   
                    struct Node *head= (struct Node*)malloc(sizeof(struct Node));
                    head->val=node_num++;
                    head->weight=999;
                    head->next=NULL;
                    nodes[i++]=head;
                    temp=head;
                }

                if(num!=999)
                {
                    
                    struct Node *node= (struct Node*)malloc(sizeof(struct Node));
                    node->val= count;
                    node->weight=num;
                    node->next=NULL;
                    temp->next=node;
                    temp=node;
                }
                count++;
                if(count>20)
                    count=1;
            
        
    }
    printf("N\tV\tW\n");
    for(int i=0;i<=20;i++)
    {
        temp=nodes[i];
        int x=temp->val;
        while(temp!=NULL)
        {
            if(temp->val==x)
            {
                temp=temp->next;
                continue;
            }
            printf("%d\t%d\t%d\n",x,temp->val, temp->weight);
            temp=temp->next;
        }
        printf("-----------------------------------\n");
    }
    
    


    return 1;
 
}