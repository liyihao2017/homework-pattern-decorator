/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package old;

import entity.Message;


/**
 * @author eason.li
 *
 */
public class LoginService implements IService {

    @Override
    public Message login(String usename, int password) {
        return new Message(200, "login successfully");
    }

}
