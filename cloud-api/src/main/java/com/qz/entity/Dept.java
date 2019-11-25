package com.qz.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Dept implements Serializable {
    private Long deptno;// 主键
    private String dname;// 部门名称
    private String db_source;// 来自哪个数据库 -> 微服务可以一个服务对应一个数据库，同一个信息存储到不同数据库

}
