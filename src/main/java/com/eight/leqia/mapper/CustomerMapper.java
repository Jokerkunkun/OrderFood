package com.eight.leqia.mapper;

import com.eight.leqia.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<Customer> findAll();

    /**
     * 禁用用户
     * @param CId
     * @return
     */
    int updateStatusForbidden(Integer CId);

    /**
     * 启用用户
     * @param CId
     * @return
     */
    int updateStatusStart(Integer CId);

    /**
     * 删除用户
     * @param CId
     * @return
     */
    int delete(Integer CId);

    /**
     * 根据name查询
     * @param UserName
     * @return
     */
    List<Customer> findNameAll(String UserName);

    /**
     * 根据选择的日期进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    List<Customer> findDateAll(String registration1,String registration2);

    /**
     * 根据选择的日期和name进行查询
     * @param registration1
     * @param registration2
     * @param UserName
     * @return
     */
    List<Customer> findDateNameAll(String registration1,String registration2,String UserName);

    /**
     * 查询总条数
     * @return
     */
    Customer findCount();

    /**
     * 删除用户
     * @return
     */
    int deleteS(Integer CId);
}
