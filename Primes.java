public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] arr = new boolean[n + 1];
        int counter = 0;
        for(int i = 2; i <= n; i++){
            arr[i] = true;
        }
        for (int p = 2; p <= Math.sqrt(n); p++) {
            if(arr[p]){
                for(int i = p * p; i <= n; i+=p){
                arr[i] = false;
            }
        }
    }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == true) {
                counter++;
                System.out.println(i);
            }
        }
        double ratio = ((double) counter / n) * 100;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int) ratio + "% are primes)");

    }
}
