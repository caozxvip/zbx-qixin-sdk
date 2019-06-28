package com.qixin.openapi.client.common;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory
{
    public static <T> T create(final Class<T> cls) {
        return (T)Proxy.newProxyInstance(cls.getClassLoader(), new Class[] { cls }, new InvokerProxy());
    }
    
    static class InvokerProxy implements InvocationHandler
    {
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
            final Api api = method.getAnnotation(Api.class);
            String methodName = method.getName();
            if (api != null && api.value() != null && api.value().trim().length() > 0) {
                methodName = api.value();
            }
            final int pc = method.getParameterTypes().length;
            if (pc == 1) {
                return RemoteInvoker.invoke(method.getGenericReturnType(), methodName, args[0]);
            }
            return RemoteInvoker.invoke(method.getGenericReturnType(), methodName, args);
        }
    }
}
