
#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};

struct node *front,*rear;
void insertFront();
void display();
void deleteRare();



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

void insertFront(){
        int value;
        struct node *nodeValue;
        printf("\nEnter the Value");
        scanf("%d",&value);
        nodeValue =(struct node *)malloc(sizeof(struct node))
        nodeValue->data=value;
        nodeValue->next=NULL;
        if(front==NULL){
            front=nodeValue;
            rear=nodeValue;
        }
        else{
            nodeValue->next=front;
            front=nodeValue;
        }

//    n1
//    front=n1
//     rear=n1 
//     front==n3=>n2=>n1==rear
//     n4->next:n3=>n3->next:n2=>n2->next:null
//  front=n4 rear=n2  rear=temp temp=n1
//delete from front
//   n4=>n3=>n2=>n1
// front n4   rear=n1
//temp=front
// front=front->next
 // free(temp)
 //insert value from rear
 //rear==null
 //rear->next=newNode
 //rear=newNode

}
void deleteRear(){
    struct node *temp;
    if(front==NULL){
        printf("\nno node to delete");
    }
    else if(front->next!=NULL){
        temp=front;
        while(temp->next!=rear){
            temp=temp->next;
        }
        rear=temp;
        temp=temp->next;
        rear->next=NULL;
        free(temp);
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