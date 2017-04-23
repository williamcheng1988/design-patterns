package org.observer.pattern.weather;


public class ConcreteWeatherSubject extends WeatherSubject {

	//目标对象的状态
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//内容有了，说明天气更新了，通知所有人
		this.notifyObservers();
	}
}
