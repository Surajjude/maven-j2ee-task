package com.suraj.controller;

import java.util.Scanner;

import com.suraj.entity.Player;
import com.suraj.service.Service;

public class Controller {

	public static void main(String[] args) {
		Service service = new Service();
		
		Scanner sc = new Scanner(System.in);
		
		boolean pass = true;
		while(pass) {
			System.out.println("Enter 1.Get All Players    2.Add a Player   3.Update a Player   4.Delete a Player   5.Get Players By Team  6.End Program");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				service.getAllPlayers().forEach(player->System.out.println(player));
				break;
			
			case 2:
				System.out.println("Enter  Player id : ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Player Name : ");
				String pName = sc.nextLine();
				System.out.println("Enter Jersey No : ");
				int jNo = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Team Name : ");
				String tName = sc.nextLine();
				System.out.println("Enter Run : ");
				int run = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Wicket : ");
				int wicket = Integer.parseInt(sc.nextLine());
				Player p = new Player(id,pName,jNo,tName,run,wicket);
				
				if(service.addPlayer(p)) {
					System.out.println("Player Inserted Successfully");
				}else {
					System.out.println("Something Went Wrong");
				}
				break;
				
			case 3:
				service.getAllPlayers().forEach(player->System.out.println(player));
				System.out.println("\n\nEnter the Player ID : ");
				id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Player Name : ");
				pName = sc.nextLine();
				System.out.println("Enter Jersey No : ");
				jNo = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Team Name : ");
				tName = sc.nextLine();
				System.out.println("Enter Run : ");
				run = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Wicket : ");
				wicket = Integer.parseInt(sc.nextLine());
				p = new Player(id,pName,jNo,tName,run,wicket);
				
				if(service.updatePlayer(p))
					System.out.println("Player Updated Successfully");
				else
					System.out.println("Something went wrong");
				break;
				
			case 4:
				service.getAllPlayers().forEach(player->System.out.println(player));
				System.out.println("\n\nEnter Player ID to  Delete : ");
				id = Integer.parseInt(sc.nextLine());
				if(service.deletePlayer(id))
					System.out.println("Player Deleted Successfully");
				else
					System.out.println("Something went wrong");
				break;
				
			case 5:
				System.out.println("Enter the Team name: ");
				String team = sc.nextLine();
				service.getByTeam(team).forEach(item->System.out.println(item));
				break;
			
			case 6:
				pass = false;
				break;
				
			default:
				System.out.println("Enter valid choise");
			}
			
			
		}
	}

}
