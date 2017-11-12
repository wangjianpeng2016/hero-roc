package com.iframe.base.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 最大值: Integer.MAX_VALUE = 2147483647 = 2的32次 -1
 * 最小值: Integer.MIN_VALUE = 2147483647 = -2的32次
 */
@MappedSuperclass
public class IdEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_")
    protected Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}