package Driver;



/*
    登录教师空间
    param：name，password
 */
public class LoginEvent {

    public void Loginevent(String name, String password){
        Login login = new Login();
        login.setName(name);
        login.setPassword(password);
        login.clickLogin();
    }
}
