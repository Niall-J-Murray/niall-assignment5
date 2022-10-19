package niall.assignment5.main;

import java.util.Random;

public class CustomListApplication {

	public static void main(String[] args) {

		customArrayListTester();
	}

	private static void customArrayListTester() {
		Random random = new Random();

		CustomArrayList<String> customStringList = new CustomArrayList<>();
		CustomArrayList<Integer> customIntegerList = new CustomArrayList<>();
		CustomArrayList<Object> customObjectList = new CustomArrayList<>();
		Integer numberOfElements = random.nextInt(50);
		String stringElement = "stringElement";
		Object objectElement = "objectElement";

		System.out.println("CustomArrayList<String> test: ");
		stringListTest(customStringList, stringElement, numberOfElements);
		System.out.println("------------------------------");

		numberOfElements = random.nextInt(50);
		System.out.println("CustomArrayList<Integer> test: ");
		integerListTest(customIntegerList, numberOfElements);
		System.out.println("------------------------------");

		numberOfElements = random.nextInt(50);
		System.out.println("CustomArrayList<Object> test: ");
		objectListTest(customObjectList, objectElement, numberOfElements);
		System.out.println("------------------------------");
	}

	private static void stringListTest(CustomArrayList<String> customStringList, String element, Integer numberOfElements) {
		Integer count = 0;
		while (count < numberOfElements) {
			customStringList.add(element + count);
			count++;
		}

		for (int i = 0; i < customStringList.getSize(); i++) {
			System.out.println(customStringList.get(i));
		}
		System.out.println("Items added = " + count);
		System.out.println("CustomArray size = " + customStringList.getSize());
	}

	private static void integerListTest(CustomArrayList<Integer> customIntegerList, Integer numberOfElements) {
		Integer count = 0;
		while (count < numberOfElements) {
			customIntegerList.add(count);
			count++;
		}

		for (int i = 0; i < customIntegerList.getSize(); i++) {
			System.out.println(customIntegerList.get(i));
		}
		System.out.println("Items added = " + count);
		System.out.println("CustomArray size = " + customIntegerList.getSize());
	}

	private static void objectListTest(CustomArrayList<Object> customObjectList, Object objectElement, Integer numberOfElements) {
		Integer count = 0;
		while (count < numberOfElements) {
			customObjectList.add(objectElement + String.valueOf(count));
			count++;
		}

		for (int i = 0; i < customObjectList.getSize(); i++) {
			System.out.println(customObjectList.get(i));
		}
		System.out.println("Items added = " + count);
		System.out.println("CustomArray size = " + customObjectList.getSize());

	}
}
