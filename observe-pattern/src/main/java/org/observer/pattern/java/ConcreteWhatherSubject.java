package org.observer.pattern.java;

import java.util.Observable;

/**
 * 具体的 主题/目标实现
 * 		继承自 jdk 提供的 主题类
 * @author William Cheng
 * 2016年9月3日-下午7:35:49
 */
public class ConcreteWhatherSubject extends Observable {
	//天气情况
	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		
		//采用 java 中的 observer 模式时候，此代码必不可少
		this.setChanged();
		
		//this.notifyObservers();	//1. 拉模型
		
		this.notifyObservers(content); //2. 推模型
	}
}
