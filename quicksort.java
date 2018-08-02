public class testSuanfa {
	int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
	@Test
	public void test(){
	
			
			
			int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
			int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
			int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
				
			quicksort(0, a.length-1);
				
			System.out.println("排序后的结果：");
			for(int x : a){
				System.out.print(x+" ");
			}
		

		
	}
	void quicksort(int left,int right) 
	{ 
	    int i,j,t,temp; 
	    if(left>right) 
	       return; 
	                                
	    temp=a[left]; //temp中存的就是基准数 
	    i=left; 
	    j=right; 
	    while(i!=j) 
	    { 
	                   //顺序很重要，要先从右边开始找 
	                   while(a[j]>=temp && i<j) 
	                            j--; 
	                   //再找右边的 
	                   while(a[i]<=temp && i<j) 
	                            i++; 
	                   //交换两个数在数组中的位置 
	                   if(i<j) 
	                   { 
	                            t=a[i]; 
	                            a[i]=a[j]; 
	                            a[j]=t; 
	                   } 
	    } 
	    //最终将基准数归位 
	    a[left]=a[i]; 
	    a[i]=temp; 
	                             
	    quicksort(left,i-1);//继续处理左边的，这里是一个递归的过程 
	    quicksort(i+1,right);//继续处理右边的 ，这里是一个递归的过程 
	} 
