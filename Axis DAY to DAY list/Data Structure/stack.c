
#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};

struct node *top;
void insert();
void display();
void deleteNode();



int main() {
int choice=0;
while(choice!=3){
    printf("\n Enter choice|n");
    printf("1 Insert value,2 Display Values,3 exit\n");
    scanf("%d",&choice);
    switch(choice){
        case 1:
        push();
        break;
        case 2:
        display();
        break;
        case 3:
        pop();
        break;
        case 4:
        choice=4;
            break;
        default:
        printf("wrong choice");
    }
}
  
  
    return 0;
}

void push(){
        int value;
        struct node *nodeValue;
        printf("enter the value");
        scanf("%d",&value);
        nodeValue=(struct node*) malloc(sizeof(struct node));
        if(nodeValue!=NULL){
        nodeValue->data=value;
        nodeValue->next=NULL;
        if(top==NULL){
            top=nodeValue;
        }
        else{
            nodeValue->next=top;
            top=nodeValue;
        }
        printf("\n node inserted");
        }
        
        
                
}
void pop(){
    struct node *temp;
    if(top==NULL){
        printf("\nno node to delete");
    }
    else if(top->next!=NULL){
        temp=top;
        top=top->next;
        free(temp);
        printf("\n node is deleted")
    }
    else{
        free(top);
        printf("\nlinked list is deleted");
    }
}

void display(){
    struct node *nextNode;
    nextNode=head;
    
    while(nextNode!=NULL){
        printf("%d\n",nextNode->data);
        nextNode=nextNode->next;
    }
    //nextNOde[data,nextaddres]=>[]
    //nextNode=nextAddress
  
}