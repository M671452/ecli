package Exercise3;

public class WeatherAdviser {

	public String provideWeatherAdvisory(int temperature) {
		// TODO: provide a weather advisory message based on the temperature
		if (temperature < 0) {
			return "It is freezing! Wear a warm coat.";
		}
		if (temperature <= 10) {
			return "It is cold! Bundle up.";
		}
		if (temperature <= 20) {
			return "It is cool! A light jacket will do";
		}
		if (temperature > 20) {
			return "It is warm! Enjoy the day.";
		}
		return "It is hot outside.";
	}

}
