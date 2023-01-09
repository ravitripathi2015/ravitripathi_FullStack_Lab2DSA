package gl.com.Payment;
import java.util.Scanner;
import gl.com.services.currencyCount;
public class Driver {

	public static void main(String[] args) 
	{ 	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations:");
		int size=sc.nextInt();
		System.out.println("Enter the Currenty denominations Value:");
		int arr[]=new int[size];
		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Amount to Pay:");
		int amount=sc.nextInt();
		currencyCount cn= new currencyCount();
		cn.mergeSort(arr, 0, size-1);
		cn.findCurrency(arr, amount);
		}
	}


