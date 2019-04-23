#include<stdlib.h>
#include <stdio.h>


struct Node{
   int val;
   int weight;
   struct Node *next;
};



int main()
{
    struct Node nodes[20];
    FILE *fp;
    int num;
    fp = fopen("nodes.txt", "r");

    if (fp == NULL)
    {
        perror("Error while opening the file.\n");
        exit(EXIT_FAILURE);
    }
    printf("The contents of file are:\n");
    
    while(fscanf(fp,"%d", &num)==1)
    {
        
       printf("%d\n", num);
        
    }

    return 1;
 
}

