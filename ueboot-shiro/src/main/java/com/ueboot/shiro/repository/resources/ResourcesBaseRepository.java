/*
* Copyright (c)  2018
* All rights reserved.
* 2018-08-22 19:58:32
*/
package com.ueboot.shiro.repository.resources;

import com.ueboot.shiro.entity.Resources;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
* 1.这里可以写基于StringQuery方式的自定义的接口，但是需要在实现类ResourcesRepositoryImpl当中进行实现，
* 2.如果使用Spring Data JPA语法，则写到ResourcesRepository接口当中
* 3.Service类注入接口时直接注入 ResourcesRepository接口即可，当前接口不需要注入
* Created on 2018-08-22 19:58:32
* @author yangkui
* @since 2.1.0 by ueboot-generator
*/
public interface ResourcesBaseRepository  {

    /**
     * 根据parentId查找分页数据
     * @param pageable 分页数据
     * @param parentId parentId
     * @return Page<Resources>
     */
    Page<Resources> findByParentId(Pageable pageable, Long parentId);
}