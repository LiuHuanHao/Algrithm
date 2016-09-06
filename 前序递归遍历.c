#include <stdio.h>
#include <stdlib.h>

typedef char ElementType;
typedef struct BiTNode //Bi:2 T:tree
{
    char data;
    struct BiTNode *lChild,*rChild;
}BiTNode,*BiTree;

//���ʶ������ڵ�ľ������
visit(char c,int level)
{
    printf("%cλ��%d��\n",c,level);
}

//����һ����������Լ���û�����ǰ������ķ�ʽ��������
CreateBiTree(BiTree *T)
{
    char c;
    scanf("%c",&c);
    if(' '==c)
    {
        *T=NULL;
    }
    else
    {
        *T=(BiTNode*)malloc(sizeof(BiTNode));
        (*T)->data=c;
        CreateBiTree((*T)->lChild);
        CreateBiTree((*T)->rChild);
    }
}
//����������
PreOrderTraverse(BiTree T,int level)
{
    if(T)
    {
        visit(T->data,level);
        PreOrderTraverse(T->lChild,level+1);
        PreOrderTraverse(T->rChild,level+1);
    }
}

int main()
{
    int level=1;
    BiTree T=NULL;
    CreateBiTree(&T);
    PreOrderTraverse(T,level);
    return 0;
}













