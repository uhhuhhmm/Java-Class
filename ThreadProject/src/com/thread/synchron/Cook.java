package com.thread.synchron;

public class Cook implements Runnable {
	
	private Table table;

	public Cook(Table table) {
		super();
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			int index = (int)(Math.random() * table.disNum());
			table.add(table.dishNames[index]);
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				
			}
		}
	}

}
