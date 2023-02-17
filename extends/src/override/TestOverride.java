package override;

public class TestOverride {
    /*
        需求:

            1. 定义手机类 iPearV1
                    call(String name) : 打电话方法
                    smallBlack() : 语音助手 (speak english...)

            2. 定义新手机类 iPearV2
                    call(String name) : 打电话方法
                    smallBlack() : 语音助手 (speak english...  说中文)

        方法重写的应用场景:
            当子类需要父类的功能，而功能主体子类有自己特有内容
            可以重写父类中的方法，这样，即沿袭了父类的功能，又定义了子类特有的内容

        注意:
            方法重写: 在继承体系中, 子类出现了和父类一模一样的方法声明 (方法名, 参数列表, 返回值类型)
            方法重载: 在同一个类中, 方法名相同, 参数列表不同, 与返回值无关.
     */
    public static void main(String[] args) {
        iPearV2 i = new iPearV2();
        i.smallBlack();
    }
}
