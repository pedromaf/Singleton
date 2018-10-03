// code from https://github.com/pedromaf/Payroll/blob/master/Payroll
package controller.authentication;

public class AdminAccount {

    private String username;
    private String password;

    public AdminAccount() {

        this.username = "SYSTEMADMIN";
        this.password = "SYSTEMADMIN";
    }

    public String getUsername() {

        return this.username;
    }

    public String getPassword() {

        return this.password;
    }
}