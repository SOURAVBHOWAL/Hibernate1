package Regex1;

import java.util.regex.*;

public class Demo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("java");
		String s="I love java programming java";
		Matcher m = p.matcher(s);
		
		System.out.println(s.replaceAll("java", "hi"));   // true
		
		//backreference of groups
		String regex = "\\b(\\w+)(\\s+\\1)+\\b";
		Pattern p1 = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher("This is is is a test test");

		while(m1.find()) {
		    System.out.println("Duplicate: " + m1.group());
		}
//		Pattern p2 = Pattern.compile("(\\d+)-(\\1)");
//		Matcher m2= p2.matcher("1234-1234");
//
//		if(m2.find()) {
//		    System.out.println(m2.group(2));
//		}
		
		//url extractor
		String text = "This is a website: https://www.geeksforgeeks.org/";
        String r = "https?://[w]{3}\\.[a-z]+\\.[a-z]{2,6}";

        Pattern pattern = Pattern.compile(r);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String url = matcher.group(0);
            System.out.println("URL found: " + url);
        }

	}

}

