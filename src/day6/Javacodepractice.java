package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Javacodepractice implements Comparable<Javacodepractice>{

	int i;
	
	public Javacodepractice(int i)
	
	{
		this.i = i;
	}
	
	public int n()
	{
		return this.i*10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = new ArrayList<>(Arrays.asList("J","a","v","a"));
		List<Integer> li = new ArrayList<>(Arrays.asList(24,46,55,33,24,45,64,35));
		List<List<Integer>> lii = new ArrayList<>(Arrays.asList(Arrays.asList(24,46,55,33,24,45,64,35),
				                                               Arrays.asList(44,86,75,23,44,85,56,245),
				                                               Arrays.asList(246,346,35,37,246,145,604,315),
				                                               Arrays.asList(242,460,551,303,242,451,648,353),
				                                               Arrays.asList(284,46,335,373,284,453,44,375)));
		
		
		
		StringBuilder sb = new StringBuilder();
		
		String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		s.replace("[0-9]*","" );
		
		System.out.println(s);
		
		List<String> dl = ls
				.stream()
				.distinct()
				.filter(i->i.equals("J")||i.equals("v"))
				.map(i-> i+" for JAVA")
				.collect(Collectors.toList());//
		
		System.out.println(dl.toString());
		
		List<Integer> dl1= li
				.stream()
				.distinct()
				.filter(i->i%2==0)
				.map(i->i*10)
				.map(i->i+100)
				.collect(Collectors.toList());
		
		System.out.println(dl1.toString());
		
		List<Integer> dl2 = lii
				.stream()
				.flatMap(i->i.stream()).filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(dl2.toString());
		
		long c = lii
				.stream()
				.flatMap(i->i.stream())
				.count();
		
		System.out.println("Count: - " + c);
		
		int h = lii
				.stream()
				.flatMap(i->i.stream())
				.hashCode();
		
		System.out.println("Hash code:- "+ h);
		

	}

	@Override
	public int compareTo(Javacodepractice o) {
		// TODO Auto-generated method stub
		
		if(n()==o.n())
		{
			return 0;
		}
		
		
		return 0;
	}

}
