package hafta5.prework.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntermadiateOperations {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Mehmet"));
        customerList.add(new Customer("Ahmet"));
        customerList.add(new Customer("Murat"));
        customerList.add(new Customer("Fatmagül"));
        customerList.add(new Customer("Emre"));

        customerList.add(new Customer("Mehmet"));
        customerList.add(new Customer("Ahmet"));
        customerList.add(new Customer("Burak"));

        List<Customer> filteredCustomerList = new ArrayList<>();

        for (Customer customer : customerList) {
            if (customer.getName().startsWith("M")) {
                filteredCustomerList.add(customer);
            }
        }

        List<Customer> myList = filteredCustomerList.stream()
                .filter(n -> n.getName().startsWith("M"))
                .toList();
        System.out.println(filteredCustomerList);
        System.out.println(myList);

        List<Integer> list = customerList.stream()
                .map(customer -> customer.getName().length())
                .toList();

        List<String> stringList = customerList.stream().map(customer -> customer.getName().toUpperCase()).toList();

        System.out.println(list + " " + stringList);

        List<String> list1 = customerList.stream()
                .map(customer -> customer.getName().toUpperCase()).distinct().toList();
        System.out.println(list1);

        List<String> list2 = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName()).toList();

        System.out.println(list2);

        List<String> list3 = customerList.stream().skip(1).limit(3)
                .map(customer -> customer.getName()).toList();
        System.out.println(list3);


    }
}
