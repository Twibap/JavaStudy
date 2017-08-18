package main;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(50); 
		// BlockingQueue queue = new LinkedBlockingQueue();
		
		Thread p = new Thread(new Producer(queue));
		Thread c = new Thread(new Consumer(queue));
		p.start();
		c.start();

	}

}

// 출처: http://devyongsik.tistory.com/430 [DEV용식]