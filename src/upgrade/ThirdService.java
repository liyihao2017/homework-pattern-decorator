/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package upgrade;

import entity.Message;
import old.IService;


/**
 * @author eason.li
 *
 */
public class ThirdService implements IThirdService {
    
    private IService iService;
    
    public ThirdService(IService iService) {
        this.iService = iService;
    }
    
    @Override
    public Message loginByQQ(String username, int password) {
        return iService.login(username, password);
        
    }

    @Override
    public Message loginByWeibo(String username, int password) {
        return null;
    }

}
