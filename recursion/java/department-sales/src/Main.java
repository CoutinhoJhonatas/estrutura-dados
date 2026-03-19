import java.util.List;

public class Main {
    public static void main(String[] args) {
        double[] result = totalSales(List.of(
                "8349,14/09/2024,899.9,ESPORTE",
                "4837,17/09/2024,530.0,VESTUARIO",
                "15281,21/09/2024,1253.99,ESPORTE",
                "15344,27/09/2024,1000.9,VESTUARIO",
                "18317,04/10/2024,250.4,VESTUARIO",
                "18972,11/10/2024,385.5,JARDINAGEM"), "VESTUARIO");

        System.out.printf("%d VENDAS%n", (int) result[0]);
        System.out.printf("TOTAL = $ %.2f", result[1]);
    }

    public static double[] totalSales(List<String> sales, String department) {
        return totalSalesAux(sales, department, new double[] {0.0, 0.0});
    }

    public static double[] totalSalesAux(List<String> sales, String department, double[] salesNumbers) {

        if (sales.isEmpty()) {
            return salesNumbers;
        }

        String head = sales.get(0);
        String[] headParts = head.split(",");

        if (department.equalsIgnoreCase(headParts[3])) {
            salesNumbers[0]++;
            salesNumbers[1] += Double.parseDouble(headParts[2]);
        }

        List<String> tail = sales.subList(1, sales.size());

        return totalSalesAux(tail, department, salesNumbers);
    }
}