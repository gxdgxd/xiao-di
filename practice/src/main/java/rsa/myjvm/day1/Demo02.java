package rsa.myjvm.day1;

import java.util.ArrayList;

public class Demo02 {

    byte[] bytes = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {

        ArrayList<Demo02> arrayList = new ArrayList<>();
        int cout = 0;
        try {
            while (true) {
                arrayList.add(new Demo02());
                cout = cout + 1;
            }
        }catch (Error e){
            System.out.println("count" + cout);
            e.printStackTrace();
        }


    }
}
