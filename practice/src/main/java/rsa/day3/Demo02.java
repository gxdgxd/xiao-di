package rsa.day3;


/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 23:01
 */
public class Demo02 {
    public static void main(String[] args) {

//        int[] a = {1, 2, 3, 4};
//        System.out.println(a[0]);
//        change(a);
//        System.out.println(a[0]);

        Person person = new Person();
        Person xiaoZhang = new Person("小张");
        Person xiaoLi = new Person("小李");
        swap(xiaoZhang, xiaoLi);
        System.out.println("xiaoZhang:" + xiaoZhang.getName());
        System.out.println("xiaoLi:" + xiaoLi.getName());


    }

    public static void swap(Person person1, Person person2) {
        Person temp = person1;
        person1 = person2;
        person2 = temp;
        System.out.println("person1:" + person1.getName());
        System.out.println("person2:" + person2.getName());
    }
}
