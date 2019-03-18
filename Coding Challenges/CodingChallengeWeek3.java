import java.util.ArrayList;

public class CodingChallengeWeek3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> palNames = new ArrayList<String>(); //should contain six names
		
		names.add("karan");
		names.add("madam");
		names.add("tom");
		names.add("civic"); 
		names.add("radar");
		names.add("sexes");
		names.add("jimmy");
		names.add("kayak");
		names.add("john");
		names.add("refer"); 
		names.add("billy");
		names.add("did");
		
		
		
		for(int i = 0; i < names.size(); i++)
		{
			String rev = new StringBuilder(names.get(i)).reverse().toString();
			palNames.add(rev);
		}
			
		for(int i = 0; i < palNames.size(); i++)
		{
			if(names.get(i) != palNames.get(i))
			{
				palNames.remove(i);
			}
		}
		
		System.out.println("List of names: " + names);
		System.out.println("Palindromes: " + palNames);
	}
}
