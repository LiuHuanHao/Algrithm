
/*
 * A:���� import java.util.Scanner
 * B:��������¼�����
 * 		Scanner sc=new Scanner(System.in)
 *C:   ͨ�������ȡ����
 *		int x=sc.nectInt();
 */
import java.util.Scanner;
public class ScannerDemo
{
	/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("��������һ������:");
	int x=sc.nextInt();
	System.out.println("�������������:"+x);
}
*/
//ˮ�ɻ������Ǹ�λ���ֵ������͵��ڸ�������
/*
 * ��λ: 153%10
 * ʮλ: 153/10%10
 * ��λ : 153/10/10%10
 */
	public static void main(String[] args) {
		

	/*for(int x=100;x<1000;x++)   //����λ��֮�н��в���
	{
		int ge=x%10;
		int shi=x/10%10;
		int bai=x/10/10%10;
		if(x==(ge*ge*ge+bai*bai*bai+shi*shi*shi))
			System.out.println(x);
	}*/
		/*��ϰ:���ڿ���̨���������������������λ��
		 * ��λ������λ
		 * ʮλ����ǧλ
		 * ��λ+ǧλ+ʮλ+��λ=��λ
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
		//�����������
		/*for(int x=0;x<5;x++)
		{
			for(int y=0;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*
		 ����žų˷���
		 1*1=1
		 1*2=2 2*2=4
		 1*3=3 2*3=6 3*3=9
		 1*4=4 2*4=8 3*4=12 4*4=16
		 һ������
		 '\t'  tab����λ��
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
		 ����:С��������ÿ�춼�����2.5Ԫ������һ���Ǵ�Ǯ�ĵ�����
		 ��5�ı�����������ʧȥ6Ԫ�����ʾ��������죬���Ŵ浽100Ԫ
		 A:С��������ÿ�����2.5Ԫ
		 	double dayMoney=2.5
		 B:�����������
		 	double daySum=0;
		 C:�ӵ�һ��Ϳ�ʼ��Ǯ
		 	int dayCount=1;
		 D:����������浽100Ԫ
		 	double result=100;
		 E:��Ǯ�ĵ������5�ı�����������ʧȥ6Ԫ
		 	daySum-=6;
		 	�������5�ı�����Ļ���ǰ��Ҫ�ۼ�
		 	daySum+=dayMoney;
		 F: ��Ϊ��֪���Ƕ����죬������Ӵon����ѭ����һ������100Ԫ
		 	�˳�ѭ��
		 */
		double dayMoney=2.5;
		//��Ǯ�ĳ�ʼ��ֵ��0
		double daySum=0;
		//�ӵ�һ�쿪ʼ�洢
		int dayCount=1;
		//���մ洢��С��100
		int result=100;
		while(true)
		{
			daySum+=dayMoney;
			if(daySum>=result)
			{
				System.out.println("������"+dayCount+"��洢,�洢��"+daySum+"Ԫ");
				break;
			}
			if(dayCount%5==0)
			{
				daySum-=6;
				System.out.println("��"+dayCount+"�컨��6ԪǮ");
			}
			dayCount++;
		}
	}

}














