public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int numOfSummands = Integer.parseInt(args[0]);
        for (int i = 0; i < numOfSummands; i++) {
            if (i % 2 == 0){
                approxPi += 1.0 / (2*i + 1);
            }
            else {
                approxPi += -1.0 / (2*i + 1);
            }
        }
        approxPi = 4 * approxPi;
        System.out.println(approxPi + " " + actualPi);
    }
}
