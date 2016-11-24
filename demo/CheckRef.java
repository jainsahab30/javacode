package demo;

public class CheckRef  extends SecSuper{
private int i; 
public static int count=0;
public String name;
private CheckRef() {
	System.out.println("inside default constructor");
	
}
public CheckRef(int i,String name) {
	System.out.println("parameterized constructor");
	this.i=i;
	this.name=name;
	
}
private void display() {
	System.out.println(i);
	System.out.println(name);
}
public void show() {
	System.out.println("public method");
	
}
static
{
	count++; //System.out.println("inside static block");	
}
static
{
	count++; //System.out.println("inside static block");	
}
}
