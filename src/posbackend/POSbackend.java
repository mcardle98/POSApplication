package posbackend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class POSbackend {
    
    private Double orderTotal;
    private Double dailyTotal;
    private String viewDailyOrders;
    private String viewCurrentOrder = "hello";
    private String customerInfo;
    
    private final Integer managerPin = 1339;
    private Integer tempPin;
    
    private List<Employee> employees;
    
    public void start(){
        this.employees = new ArrayList();

        
        Employee employee;
        employee = new Employee("Tylar", "Michalski", 2118, true);
        this.employees.add(employee);
        employee = new Employee("Jarrett", "Duskey", 9830);
        this.employees.add(employee);
        employee = new Employee("Lucas", "Bevacqua", 4237);
        this.employees.add(employee);
        employee = new Employee("Cody", "Miller", 1350);
        this.employees.add(employee);
        employee = new Employee("Alex", "Mcardle", 6227);
        this.employees.add(employee);
        employee = new Employee("Nick", "Jackson", 1216);
        this.employees.add(employee);
        employee = new Employee("Joe", "Downey", 7432);
        this.employees.add(employee);   
    }
    public boolean managerSignIn(Integer pin){
        return Objects.equals(pin, managerPin);
    }
    public boolean signIn(Integer temporaryPin){
        boolean signincheck = false;
        
        for (Employee employee : employees) {
            if(Objects.equals(tempPin, employee.getPin())){
                signincheck = true;
                break;
            }
        }        
        return signincheck;
    }
    public Double updateDailyTotal (Double ticketTotal){
        dailyTotal+=ticketTotal;
        return dailyTotal;
    }

    public String getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(String customerInfo) {
        this.customerInfo += customerInfo;
    }
    
    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal (Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Double getDailyTotal() {
        return dailyTotal;
    }

    public void setDailyTotal(Double dailyTotal) {
        this.dailyTotal = dailyTotal;
    }

    public String getViewOrders() {
        return viewDailyOrders;
    }

    public void setViewOrders(String viewOrders) {
        this.viewDailyOrders = viewOrders;
    }
    public String getViewCurrentOrder() {
        return viewCurrentOrder;
    }

    public void setViewCurrentOrder(String viewCurrentOrder) {
        this.viewCurrentOrder = viewCurrentOrder;
    }
    public void finishOrder() {
        viewDailyOrders+=customerInfo;
        viewDailyOrders+=viewCurrentOrder;
        dailyTotal+=orderTotal;
        customerInfo = "";
        viewCurrentOrder = "";
        orderTotal = 0.00;
    }       
}
