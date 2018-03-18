/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package upgrade;

import entity.Message;

/**
 * @author eason.li
 *
 */
public interface IThirdService {
    Message loginByQQ(String username, int password);
    Message loginByWeibo(String username, int password);
}
