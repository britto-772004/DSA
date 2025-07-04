
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

int detectloop(struct Node* head){
    struct Node* slow = head;
    struct Node* fast = head;
    while(fast != NULL && fast->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
        if(fast == slow){
            return 1;
        }
    }
    return 0;
}

struct Node* formloop(struct Node* head){
    struct Node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = head->next;
}

struct Node* removeloop(struct Node* head){
    struct Node* slow = head;
    struct Node* fast = head;
    while(slow != fast){
        fast = fast->next;
        slow = slow->next;
    }
    while(fast->next != slow){
        fast = fast->next;
    }
    fast->next = NULL;

    return head;
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

    // form loop 

    head = formloop(head);
    if(detectloop(head)){
        printf("Loop formed\n");
        head = removeloop(head);
    }
    else{
        printf("Loop not formed");
    }

    if(detectloop(head)){
        printf("Loop formed");
    }
    else{
        printf("Loop Not formed\n");
    }


}