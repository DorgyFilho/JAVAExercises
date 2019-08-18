//Exemplo Lista

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExLista{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Dorgival");
		list.add("Richter");
		list.add("Gosia");
		list.add("Vivien");
		list.add("Katherine");
		list.add("Bia");
		list.add("Beitske");
		list.add("Simona");
		list.add("Christina");
		list.add("Alice");
		list.add(0, "Jamie");
		
		System.out.println(list.size());
		
		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println("---------------------------");
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'D');

		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------------");
		System.out.println("Index of Beitske: " + list.indexOf("Beitske"));
		System.out.println("Index of Danica: " + list.indexOf("Danica"));
		
		System.out.println("---------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		for(String k : result) {
			System.out.println(k);
		}
		System.out.println("---------------------------");
		String name = list.stream().filter(k -> k.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("---------------------------");
		String name2 = list.stream().filter(k -> k.charAt(0) == 'W').findFirst().orElse(null);
		System.out.println(name2);
		
		
		
		
	}
}