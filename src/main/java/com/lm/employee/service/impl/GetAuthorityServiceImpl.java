package com.lm.employee.service.impl;

import com.lm.employee.entity.Auth;
import com.lm.employee.entity.Role;
import com.lm.employee.mapper.AuthMapper;
import com.lm.employee.service.GetAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class GetAuthorityServiceImpl implements GetAuthorityService {

    @Autowired
    private AuthMapper authMapper;

    @Override
    public List<Auth> selectByEmplId(String emplId) {
//        List<Auth> authList=authMapper.selectAuth(emplId);
//        return authList;
        //获取用户所有权限（父、子权限）
        List<Auth> authList=authMapper.selectAuth(emplId);
        //保存所有的父权限
        List<Auth> root=new ArrayList<>();
        //遍历所有菜单集合，如果是主菜单的话，直接放入root集合
        for (Auth auth : authList){
            //pid为0,则为父权限
            if (auth.getPId().equals("0")){
                root.add(auth);
            }
        }
        //这个是遍历所有主菜单，分别获取所有主菜单的所有子菜单
        for (Auth auth : root){
            //获取所有子菜单，递归
            List<Auth> childrenList=getChildrenAuth(auth.getAuthId(),authList);
            //这个是实体类中的子菜单集合
            auth.setChildren(childrenList);
        }
        return root;
    }




    //递归获取子菜单
    public List<Auth> getChildrenAuth(String id,List<Auth> allAuth){
        //用于保存子菜单
        List<Auth> childrenList=new ArrayList<>();
        for (Auth info : allAuth){
            //判断当前菜单标识是否等于父id
            if (info.getPId().equals(id)){
                //如果是的话，就放入主菜单对象的子菜单集合
                childrenList.add(info);
            }
        }
        //这里就是递归了，遍历所有的子菜单
        for (Auth info : childrenList){
            info.setChildren(getChildrenAuth(info.getAuthId(),allAuth));
        }
        //如果子菜单为空的话，那就说明菜单下面没有子菜单了，直接返回空，子菜单为空的话就不会继续迭代了
        if (childrenList!=null && childrenList.size()==0){
            return  null;
        }
        return childrenList;
    }
}
