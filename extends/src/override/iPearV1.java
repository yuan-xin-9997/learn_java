package override;

public class iPearV1 {
    /*
        1. 定义手机类 iPearV1
                    call(String name) : 打电话方法
                    smallBlack() : 语音助手 (speak english...)
     */
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void smallBlack(){
        System.out.println("speak english...");
    }
}
