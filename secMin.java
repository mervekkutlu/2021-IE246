
public class secMin {

    public static void main(String[] args) {

        // take inputs
        // find min value
        // ignore the min value
        // find second min value

        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i < args.length; i++) {

            int inputs = Integer.parseInt(args[i]);

            if (inputs < Integer.parseInt(args[i])) {

                minValue = Integer.parseInt(args[i]);

            }
        }

        System.out.println(minValue);

    }

}
