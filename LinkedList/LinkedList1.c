#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* insert(struct Node* head,int data){
    struct Node* newnode = (struct Node*) malloc(sizeof(struct Node));
    newnode->data = data;
    newnode->next = NULL;

    if(head == NULL)return newnode;
    struct Node* temp = head;

    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = newnode;
    return head;
}

void display(struct Node* head){
    struct Node* temp = head;
    // temp = head;
    printf("The Elements in the Linkedlist ");
    while(temp->next != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
}

int main(){
    struct Node* head = NULL;
    int data;
    int flag = 1;
    while(flag){
        printf("Enter the number : ");
        scanf("%d",&data);
        head = insert(head,data);
        if(data == -1){
            display(head);
            flag = 0;
        }
    }
    printf("\n");
}