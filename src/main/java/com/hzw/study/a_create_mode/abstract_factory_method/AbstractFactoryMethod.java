package com.hzw.study.a_create_mode.abstract_factory_method;

/**
 * @author huangzhiwei
 * @version 1.0
 * @description 抽象工厂方法，是工厂方法的升级，是为了是创建工厂和一组产品的生成和使用分离
 * @createTime 2021/2/20 6:20 PM
 */
public class AbstractFactoryMethod {

  // 抽象工厂扩展新的供应商是简单的，但是如果扩展工厂，使工厂能生产其他的商品是复杂的破坏了，开闭原则

  //抽象工厂
  interface AbstractFactory{

      Phone createPhone();

      Compute createCompute();

      public static AbstractFactory createFactory(String factory){
        if ("miaomi".equals(factory)){
          return new XiaoMiFactory();
        }else {
          return new AppleFactory();
        }
      }


  }
  
  //抽象工厂的具体供应商
  static class AppleFactory implements AbstractFactory{

    @Override
    public Phone createPhone() {
      return new ApplePhone();
    }

    @Override
    public Compute createCompute() {
      return new AppleCompute();
    }
  }

  static class XiaoMiFactory implements AbstractFactory{

    @Override
    public Phone createPhone() {
      return new XiaoMiPhone();
    }

    @Override
    public Compute createCompute() {
      return new XiaoMiCompute();
    }
  }

  //手机
  interface Phone{
    void call();
  }
  //电脑
  interface Compute{
    void playGame();
  }

  //抽象手机的具体实现
  static class ApplePhone implements Phone{

    @Override
    public void call() {
      System.out.println("iPhone call");
    }
  }
  static class  XiaoMiPhone implements  Phone{

    @Override
    public void call() {
      System.out.println("xiaomiPhone call");
    }
  }

  static class AppleCompute implements Compute{

    @Override
    public void playGame() {
      System.out.println("appleCompute playgame");
    }
  }

  static class XiaoMiCompute implements  Compute{

    @Override
    public void playGame() {
      System.out.println("xiaomiCompute playgame");
    }
  }



}
