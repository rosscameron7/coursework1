import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Dec2Hex {

    private static final Logger logger = LoggerFactory.getLogger(Dec2Hex.class);

    public static int Arg1;

    public static void main(String args[]) {
        if (args.length == 0) {
            logger.error("Error: No input argument provided. Please provide a value.");
            return; // Exit the program
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            logger.error("Error: Input must be a valid integer. Please provide a valid number.");
            return; // Exit the program
        }

        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        logger.info("Converting the Decimal Value {} to Hex...", num);

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        logger.info("Hexadecimal representation is: {}", hexadecimal);
        logger.info("Thank you for using this converter!");
        logger.info("Ross Cameron - DevOps");
    }
}
