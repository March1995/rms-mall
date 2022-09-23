package com.wyb.rms.mvc.advice;

import com.wyb.rms.common.vo.CommonResponse;
import com.wyb.rms.mvc.annotation.IgnoreResponseAdvice;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Description: 实现统一响应
 *
 * @author: Marcher丶
 * @Date: 2022-08-08 22:36
 **/
@RestControllerAdvice(value = "com.wyb.rms")
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {


    /**
     * 判断是否需要对响应进行处理
     */
    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class)) {
            return false;
        }

        if (methodParameter.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class)) {
            return false;
        }
        return true;
    }

    @Override
    @SuppressWarnings("all")
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        CommonResponse<Object> response = new CommonResponse<>(0, "");
        if (null == o) {
            return response;
        } else if (o instanceof CommonResponse) {
            response = (CommonResponse<Object>) o;
        } else {
            response.setData(o);
        }

        return response;
    }
}
