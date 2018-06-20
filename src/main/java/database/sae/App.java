package database.sae;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Help: Please provide -gen to start generating");
		}
		;
		try {
			if (args[0].equals("-gen")) {
				System.out.println("\n" + "██████╗██████╗      ██████╗██████████╗   ██╗\n"
						+ "██╔══████╔══██╗    ██╔════╝██╔════████╗  ██║\n"
						+ "██║  ████████╔╝    ██║  ████████╗ ██╔██╗ ██║\n"
						+ "██║  ████╔══██╗    ██║   ████╔══╝ ██║╚██╗██║\n"
						+ "██████╔██████╔╝    ╚██████╔█████████║ ╚████║\n"
						+ "╚═════╝╚═════╝      ╚═════╝╚══════╚═╝  ╚═══╝\n"
						+ "                                            \n" + "");
			} else {
				System.out.println("Your Input: " + args[0] + "\n" + "Please provide -gen to start generating");
				throw new Exception();
			}
			;
		} catch (Exception e) {
			System.out.println("Restart required");
			System.exit(1);
		}

	}
}
