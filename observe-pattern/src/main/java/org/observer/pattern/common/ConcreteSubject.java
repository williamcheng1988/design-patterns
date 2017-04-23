package org.observer.pattern.common;

/**
 * 具体的主题类: 提供状态参数
 * @author William Cheng
 * 2016年9月3日-下午6:10:38
 */
public class ConcreteSubject extends Subject {

	//主题的状态
	private String subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();//推模型
		//this.notifyObservers(subjectState);拉模型
	}
}
