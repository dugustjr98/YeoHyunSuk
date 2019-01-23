package my.examples.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class DynamicPorxyInstance01 {
    public static void main(String[] args){
        Map proxyInstance = (Map) Proxy.newProxyInstance(
                DynamicPorxyInstance01.class.getClassLoader(),
                new Class[] { Map.class },
                new DynamicInvocationHandler());

        proxyInstance.put("hello", "world");
        System.out.println(proxyInstance.get("hello"));
    }
}

class DynamicInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("메소드 실행 : " +  method.getName());
        return "haha";
    }
}