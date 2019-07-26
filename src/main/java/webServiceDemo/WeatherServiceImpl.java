package webServiceDemo;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/2 15:52
 */
public class WeatherServiceImpl implements WeatherService {

    @Override
    public String getWeatherByCityname(String name) {
        System.out.println(name + "天气晴朗。");
        return name + "天气晴朗";
    }
}
