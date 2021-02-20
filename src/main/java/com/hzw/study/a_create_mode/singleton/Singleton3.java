package com.hzw.study.a_create_mode.singleton;

/**
 * @author huangzhiwei
 * @version 1.0
 * @description 枚举方式创建单例
 * @createTime 2021/2/20 4:48 PM
 */
public enum Singleton3 {
  INSTANCE;


  public String getName(){
    return "world";
  }
}
