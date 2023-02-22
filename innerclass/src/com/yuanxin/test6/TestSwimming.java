package com.yuanxin.test6;

public class TestSwimming {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁, 我们去游泳吧");
            }
        });
    }

    /**
     * 使用接口的方法
     */
    public static void goSwimming(Swimming swimming){
        /*
            Swimming swimming = new Swimming() {
                @Override
                public void swim() {
                    System.out.println("铁汁, 我们去游泳吧");
                }
            }
         */
        swimming.swim();
    }
}

/*
    游泳接口
 */
interface Swimming {
    void swim();
}
