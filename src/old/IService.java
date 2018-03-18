/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package old;

import entity.Message;

/**
 * @author eason.li
 *
 */
public interface IService {
    public Message login(String usename, int password);
}
