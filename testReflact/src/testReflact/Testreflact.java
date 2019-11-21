package testReflact;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class Testreflact {
	
	@Test
	public void getFun() throws Exception{
		Class<?> clazz = Class.forName("testReflact.person");
		Constructor<?> constructor = clazz.getConstructor();
		constructor.newInstance("ÄãºÃ");
	}
	@Test
	public void Paramter() throws Exception{
		Class<?> clszz = Class.forName("testReflact.person");
		Constructor<?>[] c = clszz.getConstructors();
		for (Constructor<?> constructor : c) {
			System.out.println(constructor);
		}
	}
}
