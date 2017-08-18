package main;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				synchronized (queue) {
					if (!queue.isEmpty()) {
						String msg = (String) queue.take();
						System.out.println("메시지를 꺼냅니다. : " + msg + "[" + queue.size() + "]");
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 출처: http://devyongsik.tistory.com/430 [DEV용식]