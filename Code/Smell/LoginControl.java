// code from https://github.com/pedromaf/Payroll/blob/master/Payroll
package controller.authentication;

import view.ErrorMessages;

public class LoginControl {

    private AdminAccount adminAccount;

    public LoginControl() {

        this.adminAccount = new AdminAccount();
    }

    public boolean StartSession(String username, String password) {

        if(username.equals(adminAccount.getUsername())) {
            if(password.equals(adminAccount.getPassword())) {
                return true;
            } else {
                ErrorMessages.invalidPassword();
            }
        } else {
            ErrorMessages.invalidUsername();
        }
        return false;
    }
}