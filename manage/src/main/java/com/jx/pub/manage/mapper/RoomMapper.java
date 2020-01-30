package com.jx.pub.manage.mapper;

import com.github.pagehelper.Page;
import com.jx.pub.common.dto.RoomPageSearchCon;
import com.jx.pub.common.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Faxon
 * @version 1.0
 * @date 2020-01-30 09:58
 **/
@Mapper
public interface RoomMapper {

    /**
     * 条件查询房间列表
     *
     * @param con
     * @return
     */
    Page<Room> getRoomListByCon(@Param("con") RoomPageSearchCon con);

    /**
     * 根据房间号获取数量
     *
     * @param roomNumber
     * @return
     */
    int getCountByRoomNumber(@Param("roomNumber") String roomNumber);

    /**
     * 添加房间
     *
     * @param room
     * @return
     */
    int addRoom(@Param("room") Room room);

    /**
     * 更新房间
     *
     * @param room
     * @return
     */
    int updateRoomById(@Param("room") Room room);

    /**
     * 删除单个房间
     *
     * @param roomId
     * @return
     */
    int deleteRoomById(@Param("roomId") String roomId);

    /**
     * 根据id获取房号
     *
     * @param roomId
     * @return
     */
    String getRoomNumberById(@Param("roomId") String roomId);
}
