package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JTable.PrintMode;


public class Analysis {

	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
	Class c=Class.forName("demo.CheckRef");
	
Constructor con=c.getDeclaredConstructor();
con.setAccessible(true);
Object o= con.newInstance();
//private constructor is called
Class[] c1={int.class, String.class};
// class type of array is made which contains type of arguments passed in cons.
Constructor con2=c.getDeclaredConstructor(c1);
Object[] obj={24,"nitisha"};
// through object type of array we can pass value in cons.
Object o1=con2.newInstance(obj);
//Parameterised cons. is called	
	
Method m= c.getDeclaredMethod("display",null);
m.setAccessible(true);
m.invoke(o, null);
// calling m/d display using o abject (output will be 0 null)
m.invoke(o1, null);
//calling m/d display using o1 abject (output will be 24 nitisha)

Method m1= c.getDeclaredMethod("show",null);

m1.invoke(o, null);
// calling m/d display using o abject (output will be 0 null)
m1.invoke(o1, null);
//calling m/d display using o1 abject (output will be 24 nitisha)
Class child= o.getClass();
Class  parents =child.getSuperclass();

while(parents != null)
{
	String subClassName=child.getName();
   
	String superClassName=parents.getName();
	 System.out.print(subClassName+"is subclass of ");
	System.out.print(superClassName);
	 System.out.println(" ");
	
	child= parents;
	parents= child.getSuperclass();
}

	//to ensure class has any static block
Field f=c.getDeclaredField("count");
int no= (int)f.get(o);
if (c!=null && no !=0){ System.out.println("static block is intialized ");
System.out.println("number of static blocks in class "+no);
}
if (no ==0){ System.out.println("there is no static block in class ");}
boolean status=c.isInstance(o);
//this line show either object is create or not of a class

	
	if (status){ System.out.println("object created ");
	
	}
	else{ System.out.println("not created ");}
	
	
	}

	

}
