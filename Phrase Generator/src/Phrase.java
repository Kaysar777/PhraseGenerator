
public class Phrase {
	public static void main(String[] args){
		String[] wordListOne = {"круглосуточный", "трех-звенный",
		"30000 футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", 
		"на основе веб технологий", "проникающий", "умный", "динамичный"		
		};
		String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт",
		"ориентированный", "распределенный", "центральный", "кластеризованный",
		"фирменный", "нестандартный"
		};
		String[] wordListThree = {"процесс", "пункт разгрузки", "портал",
		"выход из положения", "тип структуры", "подход", "уровень завоеванного внимания",
		"образец"
		};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("Всё, что вам нужно, - это " + phrase);
		System.out.println("You can replace the vocabulary and customize this phrase generator however you want!   :D");
	}
}
