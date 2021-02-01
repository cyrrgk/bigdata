package xyz.maxwells.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.maxwells.bigdata.dao.UserJpa;
import xyz.maxwells.bigdata.domain.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserJpa dao;
    @Override
    public List<User> findall() {
        return dao.findAll();
    }
}
