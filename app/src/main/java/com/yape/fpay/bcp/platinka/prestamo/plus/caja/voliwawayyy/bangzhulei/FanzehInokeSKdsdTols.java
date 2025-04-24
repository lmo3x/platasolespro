package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.bangzhulei;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class FanzehInokeSKdsdTols {


    /**
     * 根据抽象类泛型获取Class类
     * @param wanduixiang
     * @return
     */
    public static <T> Type getFanzheLeiFulei(Object wanduixiang, int i) throws Exception{
            Class<?> aClass = wanduixiang.getClass();//先得到类的字节码
            Type fulei = aClass.getGenericSuperclass();//当前运行类的父类(RequestListener<T>，以为Person例，RequestListener<Person>)
            if (null != fulei && fulei instanceof ParameterizedType) {
                ParameterizedType leixinghahssss = (ParameterizedType) fulei;// 强制转化“参数化类型”
                Type[] shijileixingcasnhu = leixinghahssss.getActualTypeArguments();// 参数化类型中可能有多个泛型参数
                if (shijileixingcasnhu != null && shijileixingcasnhu.length > i) {
                    //获取数据的第一个元素(User.class)
                    return shijileixingcasnhu[i];
                }
            }
            return null;
    }



    /**
     * 根据接口泛型获取Class类
     * @param wanduixiang
     * @return
     */
    public static <T> Type huoquJeikouleixing(Object wanduixiang, int i) {
        try {
            Class<?> leizijie = wanduixiang.getClass();//先得到类的字节码
                /*
                返回表示由此对象表示的类或接口直接实现的接口的类型。
                如果超级接口是一个参数化类型，返回的Type对象必须准确地反映源代码中使用的实际类型参数。代表每个超级界面的参数化类型是在之前没有创建的情况下创建的。有关参数化类型的创建过程的语义，请参阅ParameterizedType的声明。
                如果此对象表示一个类，则返回值是一个包含表示由类实现的所有接口的对象的数组。数组中接口对象的顺序对应于该对象表示的类的声明的implements子句中的接口名称的顺序。在数组类中，接口Cloneable和Serializable按照这个顺序返回。
                如果此对象表示一个接口，则该数组包含表示由该接口直接扩展的所有接口的对象。数组中接口对象的顺序对应于该对象表示的接口声明的extends子句中接口名称的顺序。
                如果此对象表示不实现接口的类或接口，则该方法返回长度为0的数组。
                如果这个对象表示一个原始类型或void，则该方法返回一个长度为0的数组。
                * */
            Type[] jiekouleissss = leizijie.getGenericInterfaces();
            ParameterizedType canshuleixingsass = (ParameterizedType) jiekouleissss[0];
            Type[] shijieleixingcanshu = canshuleixingsass.getActualTypeArguments();
//            Class<T> reponseClass = (Class) actualTypeArguments[0];
            if (shijieleixingcanshu != null && shijieleixingcanshu.length > i) {
                //获取数据的第一个元素(User.class)
                return shijieleixingcanshu[i];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
