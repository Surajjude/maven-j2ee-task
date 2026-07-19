package com.suraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.suraj.entity.Player;
import com.suraj.utility.DBUtility;

public class DAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public List<Player> getAllPlayers() {
		conn = DBUtility.getConnection();
		try {
			ps = conn.prepareStatement("SELECT * FROM players");
			rs = ps.executeQuery();
			List<Player> players = new ArrayList<>();
			Player p = null;
			while (rs.next()) {
				p = new Player(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				players.add(p);
			}
			return players;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public int addPlayer(Player p) {
		conn = DBUtility.getConnection();

		try {
			ps = conn.prepareStatement("INSERT INTO players VALUES (?,?,?,?,?,?)");
			ps.setInt(1, p.getId());
			ps.setString(2, p.getpName());
			ps.setInt(3, p.getjNo());
			ps.setString(4, p.gettName());
			ps.setInt(5, p.getRun());
			ps.setInt(6, p.getWicket());

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int updatePlayer(Player p) {
		conn = DBUtility.getConnection();

		try {
			ps = conn.prepareStatement("UPDATE  players SET "
					+ "pname = ?, jno = ?, tname = ?, run = ?, wicket = ? "
					+ "WHERE id = ? ");
			ps.setInt(6, p.getId());
			ps.setString(1, p.getpName());
			ps.setInt(2, p.getjNo());
			ps.setString(3, p.gettName());
			ps.setInt(4, p.getRun());
			ps.setInt(5, p.getWicket());

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public int deletePlayer(int id) {
		conn = DBUtility.getConnection();

		try {
			ps = conn.prepareStatement("DELETE FROM players WHERE id = ?");
			ps.setInt(1, id);

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	
}