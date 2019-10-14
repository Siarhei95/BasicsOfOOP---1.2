//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров.

package task1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Customers {
        private String customerName = "Валерий";
        private String product1 = "Автошина";
        private String product2 = "Масло";
        private String product3 = "Тосол";
        private String product4 = "Свечи";
        private List<String> product = new ArrayList<>();

        public class Bue {

            public String getCustmerName() {
                System.out.print("\nBuyer Name: ");
                return customerName;
            }

            public void choice() {
                product.add(product1);
                product.add(product2);
                product.add(product3);
                product.add(product4);
                for (int i = 0; i < product.size(); i++) {
                    String prod = product.get(i);
                    System.out.println(prod);
                }
            }

            public void yourChoice() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nChoose the right product(need to write): ");
                String trueProduct = scanner.next();

                System.out.println("\nYour choise: ");
                for (int i = 0; i < product.size(); i++) {
                    String prod = product.get(i);

                    if (prod.equals(trueProduct)) {
                       System.out.println(prod);
                    }
                }
            }
        }
    }

    public class Payment {

        public static void main(String args[]) {

            Customers сustomer = new Customers();

            Customers.Bue bue = сustomer.new Bue();
            System.out.println("AvtoMarket");
            System.out.println(bue.getCustmerName());
            System.out.println("\nOn sale today: ");
            bue.choice();
            bue.yourChoice();
        }
    }