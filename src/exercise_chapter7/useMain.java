package exercise_chapter7;

public class useMain {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("usage: java useMain 23 - 24");
			System.exit(0);
		}
		
		int result = 0;
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);

		}

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);
	}

}
