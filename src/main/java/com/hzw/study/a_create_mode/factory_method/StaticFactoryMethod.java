package com.hzw.study.a_create_mode.factory_method;

/**
 * @author huangzhiwei
 * @version 1.0
 * @description 静态工厂方法，在工厂方法的基础上，省略抽象工厂，在实现工厂将将创建对象的方法设置为静态方法，避免创建工厂类的实例
 * @createTime 2021/2/20 5:39 PM
 */
public class StaticFactoryMethod {
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
  //实现工厂
  static class CarFactory {

    public static Car productCar(String car) {
      if ("baoma".equals(car)){
        return new BaoMa();
      }else{
        return new BenChi();
      }
    }
  }


  public static void main(String[] args) {
    //工厂方法最终实现，创建对象和使用对象的分离
    Car car = CarFactory.productCar("");

    car.driver();
  }
}
