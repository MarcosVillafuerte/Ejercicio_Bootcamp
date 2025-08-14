public class Array {
    public static void main(String[] args) {
        double notaf=0;
        Double[] nota = {15.2,13.2,18.3,11.4,17.4,14.6,19.9,13.9};
        for (double i:nota){
            notaf += i;
        }
        notaf = notaf/nota.length;
        System.out.println("Su nota final es: "+notaf);
    }
}
