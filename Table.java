class Table {

    public static void main(String[] args) {
        Table mineTable = new Table();
        mineTable.createTable();
    }

    public void createTable() {
        for (int i = 1; i < 5; i++) {
            System.out.print("a^" + i + "     ");
        }
        System.out.println("");
        for (int i = 1; i < 5; i++) {
            int result = i;
            for (int j = 1; j < 5; j++) {
                System.out.print(result + "        ");
                result *= i;
            }
            System.out.println("");
        }
    }
}