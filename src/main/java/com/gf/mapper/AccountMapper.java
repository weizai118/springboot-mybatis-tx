package com.gf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>Title: AccountMapper</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-04-01 10:09
 */
@Mapper
public interface AccountMapper {

    int update(@Param("money") double money, @Param("id") int  id);

}
