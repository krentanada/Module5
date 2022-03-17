
public class fibo {

	public static int fibonacciRe(int n) { //recursive method

	if(n<=1)
		{
			return 1;
		}
		else {
			return fibonacciRe(n-1)+fibonacciRe(n-2);
		}
	}


public static int fibonacciIt(int n) { //iterative method

	if(n<=1) 
		{
			return 1;
		}

 int r=0,p=1,pp=1,i;

	for(i=2;i<=n;i++){
		r = p + pp;
		pp =p;
		p =r;
	}
		return r;
  }

public static void main(String[] args) {

int i,n=40,f1,f2;

System.out.print("n\tRuntimeIterative\tRuntimeRecursive\n");
System.out.print("==\t==============\t==============\n");

long start_time,end_time;
long differenceIt,differenceRe;


for(i=10;i<=n;i++) // 10 to 40
{
start_time = System.nanoTime(); //start
f2 = fibonacciRe(i); //calling recursive method
end_time = System.nanoTime(); //end 
differenceRe = (int)((end_time - start_time) / 1e6); //end - start
	
start_time = System.nanoTime(); //start
f1 = fibonacciIt(i); //calling iterative method
end_time = System.nanoTime(); //end
differenceIt = (int)((end_time - start_time) / 1e6); //end - start


System.out.print(i+"\t\t"+differenceIt+"\t\t\t"+differenceRe +"\t\n"); 
}
}
}

