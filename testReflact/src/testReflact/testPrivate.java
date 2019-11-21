package testReflact;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.Test;

public class testPrivate {
	int a ;
	@Test
	public void getParameter() throws Exception{
		Class<?> clazz = Class.forName("testReflact.PrivateVariable");
		Object obj = clazz.newInstance();
		Field f = clazz.getDeclaredField("lover");
		f.setAccessible(true);
		String lover =(String) f.get(obj);
		System.out.println(lover);
		f.set(obj, "如果我成功了，做我女朋友好吗？");
		String yu= (String) f.get(obj);
		System.out.println(yu);
		String name = clazz.getName();
		String simpleName = clazz.getSimpleName();
		System.out.println("name:"+name);
		System.out.println("simpleName:"+simpleName);
	}
	
	@Test
	public void getMethods() throws Exception{
		Class<?> clazz =Class.forName("testReflact.PrivateVariable");
		Object obj = clazz.newInstance();
		Method me = clazz.getDeclaredMethod("func");
		me.setAccessible(true);
		me.invoke(obj);
	}
	
	@Test
	public void testString(){
	 int[] x =new int[3];
	 int[] y = x;
	 x[0]=20;
	 y[1]=100;
	 x=null;
	 System.out.println(Arrays.toString(y));
	}
	
	@Test
	public void show(){
		int b=0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
	}

}
