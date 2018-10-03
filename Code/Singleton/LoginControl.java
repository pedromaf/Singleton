// code from https://github.com/pedromaf/Payroll/blob/master/Payroll
package controller.authentication;

import view.ErrorMessages;

public class LoginControl {

    private static LoginControl instance = null;

    private AdminAccount adminAccount;

    private LoginControl() {

        this.adminAccount = AdminAccount.getInstance();
    }

    public static LoginControl getInstance() {

        if(instance == null) {
            instance = new LoginControl();
        }

        return instance;
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