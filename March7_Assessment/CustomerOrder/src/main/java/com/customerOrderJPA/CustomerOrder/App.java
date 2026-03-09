package com.customerOrderJPA.CustomerOrder;

import java.time.LocalDate;
import java.util.List;

import com.customerOrderJPA.Dao.CustomerDAOImpl;
import com.customerOrderJPA.Dao.OrderDAOImpl;
import com.customerOrderJPA.Entity.Customer;
import com.customerOrderJPA.Entity.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        OrderDAOImpl orderDAO = new OrderDAOImpl();

        // Insert Customer with Order
        Customer c = new Customer(
                "Rahul",
                "rahul@gmail.com",
                "Male",
                9876543210L,
                LocalDate.now()
        );

        Order o = new Order(
                "ORD101",
                "Laptop",
                1,
                75000,
                LocalDate.now()
        );

        c.setOrder(o);

        customerDAO.insertCustomer(c);
        System.out.println("Customer inserted successfully\n");


        // Fetch Customer by ID
        Customer customer = customerDAO.getCustomerById(1);
        System.out.println("Customer By ID:");
        System.out.println(customer.getCustomerName() + " " + customer.getEmail());
        System.out.println();


        // Fetch All Customers
        List<Customer> list = customerDAO.getAllCustomers();

        System.out.println("All Customers:");

        list.forEach(System.out::println);

        System.out.println();


        // Update Customer
        customerDAO.updateCustomer(1, "Rahul Sharma");
        System.out.println("Customer Updated\n");


        // JPQL Query (Fetch by Email)
        Customer emailCustomer =
                customerDAO.getCustomerByEmail("rahul@gmail.com");

        System.out.println("Customer fetched using JPQL:");
        System.out.println(emailCustomer.getCustomerName());
        System.out.println();


        // Fetch Order By ID
        Order order = orderDAO.getOrderById(1);

        System.out.println("Order Details:");
        System.out.println(order.getProductName() + " " + order.getPrice());
        System.out.println();


        // Update Order
        orderDAO.updateOrder(1, "Gaming Laptop");
        System.out.println("Order Updated\n");


        // Delete Customer
        customerDAO.deleteCustomer(1);
        System.out.println("Customer Deleted");
    }
}
