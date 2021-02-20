package com.hzw.study.a_create_mode.singleton;

/**
 * @author huangzhiwei
 * @version 1.0
 * @description 懒汉式
 * @createTime 2021/2/20 4:45 PM
 */
public class Singleton2 {

  private static volatile Singleton2 INSTANCE = null;

  public static Singleton2 getInstance(){
    if (INSTANCE == null){
      synchronized (Singleton2.class){
        if (INSTANCE == null){
          INSTANCE = new Singleton2();
        }
      }
    }
    return  INSTANCE;
  }

  private Singleton2(){}



}
