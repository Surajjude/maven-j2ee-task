package com.suraj.service;

import java.util.List;

import com.suraj.dao.DAO;
import com.suraj.entity.Player;

public class Service {
	DAO dao = new DAO();
	
	public List<Player> getAllPlayers(){
		return dao.getAllPlayers();
	}

	public boolean addPlayer(Player p) {
		if(dao.addPlayer(p)>0) {
			return true;
		}else
			return false;
	}

	public boolean updatePlayer(Player p) {
		if(dao.updatePlayer(p)>0) {
			return true;
		}else
			return false;
	}


	public boolean deletePlayer(int id) {
		if(dao.deletePlayer(id)>0)
			return true;
		else
			return false;
	}

}