
/**
 * 和为15的棋盘游戏，要求从1到9的九个数不重复填入3*3棋盘的方格中。各行各列及对角线和为15，
 * @author 刘焕濠
 *
 */
public class GridGame {
	
	int[][] array;
	int count=1;
	public GridGame()
	{
		System.out.println("调用了构造函数");
		array=new int[3][3];
	}
	public void showGrid()
	{
		//System.out.println("调用了打印函数");
		int i,j;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+" ");
				//打印一行后换行
			}
			System.out.println();
		}
		System.out.println();
		//打印一个表格后换行
	}

	private boolean datachecksumrow()
	 {
	 int i,j;
	 for(i=0;i<array.length;i++)
	 {
     		int k=0;
     		//k必须第一个for循环里面值零，这样才不会造成k的数据叠加
	 	for(j=0;j<array[i].length;j++)
	 		k=k+array[i][j];
			if(k!=15)
				//当一行数据之和不为15是返回false
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
				//当一列数据不为15时返回false
			 	return false;
	 }
		return true;
	 }
	 private boolean dataCheck()
	 {
		if(!datachecksumrow())
			//检查行的数据之和是否为15
	 		return false;
	 	if(!datachecksumcolumn())
    			//检查列的行数之和是否为15
	 		return false;
	 	if(array[0][0]+array[1][1]+array[2][2]!=15)
			//检查对角线之和是否为15
	 		return false;
	 	if(array[0][2]+array[1][1]+array[2][0]!=15)
	 		return false;
	 	return true;
	 }
	
	public void arrage()
	{
		System.out.println("调用了穷举函数");
		int sum=1;//sum用于标记符合条件情况的个数
		//嵌套for循环生成9个数据不同的1-9的数字
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==j)
					continue;
				//当数据相同时返回继续循环
				for(int k=1;k<=9;k++)
				{
//					System.out.println("函数到达k这里");
					if(k==j||k==i)
						continue;
					for(int l=1;l<=9;l++)
					{
						if(l==k||l==j||l==i)
							continue;
						for(int m=1;m<=9;m++)
						{
							//System.out.println("函数到达k这里");
							if(m==k||m==j||m==l||m==i)
								continue;
							for(int n=1;n<=9;n++)
							{
								if(n==k||n==m||n==j||n==l||n==i)
									continue;
								for(int o=1;o<=9;o++)
								{
									//System.out.println("函数到达o这里");
									if(o==n||o==m||o==j||o==i||o==l||o==k)
										continue;
									for(int p=1;p<=9;p++)
									{	
										//System.out.println("函数到达p这里");
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
											//System.out.println("布局结束");
											//showGrid();
											if(dataCheck())
											{
												System.out.println("匹配成功");
												System.out.println("=="+sum+"==");
												sum++;
												showGrid();
												//匹配成功打印表格
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
		//调用构造函数new一个二维数组用于存放表格数据
		game.arrage();
		System.out.println("程序结束");
	}
}
















