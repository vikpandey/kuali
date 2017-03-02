package org.kuali.elevatorSystem;

public class ElevatorSystem {
	
	Elevator elevator;
	private int numberOfTrips;
	
	/** 
	 * @return
	 * 
	 * This method will return the elevator number, when a elevator is 
	 * going up or down. 
	 * 
	 */
	public Integer elevatorMovement(int floorNumber) {
		if(floorNumber > elevator.getTopFloor() && floorNumber < elevator.getGround())
		{
			return null;
		}
		
		elevator.setFloorNumber(floorNumber);
		int currentFloor = elevator.getFloorNumber();
		String upOrDown =  movement(currentFloor);
		if(upOrDown == "goingUp") {
			if(currentFloor == elevator.getTopFloor()){
				return null;
			}
			return currentFloor + 1;
		}
		else if (upOrDown == "goingDown") {
			
			if(currentFloor == elevator.getGround()) {
				return null;
			}
			
			return currentFloor - 1;
		}
		else if (upOrDown == null) {
			return null;
		}
		numberOfTrips = elevator.getNumberOfTrips() + 1;
		return null;
	}
	
	public String movement(int floorNumber) {
		if(floorNumber == floorNumber + 1) {
			return "goingUp";
		}
		else if(floorNumber == floorNumber - 1) {
			return "goingDown";
		}
		else 
			return null;
	}
	
	/**
	 * 
	 * @return
	 * 
	 * This method will return a string and check if the door is open or closed.
	 */
	
	public String doorOpen() {
		
		if(elevator.isDoorOpen() == true){
			return "door Open";
		}
		else if (elevator.isDoorOpen() == false) {
			return "door closed";
		}
		else 
			return null;
	}
	
	public void elevatorRequest(int currentFloorNumber, int requestedFloorNumber) {
		
		boolean doorOpen;
		boolean doorOccupied;
		
		if (requestedFloorNumber < elevator.getGround() ||
				requestedFloorNumber > elevator.getTopFloor()) {
			System.out.println("no a valid number");
			return; 
		}
		
		else if (elevator.isOccupied() == false && 
				elevator.getFloorNumber() == currentFloorNumber) {
			System.out.println("open the door");
		doorOpen = 	doorOpen(elevator);
		doorOccupied = doorOccupied(elevator);
		elevatorMovement(elevatorMovement(requestedFloorNumber+1));
		}
		else if (elevator.isOccupied() == true && isClosest(requestedFloorNumber)) {
			doorOpen = doorOpen(elevator);
			doorOccupied = doorOccupied(elevator);
			elevatorMovement(elevatorMovement(requestedFloorNumber +1));
		}
		else if (elevator.isOccupied() == false && isClosest(requestedFloorNumber)) {
			if(doorOpen() == "door closed"){
			doorOpen = doorOpen(elevator);
			doorOccupied = doorOccupied(elevator);
			}
			else if(doorOpen() == "door Open") {
				doorOccupied = doorOccupied(elevator);
			}
			elevatorMovement(elevatorMovement(requestedFloorNumber + 1));
		}
	}
	
	public void numberOfTrips(int numberOfTrips) {
		if(numberOfTrips == 100) {
			if(maintainence() == true) {
			 System.out.println("starts working");
			}
		}
	}
	
	public boolean maintainence() {
		
		System.out.println("servicing");
		return true;
	}
	
	@SuppressWarnings("null")
	private boolean isClosest(int requestedFloorNumber) {
		if(requestedFloorNumber < elevator.getGround() || 
				requestedFloorNumber > elevator.getTopFloor()) 
			return (Boolean) null;
		
		int currentFloorNumber = elevator.getFloorNumber();
		if(currentFloorNumber <= elevator.getTopFloor())
			return true;
		else
			return false;
	}
	
	public boolean doorOpen(Elevator elevator) {
		
		boolean doorOpen = elevator.isDoorOpen();
		doorOpen = true;
		return doorOpen;
	}
	
	public boolean doorOccupied(Elevator elevator) {
		boolean doorOccupied = elevator.isOccupied();
		doorOccupied = true;
		return doorOccupied;
	}
	
	/**
	 *  There are few things missing, like interaction between two elevators
	 *  I need to create a method, where I will pass the elevator[] array as
	 *  parameter, and check, how which elevator is not in maintenence. and
	 *  which are closer to the requested door. 
	 */
	
	
}
