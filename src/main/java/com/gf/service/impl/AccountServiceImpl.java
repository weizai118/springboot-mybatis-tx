package com.gf.service.impl;

import com.gf.mapper.AccountMapper;
import com.gf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Title: AccountServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-04-01 10:13
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public void transfer() {
        accountMapper.update(90,1);
        int i = 1/0;
        accountMapper.update( 110,2 );
    }
}
