package com.xingtan.account.bean;

import com.xingtan.common.entity.UserSexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhengweiliang
 * @Date 2018/4/26 13:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Child implements Serializable {
    private Long id;
    private String headImage;
    private String realName;
    private String enName;
    private UserSexEnum sex;
    private Date birthday;
}
