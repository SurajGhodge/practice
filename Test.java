class Test
{
	public static String capitalizeWord(String str)
	{
		String word[]=str.split("\\s");
		String capitalizeWord="";
		for(String w:word)
		{
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			capitalizeWord+=first.toUpperCase()+afterfirst+" ";
		}
		return capitalizeWord.trim();
	}
	public static void main(String[] args) {
		System.out.println(Test.capitalizeWord("my name is khan"));
	}
}