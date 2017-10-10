package exercise_chapter11;

import java.util.ArrayList;

public class testOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		
		//add city
		cityList.add("xi'an");
		cityList.add("ShangHai");
		cityList.add("ChengDu");
		
		System.out.println(cityList.toString());
		
		cityList.add(2, "Chongqing");
		for(int i = 0; i < cityList.size(); i++) {
			System.out.print(cityList.get(i) + " ");
		}
		
		int index = cityList.indexOf("ShangHai");
		cityList.set(index, "BeiJing");
		System.out.println("\n" + cityList.toString());
		
		cityList.remove(cityList.get(2));
		System.out.println("Chongqing is in the cityList: " + 
				cityList.contains("Chongqing"));
	}

}
