#include <stdio.h>
#include <stdlib.h>

typedef char ElementType;
typedef struct BiTNode //Bi:2 T:tree
{
    char data;    //用于存放字符型数据
    struct BiTNode *lChild,*rChild;     //创建左右指针子树
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
    if(' '==c)     //默认空格为无数据，设置节点为null
    {
        *T=NULL;
    }
    else
    {
        *T=(BiTNode*)malloc(sizeof(BiTNode));
        (*T)->data=c;     //将获取到的数据存入新创建的节点之中
        CreateBiTree((*T)->lChild);   //先创建父节点，在创建做节点，运用了前序遍历的递归思想
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
    int level=1;    //设置开始行数为1
    BiTree T=NULL;
    CreateBiTree(&T);   //创建二叉树后遍历出数据
    PreOrderTraverse(T,level);
    return 0;
}













