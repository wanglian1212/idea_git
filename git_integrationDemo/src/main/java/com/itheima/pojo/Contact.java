package com.itheima.pojo;

/**
 * @Description
 * @Author WangL
 * @Version V1.0.0
 * @Date 2019/10/24 18:36
 */
public class Contact {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
