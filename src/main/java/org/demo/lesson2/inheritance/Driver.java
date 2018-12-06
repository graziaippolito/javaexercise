package org.demo.lesson2.inheritance;

public class Driver extends Employee {

    private String driverLicenseCategory;

    public Driver(String name, int age, String driverLicenseCategory) {
        super(name, age);
        this.driverLicenseCategory = driverLicenseCategory;
    }

    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }

    public void setDriverLicenseCategory(String driverLicenseCategory) {
        this.driverLicenseCategory = driverLicenseCategory;
    }

    @Override
    public String toString() {
        return "\nDriver {" + super.toString() +
               "\ndriverLicenseCategory = " + driverLicenseCategory +
               "\n}";
    }
}
