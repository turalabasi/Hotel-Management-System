package service.impl;

import data.GlobalData;
import helper.ServiceHelper;
import model.Customer;
import model.Room;
import service.RoomService;
import util.InputUtil;

import java.util.List;

import static data.GlobalData.roomList;

public class IRoomService implements RoomService {
    @Override
    public void RegisterRoom() {
          int count = InputUtil.getInstance().inputInt("Enter count to register : ");
        for (int i = 0; i < count; i++) {
        Room room = ServiceHelper.fillRoom();
            if (room != null){
                roomList.add(room);
            }

            
        }
    }

    @Override
    public void showRoomInfo() {
        for (Room room : roomList) {
            System.out.println(room);
        }
    }
}
