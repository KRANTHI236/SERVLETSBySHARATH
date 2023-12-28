package DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RoomDto {
	@Id

	private int roomId;
	private String roomName;
	private int roomFloor;

	@OneToMany
	private List<ChairDto> chairdto;

	public List<ChairDto> getChairdto() {
		return chairdto;
	}

	public void setChairdto(List<ChairDto> chairdto) {
		this.chairdto = chairdto;
	}

	public int getroomId() {
		return roomId;
	}

	public void setroomId(int roomId) {
		this.roomId = roomId;
	}

	public String getroomName() {
		return roomName;
	}

	public void setroomName(String roomName) {
		this.roomName = roomName;
	}

	public int getroomFloor() {
		return roomFloor;
	}

	public void setroomFloor(int roomFloor) {
		this.roomFloor = roomFloor;
	}

	@Override
	public String toString() {
		return "RoomDto [roomId=" + roomId + ", roomName=" + roomName + ", roomFloor=" + roomFloor + ",]";
	}

}
