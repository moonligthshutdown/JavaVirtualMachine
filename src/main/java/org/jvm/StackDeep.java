package org.jvm;

/**
 * @ClassName StackDeep
 * @Description: 栈最大调用深度 使用JVM参数 -Xss 来指定线程最大栈空间
 * <p>线程的基本行为是函数调用，每次函数调用都会生成对应的 栈帧 。
 *         <br/> 如果栈空间不足就会报错: java.lang.StackOverflowError</p>
 **/
public class StackDeep {

    private static int count = 0;

    public static void recursiong() {
        count ++;
        recursiong();
    }

    public static void main(String[] args) {
        try{
            recursiong();
        }catch (Throwable throwable){
            System.out.println("deep of calling = " + count);
            throwable.printStackTrace();
        }
    }
}
