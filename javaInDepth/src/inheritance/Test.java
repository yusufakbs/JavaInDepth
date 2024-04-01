package inheritance;

import person.Person;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerId(1234);
        customer.setFirstName("John");
        customer.setLastName("London");
        customer.setTotalDebit(500);

        // getFullName'in person classındaki methodu ezmesinin sebebi
        //üretilen nesnenin Customer tipinde olmasından kaynaklanıyor.
        // Yani customer sınıfında override edilen methodu kullanıyor.
        Person person = new Customer();
        person.setFirstName("Ali");
        person.setLastName("Berker");

        if (person instanceof Customer){
            Customer customerPerson = (Customer) person;
            customerPerson.setCustomerId(402);
            customerPerson.setTotalDebit(300);
        }

        // Person person2 = new Person(); // abstract!

        Supplier supplier = new Supplier();
        supplier.setSupplierId(831);
        supplier.setFirstName("Tunca");
        supplier.setLastName("Zekai");
        supplier.setMainSector("Kırtasiye");

        Employee employee = new Employee();
        employee.setEmployeeId(111);
        employee.setFirstName("Sezai");
        employee.setLastName("Karakoç");
        employee.setDepartmentName("Matbaa");

        System.out.println(customer.getGreetings()+" Müşteri: "+customer.getFullName());
        System.out.println(person.getGreetings()+" Kişi:"+person.getFullName());
        System.out.println(supplier.getGreetings()+" Tedarikçi:"+supplier.getFullName());
        System.out.println(employee.getGreetings()+" Çalışan:"+employee.getFullName());

    }
}
