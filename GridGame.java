
/**
 * ��Ϊ15��������Ϸ��Ҫ���1��9�ľŸ������ظ�����3*3���̵ķ����С����и��м��Խ��ߺ�Ϊ15��
 * @author �����
 *
 */
public class GridGame {
	
	int[][] array;
	int count=1;
	public GridGame()
	{
		System.out.println("�����˹��캯��");
		array=new int[3][3];
	}
	public void showGrid()
	{
		//System.out.println("�����˴�ӡ����");
		int i,j;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");
				//��ӡһ�к���
			}
			System.out.println();
		}
		System.out.println();
		//��ӡһ��������
	}

	private boolean datachecksumrow()
	 {
	 int i,j;
	 for(i=0;i<array.length;i++)
	 {
     int k=0;
     //k�����һ��forѭ������ֵ�㣬�����Ų������k�����ݵ���
	 for(j=0;j<array[i].length;j++)
	 k=k+array[i][j];
	 if(k!=15)
	//��һ������֮�Ͳ�Ϊ15�Ƿ���false
	 return false;
	 }
	 return true;
	 }
	 private boolean datachecksumcolumn()
	 {
	 int i,j;
	 for(i=0;i<array.length;i++)
	 {
	 int k=0;
	 for(j=0;j<array[i].length;j++) 
	 k+=array[j][i];
	 if(k!=15)
	//��һ�����ݲ�Ϊ15ʱ����false
	 return false;
	 }
	 return true;
	 }
	 private boolean dataCheck()
	 {
	 if(!datachecksumrow())
	//����е�����֮���Ƿ�Ϊ15
	 return false;
	 if(!datachecksumcolumn())
    //����е�����֮���Ƿ�Ϊ15
	 return false;
	 if(array[0][0]+array[1][1]+array[2][2]!=15)
	//���Խ���֮���Ƿ�Ϊ15
	 return false;
	 if(array[0][2]+array[1][1]+array[2][0]!=15)
	 return false;
	 return true;
	 }
	
	public void arrage()
	{
		System.out.println("��������ٺ���");
		int sum=1;//sum���ڱ�Ƿ�����������ĸ���
		//Ƕ��forѭ������9�����ݲ�ͬ��1-9������
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==j)
					continue;
				//��������ͬʱ���ؼ���ѭ��
				for(int k=1;k<=9;k++)
				{
//					System.out.println("��������k����");
					if(k==j||k==i)
						continue;
					for(int l=1;l<=9;l++)
					{
						if(l==k||l==j||l==i)
							continue;
						for(int m=1;m<=9;m++)
						{
							//System.out.println("��������k����");
							if(m==k||m==j||m==l||m==i)
								continue;
							for(int n=1;n<=9;n++)
							{
								if(n==k||n==m||n==j||n==l||n==i)
									continue;
								for(int o=1;o<=9;o++)
								{
									//System.out.println("��������o����");
									if(o==n||o==m||o==j||o==i||o==l||o==k)
										continue;
									for(int p=1;p<=9;p++)
									{	
										//System.out.println("��������p����");
										if(p==n||p==m||p==j||p==i||p==l||p==k||p==o)
											continue;
										for(int q=1;q<=9;q++)
										{
											if(q==n||q==m||q==j||q==l||q==i||q==k||q==o||q==p)
												continue;
											array[0][0]=i;
											array[0][1]=j;
											array[0][2]=k;
											array[1][0]=l;
											array[1][1]=m;
											array[1][2]=n;
											array[2][0]=o;
											array[2][1]=p;
											array[2][2]=q;
											//System.out.println("���ֽ���");
											//showGrid();
											if(dataCheck())
											{
												System.out.println("ƥ��ɹ�");
												System.out.println("=="+sum+"==");
												sum++;
												showGrid();
												//ƥ��ɹ���ӡ���
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		GridGame game=new GridGame();
		//���ù��캯��newһ����ά�������ڴ�ű������
		game.arrage();
		System.out.println("�������");
	}
}
















