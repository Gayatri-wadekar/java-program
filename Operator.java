public class Operator {
	
	public static void main(String[] args) {
		
		// arithmetic operator(+, - , * , / ,% )
		int num1 = 100;
		int num2 = 10;
		
		int add = num1 + num2 ;
		System.out.println("Addition of" + num1 +" &" + num2 + "=" + add);
		
		int sub = num1 - num2;
		System.out.println(sub);
		
		int mult = num1 * num2;
		System.out.println(mult);
		
		int div = num1 / num2;
		System.out.println(div);
		
		int mode = num1 % num2 ;
		System.out.println(mode);
		
		// assignment operators(= , += , -= , *= , /= , %=)
		
		int score = 500 ;
		
		score = 300;
		int no = 10;
		
		// score = score + no ;
		score += no;
		System.out.println(score);
		
		score -= no;
		System.out.println(score);
		
		score *= no;
		System.out.println(score);
		
		score /= no;
		System.out.println(score);
		
		score %= no;
		System.out.println(score);
		
		// relational operators (== , != , > , < , >=, <= )
		int val1 = 100;
		int val2 = 200;
		
		System.out.println(val1 == val2);
		
		System.out.println(val1 != val2);
		
		System.out.println(val1 < val2);
		
		System.out.println(val1 > val2);
		
		System.out.println(val1 >= val2);
		
		System.out.println(val1 <= val2);
		
		// logical operator
		
		int age = 25;
		System.out.println((age >= 18) && (age >=60));
		System.out.println((age >= 18) || (age >=60));
		System.out.println(!(age >= 18) || (age >=60));
		
		
		// unary operator 
		// increment , decrement
		
		int a = 5;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		
	}

}
