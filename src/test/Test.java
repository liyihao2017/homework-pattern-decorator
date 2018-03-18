/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package test;

import old.LoginService;
import upgrade.IThirdService;
import upgrade.ThirdService;

/**
 * @author eason.li
 *
 */
public class Test {
    public static void main(String[] args) {
        IThirdService iThirdService = new ThirdService(new  LoginService());
        iThirdService.loginByQQ("eason",123);
        System.out.println("login successfully");
    }
}
