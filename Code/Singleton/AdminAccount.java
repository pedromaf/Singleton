// code from https://github.com/pedromaf/Payroll/blob/master/Payroll
package controller.authentication;

public class AdminAccount {

	private static AdminAccount instance = null;

    private String username;
    private String password;

    private AdminAccount() {

        this.username = "SYSTEMADMIN";
        this.password = "SYSTEMADMIN";
    }

    public static AdminAccount getInstance() {

    	if(instance == null) {
    		instance = new AdminAccount();
    	}

    	return instance;
    }

    public String getUsername() {

        return this.username;
    }

    public String getPassword() {

        return this.password;
    }
}