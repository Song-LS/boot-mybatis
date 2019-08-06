package com.sls.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author sls
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    private Integer companyId;

    private String companyName;

    private List<User> userList;

    private Date createTime;
}
