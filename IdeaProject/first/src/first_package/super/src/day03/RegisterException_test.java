package day03;

import javax.security.auth.login.LoginException;

public class RegisterException_test {
    public static String[] names={"wang","li","huang"};
    public static void main(String[] args) {
        try{
            check("li");
        }catch(RegisterException e){
            e.printStackTrace();
        }
    }

    public static void check(String a) throws RegisterException{
        for (String b:
             names) {
                if(b.equals(a))
                {
                    throw new RegisterException("名字重复了");
                }

        }
    }
}
