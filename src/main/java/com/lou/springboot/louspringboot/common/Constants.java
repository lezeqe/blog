package com.lou.springboot.louspringboot.common;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link http:13blog.site
 * 单独写一个常量类Constants用来保存固定的常量，这些常量在代码调用过程中值又容易发生改变的等等情况，此时不必在代码中修改值，直接在该类中修改即可，方便使用
 * 常量名称一般全部用大写字母表示
 */
public class Constants {

    public static final int RESULT_CODE_SUCCESS = 200;  // 成功处理请求
    public static final int RESULT_CODE_BAD_REQUEST = 412;  // 请求错误
    public static final int RESULT_CODE_NOT_LOGIN = 402;  // 未登录
    public static final int RESULT_CODE_PARAM_ERROR = 406;  // 传参错误
    public static final int RESULT_CODE_SERVER_ERROR = 500;  // 服务器错误
}
