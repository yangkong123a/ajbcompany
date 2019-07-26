package webServiceDemo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author HeYi
 * @version V2.0
 * @Description:
 * @date 2019/7/2 15:49
 */
@WebService     //定义服务
public interface WeatherService {

    @WebMethod      //定义方法
    public String getWeatherByCityname(String name);
}
