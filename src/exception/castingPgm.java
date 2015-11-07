package exception;

import java.util.ArrayList;

public class castingPgm{
	public static void main(String[] args){
		ArrayList<dog> a = new ArrayList<dog>();
		a.add(new dog("bull dog"));
		a.add(new dog("pincy"));
		a.add(new dog("trigger"));
		System.out.println(a);
		for(Object i : a){
			System.out.println(i);
		}
		((dog)a.get(0)).makesound();
		((dog)a.get(1)).makesound();
		((dog)a.get(2)).makesound();
	
	}
}