
#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};

struct node *head;
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
        insert();
        break;
        case 2:
        display();
        break;
        case 3:
        deleteNodeAtBeginning();
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

void insert(){
        int value;
        struct node *nodeValue;
        printf("enter the value");
        scanf("%d",&value);
        nodeValue=(struct node*) malloc(sizeof(struct node));
        if(nodeValue!=NULL){
        nodeValue->data=value;
        nodeValue->next=NULL;
        if(head==NULL){
            head=nodeValue;
        }
        else{
            nodeValue->next=head;
            head=nodeValue;
        }
        printf("\n node inserted");
        }
        
        
                
}
void deleteNodeAtBeginning(){
    struct node *temp;
    if(head==NULL){
        printf("\nno node to delete");
    }
    else if(head->next!=NULL){
        temp=head;
        head=head->next;
        free(temp);
        printf("\n node is deleted")
    }
    else{
        free(head);
        printf("\nlinked list is deleted");
    }
}
void deleteNodeAtLast{
    struct node *temp,*beforeLast;
    if(head==NULL){
        printf("\nno node to delete");
    }
    else if(head->next!=NULL){
        temp=head;
        while(temp->next!=NULL){
            if(temp->next!=NULL){
                beforeLast=temp;
            }
            temp=temp->next;
        }
        beforeLast->next=NULL;
        free(temp);
        // head=head->next;
        // free(temp);
        // printf("\n node is deleted")
    }
    else{
        free(head);
        printf("\nlinked list is deleted");
    }
}
void deleteSpecifiedNode(){
    struct node *temp,*ptr;
    int val;
    printf("enter the value of deleting node");
    scanf("%d",$val);
    temp=head;
    while(temp->data!=val){
        if(temp->data!=val){
            ptr=temp;
        }
        temp=temp->next;
        if(temp->next==NULL){
            printf("|n value not found break");
            break;
        }
    }
    if(temp->data==val){
    ptr->next=temp->next;
     free(temp);
     printf("\n value is deleted");
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
  void insertLast(){
        int value;
        struct node *nodeValue,*temp;
        printf("enter the value");
        scanf("%d",&value);
        nodeValue=(struct node*) malloc(sizeof(struct node));
        if(nodeValue!=NULL){
        nodeValue->data=value;
        nodeValue->next=NULL;
        if(head==NULL){
            head=nodeValue;
        }
        else{
            temp=head;
            while(temp->next!=NULL){
                temp=temp->next;
            }
           temp->next=nodeValue;
           nodeValue->next=NULL;
        }
        printf("\n node inserted");
        }
    }
