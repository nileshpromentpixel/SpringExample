package javaReflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		// no paramater
		Class noparams[] = {};

		// String parameter
		Class[] paramString = new Class[1];
		paramString[0] = String.class;

		// int parameter
		Class[] paramInt = new Class[1];
		paramInt[0] = Integer.TYPE;
		try {
			JavaReflaction obj = new JavaReflaction();

			Class cls = obj.getClass();

			System.out.println("The name of class is " + cls.getName());

			Constructor constructor = cls.getConstructor();
			System.out.println("The name of constructor is " + constructor.getName());

			System.out.println("The public methods of class are : ");

			Method[] methods = cls.getMethods();

			for (Method method : methods)
				System.out.println(method.getName());

			Method method = cls.getDeclaredMethod("printIt", noparams);
			method.invoke(obj, null);

			method = cls.getDeclaredMethod("printItString", paramString);
			method.invoke(obj, new String("mkyong"));

			method = cls.getDeclaredMethod("printItInt", paramInt);
			method.invoke(obj, 123);

			method = cls.getDeclaredMethod("setCounter", paramInt);
			method.invoke(obj, 999);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
