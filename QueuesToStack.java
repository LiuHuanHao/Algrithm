package test;  

import java.util.LinkedList;  

public class QueuesToStack   
{  
    LinkedList<Integer> queue1=new LinkedList<Integer>();  
    LinkedList<Integer> queue2=new LinkedList<Integer>();  
    //思路：转换一个队列n-1个数据到另一个位置，取出这个队列的最后一个元素，就是先进后出
    //初始全部保存在队列1中
    public void push(int value)//入栈  
    {  
        queue1.addLast(value);  
    }  

    public int pop()//出栈     
    {  
        if(sSize()!=0)//栈不为空  
        {  
            //当Q1不为空时移动这个队的n-1个到另一个中  
            if(!queue1.isEmpty())//q1 空  
            {  
                putN_1ToAnthor();
                //取出Q1的唯一最后一个数据
                return queue1.removeFirst();  
            }  
            else 
            {  
            	//当Q2不为空时，移动 Q2的n-1个数据到Q1
                putN_1ToAnthor();  
                //取出Q2最后一个数据即为想要的数据
                return queue2.removeFirst();  
            }          
        }  
        else  
        {  	//栈内元素为空时无法取出数据
            System.out.println("栈已经为空啦，不能出栈");  
            return -1;  
        }  

    }  

    public int sSize()  
    {  
    	//两个队列的总长度为虚拟栈的大小
        return queue1.size()+queue2.size();  
    }  

    public void putN_1ToAnthor()//从非空中出队n-1个到另一个队列   因为队列总是一空一非空  
    {  
        if(!queue1.isEmpty())  
        {  
        	//当Q1不为空时取剩该队列的一个数据输出
        	//取出的数据保存到Q2中
            while(queue1.size()>1)  
            {  
                queue2.addLast(queue1.removeFirst());  
            }  
        }  
        //当Q2不为空时取剩该队列的一个数据输出
    	//取出的数据保存到Q1中
        else if(!queue2.isEmpty())  
        {  
            while(queue2.size()>1)  
            {  
                queue1.addLast(queue2.removeFirst());  
            }  
        }  
    }  
    
    
    public static void main(String[] args)  
    {  
        QueuesToStack stack=new QueuesToStack();  
        stack.push(1);  
        stack.push(2);  
        stack.push(3);  
        stack.push(4);  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        stack.push(5);  
        stack.push(6);  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
    }  
}  
