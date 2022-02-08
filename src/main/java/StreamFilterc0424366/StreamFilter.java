package StreamFilterc0424366;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        StreamFilter sf = new StreamFilter();
        
        StreamFilter.Customer customer = sf.new Customer();
        
        List<Customer> customers = Arrays.asList(customer);
        
        List<Customer> customersWithMoreThan100Points = customers
                .stream()
                .filter(c -> c.getPoints() > 100)
                .collect(Collectors.toList());
    }
    
    public class Customer{
        private String name;
        private int points;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }
        
        
    }
}
