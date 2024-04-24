package com.air.room.service;

import com.air.room.config.TokenInfo;
import com.air.room.dto.request.RoomRequest;
import com.air.room.dto.response.RoomInfoAllResponse;
import com.air.room.global.domain.entity.Room;

import java.util.List;

public interface RoomService {
    List<RoomInfoAllResponse> getAllRoom();
    RoomInfoAllResponse getRoomById(Integer userId);
    void addRoom(Integer userId, String userName, RoomRequest req);
    void updateRoom(Integer roomId, TokenInfo tokenInfo, RoomRequest req);
    void deleteRoom(Integer roomId);
}
