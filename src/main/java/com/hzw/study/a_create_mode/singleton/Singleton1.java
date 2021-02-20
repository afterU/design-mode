package com.hzw.study.a_create_mode.singleton;

/**
 * @author huangzhiwei
 * @version 1.0
 * @description  饿汉式单例
 * @createTime 2021/2/20 4:34 PM
 */
public class Singleton1 {

  /**
    * 1. 私有化构造方法
    * 2. 全局变量持有唯一实例
    * 3. 静态方法提供唯一实例
    */
  private static final Singleton1 INSTANCE = new Singleton1();

  public static Singleton1 getInstance(){

    return INSTANCE;
  }

  private Singleton1(){}

}
