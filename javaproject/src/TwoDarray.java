public class TwoDarray {
    public static void main(String[] args) {
            // Rows = products, Columns = sales
            int[][] sales = {
                    {1200, 1350, 1400},
                    {1000, 1100, 1200},
                    {900, 950, 980}
            };
            System.out.println("Sales data:");
            for (int[] productSales : sales) {
                for (int sale : productSales) {
                    System.out.print(sale + " ");
                }
                System.out.println();
            }
        }
    }


