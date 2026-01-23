import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(invalidTransactions(new String[]{"alice,20,800,mtv","alice,50,100,beijing"}));
        System.out.println(invalidTransactions(new String[]{"alice,20,800,mtv","alice,50,1200,mtv"}));
        System.out.println(invalidTransactions(new String[]{"alice,20,800,mtv","bob,50,1200,mtv"}));
    }

    public static List<String> invalidTransactions(String[] transactions) {

        class Transaction {
            String name;
            int time;
            int amount;
            String city;
            String raw;
            boolean invalid = false;

            Transaction(String s) {
                this.raw = s;
                String[] parts = s.split(",");
                this.name = parts[0];
                this.time = Integer.parseInt(parts[1]);
                this.amount = Integer.parseInt(parts[2]);
                this.city = parts[3];
            }
        }

        List<Transaction> list = new ArrayList<>();

        for (String t : transactions) {
            list.add(new Transaction(t));
        }

        for (int i = 0; i < list.size(); i++) {
            Transaction a = list.get(i);

            if (a.amount > 1000) {
                a.invalid = true;
            }

            for (int j = i + 1; j < list.size(); j++) {
                Transaction b = list.get(j);

                if (!a.name.equals(b.name)) continue;
                if (a.city.equals(b.city)) continue;

                if (Math.abs(a.time - b.time) <= 60) {
                    a.invalid = true;
                    b.invalid = true;
                }
            }
        }

        List<String> invalidTransactions = new ArrayList<>();
        for (Transaction t : list) {
            if (t.invalid) {
                invalidTransactions.add(t.raw);
            }
        }

        return invalidTransactions;
    }

    public static List<String> invalidTransactionsAlternative(String[] transactions) {

        class Transaction {
            String name;
            int time;
            int money;
            String city;

            public Transaction(String csv) {
                String[] parts = csv.split(",");
                name = parts[0];
                time = Integer.parseInt(parts[1]);
                money = Integer.parseInt(parts[2]);
                city = parts[3];
            }
        }

        List<String> result = new ArrayList<>();
        boolean[] invalidArray = new boolean[transactions.length];

        for (int i = 0; i < transactions.length; i++) {

            Transaction ti = new Transaction(transactions[i]);

            if (ti.money > 1000) {
                invalidArray[i] = true;
            }

            for (int j = i + 1; j < transactions.length; j++) {

                Transaction tj = new Transaction(transactions[j]);

                if (ti.name.equals(tj.name) && Math.abs(ti.time - tj.time) <= 60 && !ti.city.equals(tj.city)) {
                    invalidArray[i] = true;
                    invalidArray[j] = true;
                }
            }
        }

        for (int i = 0; i < transactions.length; i++) {
            if (invalidArray[i])
                result.add(transactions[i]);
        }
        return result;
    }

    public List<String> invalidTransactionsWithoutClass(String[] transactions) {

        int n = transactions.length;
        boolean[] invalid = new boolean[n];

        for (int i = 0; i < n; i++) {
            String[] t1 = transactions[i].split(",");
            String name1 = t1[0];
            int time1 = Integer.parseInt(t1[1]);
            int amount1 = Integer.parseInt(t1[2]);
            String city1 = t1[3];

            if (amount1 > 1000) {
                invalid[i] = true;
            }

            for (int j = i + 1; j < n; j++) {
                String[] t2 = transactions[j].split(",");
                String name2 = t2[0];
                int time2 = Integer.parseInt(t2[1]);
                String city2 = t2[3];

                if (!name1.equals(name2)) continue;
                if (city1.equals(city2)) continue;

                if (Math.abs(time1 - time2) <= 60) {
                    invalid[i] = true;
                    invalid[j] = true;
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (invalid[i]) {
                result.add(transactions[i]);
            }
        }

        return result;
    }
}