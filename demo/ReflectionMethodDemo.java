package demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;



public class ReflectionMethodDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
Scanner sc=new Scanner(System.in);
System.out.println("enter class name");
String className= sc.next();
Class c1=Class.forName(className);
Object obj=c1.newInstance();
System.out.println("enter method name");
String methodName=sc.next();
Method m1=c1.getDeclaredMethod(methodName);
m1.invoke(obj);
System.out.println("done");
	
	}

}
