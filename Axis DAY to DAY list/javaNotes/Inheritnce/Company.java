package Inheritnce;

public class Company {
    String companyId;
    String companyName;
    String companyPlace;
    int CompanyStartYear;

    // Company(String companyId,
    // String companyName,
    // String companyPlace,
    // int CompanyStartYear) {
    // this.companyId = companyId;
    // this.companyName = companyName;
    // this.companyPlace = companyPlace;
    // this.CompanyStartYear = CompanyStartYear;

    // }

    Company() {

    }

    public void showCompanyDetails() {
        System.out.println("Company Name = " + this.companyName);
        System.out.println("Company id = " + this.companyId);
        System.out.println("Company Place = " + this.companyPlace);
        System.out.println("Company Year = " + this.CompanyStartYear);
    }
}
