package test;

import java.util.Stack;
 
public class TwoStackToQueue {
	public static void main(String[] args) throws Exception {
		TwoStackToQueue twoStackToQueue = new TwoStackToQueue();
		twoStackToQueue.add(1);
		twoStackToQueue.add(2);
		twoStackToQueue.add(3);
		System.out.println(twoStackToQueue.removeHead());
		System.out.println(twoStackToQueue.removeHead());
		twoStackToQueue.add(4);
		System.out.println(twoStackToQueue.removeHead());
		System.out.println(twoStackToQueue.removeHead());
		twoStackToQueue.add(5);
		System.out.println(twoStackToQueue.removeHead());
		System.out.println(twoStackToQueue.removeHead());
	}
 
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
 
	// 没有考虑容量问题
	public void add(int element) {
		//将传进来的数据存入第一个栈，先进后出
		stack1.push(element);
	}
    // 移除头部
	public int removeHead() throws Exception {
		//但第二个栈为空第一个栈不为空的时候将第一个栈的数据pop到第二个栈
		//慢加入的数据被放到第二个栈的底部此时第二个栈的顺序为原始队列的数据
		//stack2不为空时不允许添加新的元素以免打乱顺序
		if (stack2.empty()) {
			while (!stack1.empty()) {
				int tmp = stack1.pop();
				stack2.push(tmp);
			}
		}
		//while循环后还是没有push数据到stack2中，说明队列为空
		if (stack2.empty())
			throw new Exception("No element in queue!!");
		return stack2.pop();
	}
}

