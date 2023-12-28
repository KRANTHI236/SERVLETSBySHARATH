package CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import DAO.LogicDao;
import DTO.ChairDto;
import DTO.RoomDto;

public class SaveBoth {

	public static void main(String[] args) {
		RoomDto rd = new RoomDto();
		rd.setroomId(1);
		rd.setroomName("java");
		rd.setroomFloor(5);

		ChairDto cd = new ChairDto();
		cd.setChairId(1);
		cd.setChairCompany("xyz");
		cd.setChairColour("red");

		ChairDto cd1 = new ChairDto();
		cd1.setChairId(2);
		cd1.setChairCompany("pqr");
		cd1.setChairColour("yeah");

		List<ChairDto> cd2 = new ArrayList<>();
		cd2.add(cd1);
		cd2.add(cd);

		rd.setChairdto(cd2);
		LogicDao lc = new LogicDao();
		lc.insertBoth(rd);

	}

}
