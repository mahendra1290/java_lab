class Sumation {

    public static void main(String[] args) {
        Sumation sumer = new Sumation();
        int sum = sumer.getSumOfSeries(10);
        System.out.println(sum);
    }

    public int getSumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}