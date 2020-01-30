package com.jx.pub.manage.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jx.pub.common.dto.PageBean;
import com.jx.pub.common.dto.RoomPageSearchCon;
import com.jx.pub.common.pojo.Room;
import com.jx.pub.common.util.IDUtil;
import com.jx.pub.common.util.TimeUtil;
import com.jx.pub.manage.mapper.RoomMapper;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Faxon
 * @version 1.0
 * @date 2020-01-30 09:58
 **/
@Service
public class RoomService {

    @Resource
    RoomMapper roomMapper;

    /**
     * 分页条件查询房间列表
     *
     * @param con
     * @return
     */
    public PageBean<Room> getRoomPageByCon(RoomPageSearchCon con) {
        if (con.getPage() < 1) {
            con.setPage(1);
        }
        if (con.getSize() < 0) {
            con.setSize(10);
        }
        PageHelper.startPage(con.getPage(), con.getSize());
        Page<Room> page = roomMapper.getRoomListByCon(con);
        PageBean<Room> pageBean = new PageBean<>(page.getPageNum(), page.getPageSize(), page.getResult(), page.getTotal());
        return pageBean;
    }

    /**
     * 检查房间号是否重复
     *
     * @param roomNumber
     * @return
     */
    public boolean checkRoomNumber(String roomNumber) {
        int count = roomMapper.getCountByRoomNumber(roomNumber);
        return count == 0;
    }

    /**
     * 添加房间
     *
     * @param room
     * @return
     */
    public boolean addRoom(Room room) {
        room.setRoomId(IDUtil.getUUID());
        room.setRoomStatus("0");
        room.setRoomCreatTime(TimeUtil.getNowTime());
        room.setRoomUpdateTime(TimeUtil.getNowTime());
        int i = roomMapper.addRoom(room);
        return i == 1;
    }

    public String getRoomNumberById(String roomId){
        return roomMapper.getRoomNumberById(roomId);
    }

    /**
     * 更新房间
     *
     * @param room
     * @return
     */
    public boolean updateRoomById(Room room) {
        room.setRoomUpdateTime(TimeUtil.getNowTime());
        int i = roomMapper.updateRoomById(room);
        return i == 1;
    }

    /**
     * 根据id删除房间
     * @param roomId
     * @return
     */
    public boolean deleteRoomById(String roomId) {
        int i = roomMapper.deleteRoomById(roomId);
        return i == 1;
    }
}
