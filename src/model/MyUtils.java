package model;

import java.util.*;
import model.Auction;

public class MyUtils {
	public ArrayList<Auction> getAuctionByAsctime(ArrayList<Auction> auction) {
		ArrayList<Auction> temp = auction;
		Auction auctionTemp = new Auction();
		for (int i = 0; i < temp.size() - 1; i++) {
			for (int j = 1; j < temp.size() - i; j++) {
				if (temp.get(j - 1).getAuctionTime()
						.compareTo(temp.get(j).getAuctionTime()) > 0) {
					auctionTemp = temp.get(j - 1).clone();
					temp.set(j - 1, temp.get(j).clone());
					temp.set(j, auctionTemp);
				}
			}
		}
		return temp;
	}

	public ArrayList<Auction> getAuctionByDesctime(ArrayList<Auction> auction) {
		ArrayList<Auction> temp = auction;
		Auction auctionTemp = new Auction();
		for (int i = 0; i < temp.size() - 1; i++) {
			for (int j = 1; j < temp.size() - i; j++) {
				if (temp.get(j - 1).getAuctionTime()
						.compareTo(temp.get(j).getAuctionTime()) < 0) {
					auctionTemp = temp.get(j - 1).clone();
					temp.set(j - 1, temp.get(j).clone());
					temp.set(j, auctionTemp);
				}
			}
		}
		return temp;
	}

	public ArrayList<Auction> getAuctionByAscbid(ArrayList<Auction> auction) {
		ArrayList<Auction> temp = auction;
		Auction auctionTemp = new Auction();
		for (int i = 0; i < temp.size() - 1; i++) {
			for (int j = 1; j < temp.size() - i; j++) {
				if (temp.get(j - 1).getCurrentPrice() > temp.get(j)
						.getCurrentPrice()) {
					auctionTemp = temp.get(j - 1).clone();
					temp.set(j - 1, temp.get(j).clone());
					temp.set(j, auctionTemp);
				}
			}
		}
		return temp;
	}

	public ArrayList<Auction> getAuctionByDescbid(ArrayList<Auction> auction) {
		ArrayList<Auction> temp = auction;
		Auction auctionTemp = new Auction();
		for (int i = 0; i < temp.size() - 1; i++) {
			for (int j = 1; j < temp.size() - i; j++) {
				if (temp.get(j - 1).getCurrentPrice() < temp.get(j)
						.getCurrentPrice()) {
					auctionTemp = temp.get(j - 1).clone();
					temp.set(j - 1, temp.get(j).clone());
					temp.set(j, auctionTemp);
				}
			}
		}
		return temp;
	}

	public static int getDay(long time) {
		int day = 0;
		if (time <= 0) {
			day = 0;
		} else {
			day = (int) (time / (24 * 60 * 60 * 1000));
		}
		return day;

	}

	public static int getHour(long time) {
		int day = 0;
		int hour = 0;
		if (time <= 0) {
			hour = 0;
		} else {
			day = (int) (time / (24 * 60 * 60 * 1000));
			hour = (int) ((time - ((24 * 60 * 60 * 1000) * day)) / (60 * 60 * 1000));
		}
		return hour;

	}

	public static int getMinute(long time) {
		int day = 0;
		int hour = 0;
		int min = 0;
		if (time <= 0) {
			min = 0;
		} else {
			day = (int) (time / (24 * 60 * 60 * 1000));
			hour = (int) ((time - ((24 * 60 * 60 * 1000) * day)) / (60 * 60 * 1000));
			min = (int) ((time - ((24 * 60 * 60 * 1000) * day) - ((60 * 60 * 1000) * hour)) / (60 * 1000));
		}
		return min;

	}

	public static int getMin(long time) {
		int day = 0;
		int hour = 0;
		int min = 0;
		int second = 0;
		if (time <= 0) {
			min = 0;
		} else {
			day = (int) (time / (24 * 60 * 60 * 1000));
			hour = (int) ((time - ((24 * 60 * 60 * 1000) * day)) / (60 * 60 * 1000));
			min = (int) ((time - ((24 * 60 * 60 * 1000) * day) - ((60 * 60 * 1000) * hour)) / (60 * 1000));
			second = (int) ((time - ((24 * 60 * 60 * 1000) * day)
					- ((60 * 60 * 1000) * hour) - ((60 * 1000) * min)) / (1000));
		}
		return min;

	}

	public static int getSecond(long time) {
		int day = 0;
		int hour = 0;
		int min = 0;
		int second = 0;
		if (time <= 0) {
			second = 0;
		} else {
			day = (int) (time / (24 * 60 * 60 * 1000));
			hour = (int) ((time - ((24 * 60 * 60 * 1000) * day)) / (60 * 60 * 1000));
			min = (int) ((time - ((24 * 60 * 60 * 1000) * day) - ((60 * 60 * 1000) * hour)) / (60 * 1000));
			second = (int) ((time - ((24 * 60 * 60 * 1000) * day)
					- ((60 * 60 * 1000) * hour) - ((60 * 1000) * min)) / (1000));
		}
		return second;
	}

}
