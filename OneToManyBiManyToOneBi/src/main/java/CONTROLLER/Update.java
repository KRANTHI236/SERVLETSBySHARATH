package CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import DAO.LogicDao;
import DTO.ChairDto;
import DTO.RoomDto;

public class Update {
	public static void main(String[] args) {

		RoomDto rd = new RoomDto();
		rd.setroomId(1);
		rd.setroomName("sql");
		rd.setroomFloor(4);

		ChairDto cd = new ChairDto();
		cd.setChairColour("white");
		cd.setChairCompany("mno");
		cd.setChairId(20);

//		ChairDto cd1 = new ChairDto();
//		cd1.setChairId(30);
//		cd1.setChairCompany("winner");
//		cd1.setChairColour("cream");

		List<ChairDto> c = new ArrayList<ChairDto>();
		c.add(cd);

		rd.setChairdto(c);

		LogicDao lc = new LogicDao();
		lc.updateBoth(1, rd);

	}

}
