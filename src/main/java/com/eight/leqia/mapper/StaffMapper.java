package com.eight.leqia.mapper;

import com.eight.leqia.entity.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {
    List<Staff> findAll();

    int add(Staff staff);

    Staff findUpdate(int AdId);

    int update(Staff staff);

    int delete(int AdId);

    int updateStatusForbidden(int AdId);

    int updateStatusStart(int AdId);

    /**
     * 根据name查询
     * @param AUserName
     * @return
     */
    List<Staff> findNameAll(String AUserName);

    /**
     * 根据选择的日期进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    List<Staff> findDateAll(String registration1,String registration2);

    /**
     * 根据选择的日期和name进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    List<Staff> findDateNameAll(String registration1,String registration2,String AUserName);

    /**
     * 查询总条数
     * @return
     */
    Staff findCount();

    /**
     * 删除该员工
     * @param AdId
     * @return
     */
    int deleteS(Integer AdId);

}
