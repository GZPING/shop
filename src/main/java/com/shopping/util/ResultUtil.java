package com.shopping.util;

import com.shopping.domain.Result;

/**
 * Created by GD on 2017/9/11.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg,Object object){
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }
}
