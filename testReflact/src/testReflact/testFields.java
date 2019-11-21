package testReflact;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class testFields {

	@Test
	public void PublicLover() throws Exception{
		Class<?> clazz = Class.forName("testReflact.person");
		Object obj = clazz.newInstance();
		Field f = clazz.getField("lover");
		String name = (String) f.get(obj);
		System.out.println(name);
	}

	@Test
	public void PrivateName() throws Exception{
		Class<?> clazz = Class.forName("testReflact.person");
		Object obj = clazz.newInstance();
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		String name = (String) field.get(obj);
		System.out.println(name); 
	}

	@Test
	public void getAll() throws Exception{

		Class<?>  clazz= Class.forName("testReflact.person");
		Object obj = clazz.newInstance();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.err.println(field);
			System.out.println(field.get(obj));

		}
	}
	
	@Test
	public void getMethod() throws Exception{
		Class<?> clazz = Class.forName("testReflact.person");
		Object obj = clazz.newInstance();
		Method me = clazz.getMethod("say");
		me.invoke(obj);
		Method show = clazz.getMethod("show", String.class);
		String string =  (String) show.invoke(obj, "你是我的私有变量");
		System.out.println(string);
	}
	
	@Test
	public void getMethods() throws Exception
	{
		Class<?> clazz =Class.forName("testReflact.person");
		Method[] ms = clazz.getMethods();
		for (Method method : ms) {
			System.out.println(method);
		}
	}
	
}
