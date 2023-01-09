package gl.com.services;
import com.gl.Interfaces.findMoney;

public class currencyCount implements findMoney {

	@Override
	public void sortDenominator(int arr[], int start, int mid, int end) 
	{
		int len1=mid-start+1;
		int len2=end-mid;
		int leftArr[]=new int[len1];
		int rightArr[]=new int[len2];
		for(int i=0;i<len1;i++)
			leftArr[i]=arr[start+i];
		for(int j=0;j<len2;j++)
			rightArr[j]=arr[mid+1+j];
		int i,j,k;
		i=0;
		j=0;
		k=start;
		while(i<len1 && j<len2) 
		{
			if(leftArr[i]<=rightArr[j]) 
			{
				arr[k]=leftArr[i];
				i++;
			}else 
			{
				arr[k]=rightArr[j];
				j++;
			}
		k++;
		}
	   while (i<len1) 
	   {
		   arr[k]=leftArr[i];
		   i++;
		   k++;
	   }
	   while (j<len2) 
	   {
		   arr[k]=rightArr[j];
		   j++;
		   k++;
	   }
	}

	@Override
	public void mergeSort(int arr[], int start, int end) 
	{
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			sortDenominator(arr,start,mid,end);
		}
	}

	@Override
	public void findCurrency(int arr[], int Amt) 
	{
		int noteCounter[]=new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) {
            if (Amt >= arr[i]) {
                noteCounter[i] = Amt / arr[i];
                Amt = Amt % arr[i];
            }
        }
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i=arr.length-1; i >=0; i--) {
            if (noteCounter[i] != 0) 
            {
                System.out.println(arr[i] + " : "
                    + noteCounter[i]);
            } 
            }
	}}
