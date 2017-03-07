package zadaci_06_03_2017;

public class MyCharacterTest {

	public static void main(String[] args) {
		
	
        MyCharacter myChar = new MyCharacter('f');
		
		System.out.println(myChar.charValue());
		System.out.println(myChar.equals('d'));
		
		System.out.println(MyCharacter.isDigit('t'));
		System.out.println(MyCharacter.toLowerCase('T'));
	}
}
