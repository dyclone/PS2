package MainPackage;

public class MyInteger {

	public int getValue(){
		return value;
	}
	
	private int value; 
	
	public MyInteger (int value)
	{
		this.value = value;
	}
	
	public boolean isEven()
	{
		if (this.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{ 
		if (this.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		for (int f = 2; f < this.getValue() / 2; f++){
		if (this.getValue() % f == 0){
			return false;
		}
		}
		return true;
	}
	
	public static boolean isEven(int value)
	{ 
		if (value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int value)
	{ 
		if (value % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(int value)
	{
		for (int f = 2; f < value / 2; f++){
		if (value % f == 0){
			return false;
		}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt)
	{ 
		if (myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger myInt)
	{ 
		if (myInt.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger myInt)
	{
		for (int f = 2; f < myInt.getValue() / 2; f++){
		if (myInt.getValue() % f == 0){
			return false;
		}
		}
		return true;
	}
	
	public boolean equals(int value){
		if (value == this.getValue())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger myInt){
		if (myInt.getValue() == this.getValue())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
	
	public static int parseInt(char[]s){
		return parseInt(new String(s));
	}
}