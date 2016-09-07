
/*
 * A:导包 import java.util.Scanner
 * B:创建键盘录入对象
 * 		Scanner sc=new Scanner(System.in)
 *C:   通过对象获取数据
 *		int x=sc.nectInt();
 */
import java.util.Scanner;
public class ScannerDemo
{
	/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请你输入一个数据:");
	int x=sc.nextInt();
	System.out.println("你输入的数据是:"+x);
}
*/
//水仙花树就是各位数字的立方和等于该数本身
/*
 * 个位: 153%10
 * 十位: 153/10%10
 * 百位 : 153/10/10%10
 */
	public static void main(String[] args) {
		

	/*for(int x=100;x<1000;x++)   //在三位数之中进行查找
	{
		int ge=x%10;
		int shi=x/10%10;
		int bai=x/10/10%10;
		if(x==(ge*ge*ge+bai*bai*bai+shi*shi*shi))
			System.out.println(x);
	}*/
		/*练习:请在控制台中输出满足如下条件的五位数
		 * 个位等于万位
		 * 十位等于千位
		 * 个位+千位+十位+万位=百位
		 * 
		 */
		/*for(int x=10000;x<=99999;x++)
		{
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			int qian=x/10/10/10%10;
			int wan=x/10/10/10/10%10;
			if(ge==wan&&shi==qian&&(ge+shi+qian+wan)==bai)
				System.out.println(x);
		}*/
		//输出正三角形
		/*for(int x=0;x<5;x++)
		{
			for(int y=0;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*
		 输出九九乘法表
		 1*1=1
		 1*2=2 2*2=4
		 1*3=3 2*3=6 3*3=9
		 1*4=4 2*4=8 3*4=12 4*4=16
		 一次类推
		 '\t'  tab键的位置
		 */
		/*for(int x=1;x<=9;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}*/
		/*
		 需求:小芳的妈妈每天都会给她2.5元，当这一天是存钱的第五天
		 或5的倍数，他都会失去6元，请问经过多少天，她才存到100元
		 A:小芳的妈妈每天给她2.5元
		 	double dayMoney=2.5
		 B:她都会存起来
		 	double daySum=0;
		 C:从第一天就开始存钱
		 	int dayCount=1;
		 D:经过多少天存到100元
		 	double result=100;
		 E:存钱的第五天或5的倍数，他都会失去6元
		 	daySum-=6;
		 	如果不是5的倍数天的话，前就要累加
		 	daySum+=dayMoney;
		 F: 因为不知道是多少天，所以我哟on个死循环，一旦超过100元
		 	退出循环
		 */
		double dayMoney=2.5;
		//存钱的初始化值是0
		double daySum=0;
		//从第一天开始存储
		int dayCount=1;
		//最终存储不小于100
		int result=100;
		while(true)
		{
			daySum+=dayMoney;
			if(daySum>=result)
			{
				System.out.println("共花了"+dayCount+"天存储,存储了"+daySum+"元");
				break;
			}
			if(dayCount%5==0)
			{
				daySum-=6;
				System.out.println("第"+dayCount+"天花了6元钱");
			}
			dayCount++;
		}
	}

}














