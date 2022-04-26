package rsa.day2;

import java.io.Serializable;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 21:18
 */
public class Company implements Serializable {
    private static final long serialVersionUID = 5013503588334254778L;
    private String comanyName;

    public String getComanyName() {
        return comanyName;
    }

    public void setComanyName(String comanyName) {
        this.comanyName = comanyName;
    }
}
