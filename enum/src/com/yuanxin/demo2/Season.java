package com.yuanxin.demo2;

public enum Season {

    SPRING("春"){

        //如果枚举类中有抽象方法
        //那么在枚举项中必须要全部重写
        @Override
        public void show() {
            System.out.println(this.name);
        }

    },

    SUMMER("夏"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    AUTUMN("秋"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    WINTER("冬"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    };


    public String name;


    //空参构造
    private Season(){}

    //有参构造
    private Season(String name){
        this.name = name;
    }

    //抽象方法，枚举项必须重写该方法
    public abstract void show();
}
