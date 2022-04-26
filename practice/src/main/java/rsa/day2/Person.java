package rsa.day2;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 18:57
 */
@Data
public class Person extends Company implements Serializable {
    private static final long serialVersionUID = 3871434686336925818L;

    private transient String name;
    private int age;
}
