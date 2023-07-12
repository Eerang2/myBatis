package hello.myBatis.service;

import hello.myBatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public ArrayList<HashMap<String, Objects>> findAll() {
        return userMapper.findAll();
    }
}
