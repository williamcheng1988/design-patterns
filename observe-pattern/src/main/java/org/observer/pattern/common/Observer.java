package org.observer.pattern.common;

/**
 * 观察者接口：
 *		提供 更新的接口给需要(在目标状态改变时)通知的观察者
 * @author William Cheng
 * 2016年9月3日-下午6:25:43
 */
public interface Observer {

	/**
	 * 拉模型
	 */
	public void push(Subject subject);
	
	/**
	 * 推模型
	 */
	public void pull(String msg);
}
