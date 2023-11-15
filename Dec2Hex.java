class Dec2Hex {

    private static int Arg1;

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input argument provided. Please provide a value.");
            return;
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input must be a valid integer. Please provide a valid number.");
            return;
        }

        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        int num;
        num = Arg1;

        StringBuilder hexadecimalBuilder = new StringBuilder();
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimalBuilder.insert(0, ch[rem]);
            num = num / 16;
        }

        String hexadecimal = hexadecimalBuilder.toString();
        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
