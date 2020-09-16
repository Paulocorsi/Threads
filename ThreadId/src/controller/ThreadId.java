package controller;

public class ThreadId extends Thread {

	private int idThread;
	
	public ThreadId (int idThread){
		this.idThread = idThread;
	}
	
	@Override
	public void run() {
		id();
	}

	private void id() {
		System.out.println("ID: "+getId()+"\nTHREAD: "+idThread);
	}
}
