/**
 * The contents of this file are copyright (c) 2017 by medavis GmbH, Karlsruhe, Germany
 */
package entity;


/**
 * @author eason.li
 *
 */
public class Message {
    private int code;
    private Object data;
    
    public Message(int code, Object data) {
        this.code = code;
        this.data = data;
    }
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    
}
