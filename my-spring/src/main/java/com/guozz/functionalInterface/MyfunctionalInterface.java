package com.guozz.functionalInterface;

/**
 * 函数式接口
 *   函数式接口是只包含一个方法的接口。
 *   @FunctionalInterface作为注解,这个注解是非必须的，只要接口符合函数式接口的标准（即只包含一个方法的接口），虚拟机会自动判断，
 *   但 最好在接口上使用注解@FunctionalInterface进行声明，以免团队的其他人员错误地往接口中添加新的方法。
 */
@FunctionalInterface
public interface MyfunctionalInterface {

	public void method(int a,int b);


}
