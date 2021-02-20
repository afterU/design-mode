package com.hzw.study.a_create_mode.factory_method;

/**
 * @author huangzhiwei
 * @version 1.0
 * @description  工厂方法
 * @createTime 2021/2/20 5:30 PM
 */
public class FactoryMethod {

  //目标对象接口
  static interface Car{
    void driver();
  }

  static class BaoMa implements Car{
    @Override
    public void driver() {
      System.out.println("开宝马！");
    }
  }

  static class BenChi implements  Car{
    @Override
    public void driver() {
      System.out.println("开奔驰！");
    }
  }
  //抽象工厂
  static interface Factory{
    Car productCar(String car);
  }
  //实现工厂
  static class CarFactory implements Factory{
    @Override
    public Car productCar(String car) {
      if ("baoma".equals(car)){
        return new BaoMa();
      }else{
        return new BenChi();
      }
    }
  }


  public static void main(String[] args) {
    //工厂方法最终实现，创建对象和使用对象的分离
    Factory factory = new CarFactory();

    Car car = factory.productCar("");

    car.driver();
  }
}
