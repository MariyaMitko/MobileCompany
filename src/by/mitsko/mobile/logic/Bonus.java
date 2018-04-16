package by.mitsko.mobile.logic;

public class Bonus {
	static {
		System.out.println("==========Information about bonus==========");
	}
	
    public static void ShowBonus(int freeMinCount){
         System.out.println(freeMinCount + " bonus minutes were added");
    }
    public static void ShowBonus(int freeMinCount, int freeTrafficCount){
        System.out.println(freeMinCount + " bonus minutes and " + freeTrafficCount + " bonus megabytes were added");
   }
}
