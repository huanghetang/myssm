package com.usermanage.mapper;

import com.usermanage.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> queryAll();
}
