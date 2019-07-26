package Utils;

import org.junit.Test;

/**
 * @author HeYi
 * @version V2.0
 * @Description: 身份证号（必须为18位）、手机号（必须为11位）和姓名（必须为中文）脱敏工具类
 * @date 2019/6/5 9:20
 */
public class SensitiveInfoUtils {

    /**
     * 身份证号码脱敏（生日信息隐藏、必须为18位）
     * @param idCardNo
     * @return
     */
    public String idCardTransform(String idCardNo){
        if (idCardNo == null){
            return idCardNo;
        }
        if (idCardNo.length() == 18){
            idCardNo = idCardNo.replaceAll("(\\d{6})\\d{8}(\\w{4})", "$1********$2");
        }
        return idCardNo;
    }

    /**
     * 手机号码脱敏（隐藏中间4位、必须为11位）
     * @param phoneNo
     * @return
     */
    public String phoneNoTransform(String phoneNo){
        if (phoneNo == null){
            return phoneNo;
        }
        if (phoneNo.length() == 11){
            phoneNo = phoneNo.replaceAll("(\\d{3})\\d{4}(\\w{4})", "$1****$2");
        }
        return phoneNo;
    }

    /**
     * 姓名脱敏（必须为中文）
     * @param name
     * @return
     */
    public String nameTransform(String name){
        if (name == null){
            return name;
        }
        StringBuffer sb = new StringBuffer(name);
        int length = name.length();
        if (length == 2){
            sb.replace(1, 2, "*");
            return sb.toString();
        }
        for (int i = 1, j = 2; j < length; ){
            sb.replace(i++, j++, "*");
        }
        return sb.toString();
    }

    @Test
    public void test(){
        String s = idCardTransform("50010219940308573X");
        System.out.println("身份证号码：  " + s);
        String s1 = phoneNoTransform("13224027330");
        System.out.println("手机号码：  " + s1);
        String s2 = nameTransform("手机号号码");
        System.out.println("姓名：  " + s2);
    }


}
