#include <iostream>
using namespace std;

struct node
{
  int value;
  node *next;  
};

typedef node *ptr;

ptr new_node(){
    ptr p =(ptr)malloc(sizeof(node));
    return p; 
}

void insert(ptr &li,int n){
    ptr p =new_node();
    p->value =n;
    p->next =li->next;
    li->next = p;
}
void del(ptr &li){
    ptr p =li->next;
    li->next = p->next;
    free(p);
}
void show(ptr li){
    ptr t =li;
    while (t!=0)
    {
        cout<<t->value<< endl;
        t =t->next;
    }

int counter(ptr li){
    int count;
    ptr t =li;
    while (t!=0)
    {
        count++;
        t =t->next;
    }
    return count;
    
}

int main(){

ptr n1= new_node();
n1->value = 10;
n1->next = 0;
}