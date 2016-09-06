#include <stdio.h>
#include <stdlib.h>

typedef char ElementType;
typedef struct BiTNode //Bi:2 T:tree
{
    char data;
    struct BiTNode *lChild,*rChild;
}BiTNode,*BiTree;

//访问二叉树节点的具体操作
visit(char c,int level)
{
    printf("%c位于%d层\n",c,level);
}

//创建一个二叉树，约定用户遵照前序遍历的方式输入数据
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
//遍历二叉树
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













