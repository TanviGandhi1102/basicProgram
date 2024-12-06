package bacicsprograms;
//usage of toCharArray()
//method of Character class Character.idDigit(chararray[i]),Character.isAlphabetic(chararray[i])
import java.util.*;
public class CharacterClass_quest {
	
	static int counterofchar=0;
	static int counterofspace=0;
	static int counterofnumber=0;
public static void main(String[] args) {
	String input="KV no 2";
	char[] c1=input.toCharArray();
	System.out.println(Arrays.toString(c1));
	boolean b4=input.isEmpty();
System.out.println(b4);
for(int i=0;i<c1.length;i++) {
	boolean b1=Character.isAlphabetic(c1[i]);
	//System.out.println(b1);
	if(b1==true) {
		counterofchar++;
	}
	boolean b2=Character.isDigit(c1[i]);
	
	if(b2==true) {
		counterofnumber++;
	}
	
	boolean b3=Character.isWhitespace(c1[i]);
	if(b3==true) {
		counterofspace++;
	}
			
}
System.out.println("total spaces" + counterofspace);
System.out.println("total char" + counterofchar);
System.out.println("total digit" + counterofnumber);


}

}
