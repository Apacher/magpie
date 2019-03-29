package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *     数据校验工具类
 * </p>
 *
 * @description: 主要校验数据判空,格式是否正确等
 * @author: EM
 * @createDate: 2019/3/30
 */
public class ValidUtil {

    /**
     * 判断字符串是否为空
     * @param value
     * @return
     */
    public static boolean isNull(String value){
        if(null == value){
            return true;
        }
        if("".equals(value.trim())){
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否非空
     * @param value
     * @return
     */
    public static boolean isNotNull(String value){
        return isNull(value) ? false : true;
    }

    /**
     * 判断数组是否为空
     * @param value
     * @return
     */
    public static boolean isNull(Object[] value){
        if(null == value){
            return true;
        }
        if(value.length==0){
            return true;
        }
        return false;
    }

    /**
     * 判断数组是否非空
     * @param value
     * @return
     */
    public static boolean isNotNull(Object[] value){
        return isNull(value) ? false : true;
    }

    /**
     * 判断集合是否为空
     * @param value
     * @return
     */
    public static boolean isNull(List<?> value){
        if(null == value){
            return true;
        }
        if(value.size()==0){
            return true;
        }
        return false;
    }

    /**
     * 判断集合是否非空
     * @param value
     * @return
     */
    public static boolean isNotNull(List<?> value){
        return isNull(value) ? false : true;
    }

    /**
     * 判断map是否为空
     * @param value
     * @return
     */
    public static boolean isNull(Map value){
        if(null == value){
            return true;
        }
        if (value.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     * 判断map是否非空
     * @param value
     * @return
     */
    public static boolean isNotNull(Map value){
        return isNull(value) ? false : true;
    }

    public static void main(String[] args) {
        Map<String,String> a = new HashMap<>();
        System.out.println(isNull(a));
    }
}
