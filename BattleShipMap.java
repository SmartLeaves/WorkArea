package com.bc;
import java.util.List;

public class BattleShipMap 
{
	int TILE_SIZE_MAX = 100;
	long [][] tile = new long [TILE_SIZE_MAX][TILE_SIZE_MAX];
	
	//PREVIOUSLY_ATTACKED only occurs when a ship has been hit on this tile previously
	public enum AttackResult {DESTROYED_SHIP,HIT,MISS,PREVIOUS_HIT,INVALID};			
	
	//the point(0,0) is the southwest tile. the point (width,height) is the northeast tile.
	public BattleShipMap(Long width, Long height)
	{ 
		
	}
	
	//the ship is placed so that its southwest tile is on the location (x,y)
	public Boolean placeShip(Ship ship, Long x, Long y)
	{
		//TODO : if tiles required to place ship.size() is occupied, return false. 
		//
		
		
			
			
			for(long i= x-ship.getLength()/2 ; i< ship.getLength();++i )
			for (long j=){
			
		
			
		}
		
	}
	
	public AttackResult attackSpace(Long x, Long y)
	{
		//TODO
		return null;
	}
	
	public boolean isSpaceAvailable(long x, long y, int size){
		
		if (tile[x-size/2]!= null || tile[y-size/2] || 
					tile[x+size/2] != null || tile[y+size/2])
			return true;
		return false;
	}
}
