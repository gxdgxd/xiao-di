package com.xiaodi.qa.temp;

import java.io.Serializable;

/**
 * @Author xiaodi.gou
 * @create 2021/12/17 7:27 下午
 */
public class Order implements Cloneable, Serializable {
    private String code;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Order) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (code != null ? !code.equals(order.code) : order.code != null) return false;
        return name != null ? name.equals(order.name) : order.name == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
