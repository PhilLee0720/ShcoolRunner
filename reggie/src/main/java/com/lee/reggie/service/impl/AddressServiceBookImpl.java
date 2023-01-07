package com.lee.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.reggie.dao.AddressBookMapper;
import com.lee.reggie.pojo.AddressBook;
import com.lee.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceBookImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
