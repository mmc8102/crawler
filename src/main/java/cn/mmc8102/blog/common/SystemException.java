package cn.mmc8102.blog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 16282
 * 自定义异常
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemException extends RuntimeException {

    private ApiResponseEnum responseEnum;

    private Object[] args;

    public SystemException(ApiResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

}
