package com.mmall.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class UserParam {

    private Integer id;

    @NotBlank(message = "用户名不能为空")
    @Length(min = 0, max = 20, message = "用户名长度需要在0-20之内")
    private String username;

    @NotBlank(message = "电话不能为空")
    @Length(min = 0, max = 11, message = "电话长度需要在0-11之内")
    private String telephone;

    @NotBlank(message = "邮箱不能为空")
    @Length(min = 5, max = 20, message = "邮箱长度需要在0-11之内")
    private String mail;

    @NotNull(message = "必须提供用户所在部门")
    private Integer deptId;

    @NotNull(message = "必须指定用户的状态")
    @Min(value = 0, message = "用户状态不合法")
    @Max(value = 2, message = "用户状态不合法")
    private Integer status;

    @Length(min = 0, max = 200, message = "备注长度需要在200个字以内")
    private String remark;

}
