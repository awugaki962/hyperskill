// Posted from EduTools plugin
/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        String operator = args[0].toUpperCase();
        int[] numbers = new int[args.length-1];
        int result = 0;

        for (int i = 1; i < args.length; i++) {
            numbers[i-1] = Integer.parseInt(args[i]);
        }
        switch (operator) {
            case "MAX":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] > result) {
                        result = numbers[i];
                    }
                }
                break;
            case "MIN":
                result = numbers[0];
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] < result) {
                        result = numbers[i];
                    }
                }
                break;
            case "SUM":
                for (int i = 0; i < numbers.length; i++) {
                    result += numbers[i];
                }
                break;
            default:
                break;
        }
        System.out.println(result);
    }
}