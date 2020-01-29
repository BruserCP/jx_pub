package com.jx.pub.manage.mapper;

import com.jx.pub.common.pojo.RoomType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Faxon
 * @version 1.0
 * @date 2020-01-29 15:29
 **/
@Mapper
public interface RoomTypeMapper {

    /**
     * 获取所有房型
     *
     * @return
     */
    List<RoomType> getRoomTypeList();

    /**
     * 添加房型
     *
     * @param roomType
     * @return
     */
    int addRoomType(@Param("roomType") RoomType roomType);

    /**
     * 修改房型
     *
     * @param roomType
     * @return
     */
    int updateRoomTypeById(@Param("roomType") RoomType roomType);

    /**
     * 删除房型
     *
     * @param typeId
     * @return
     */
    int deleteRoomTypeById(@Param("typeId") String typeId);

    /**
     * 根据名称获取数量
     *
     * @param typeName
     * @return
     */
    int getCountByTypeName(@Param("typeName") String typeName);
}