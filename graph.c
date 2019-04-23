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
   
    int node_num=1, other_nodes=0,count=0,i=0;
    struct Node *temp;
    while(fscanf(fp,"%d", &num)==1)
    {
            ++count;
            ++other_nodes;
            if(count==1)
            {
                struct Node *head= (struct Node*)malloc(sizeof(struct Node));
                head->val=node_num++;
                head->weight=999;
                head->next=NULL;
                nodes[i++]=head;
                temp=head;
                //printf("%d\n", nodes[i-1]->val);
            }
            else if(count<=20)
            {
                
                if(num!=999)
                {
                    
                    struct Node *node= (struct Node*)malloc(sizeof(struct Node));
                    node->val= other_nodes;
                    node->weight=num;
                    node->next=NULL;
                    temp->next=node;
                    temp=node;
                }
                
            }
            else
            {
                count=0;
                other_nodes=1;
            }
        
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

