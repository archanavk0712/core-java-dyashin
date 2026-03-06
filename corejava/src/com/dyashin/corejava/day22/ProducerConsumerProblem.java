package com.dyashin.corejava.day22;

class Table {
	String food;
	boolean available = false;

	synchronized void cook(String item) {
		while (available) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		food = item;
		System.out.println("Chef cooked: " + food);
		available = true;
		notify();
	}

	synchronized void serve() {
		while (!available) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Waiter served: " + food);
		available = false;
		notify();
	}
}

class Chef extends Thread {
	Table table;
	String[] dishes = { "Pizza", "Burger", "Pasta", "Fries", "Sandwich" };

	Chef(Table t) {
		this.table = t;
	}

	public void run() {
		for (String dish : dishes) {
			table.cook(dish);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}


class Waiter extends Thread {
    Table table;

    Waiter(Table t) {
        this.table = t;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            table.serve();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
     
            }
        }
    }
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {

		Table table= new Table();
		Chef chef=new Chef(table);
		Waiter waiter=new Waiter(table);
		
		
		chef.start();
		waiter.start();
	}

}
