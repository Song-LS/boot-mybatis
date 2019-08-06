package com.sls.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author sls
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;

    private Integer companyId;

    private String userName;

    private Integer userAge;

    private Date createTime;
}
