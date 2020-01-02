//simulating banking counter using Queue
//Queue is an abstract data type.Here implemented using generics.
//rear used to enqueue and front used to deque.
//Bank balance initially set to 50000.
package com.bridgelabz.fellowshipprograms.DataStructure;
import java.util.Scanner;
public class Queue<T> {

		//Object is the superclass of all classes.
		Object[] queue = new Object[10];
		public int bankBalance = 50000;	//Set by default
		Scanner scanner = new Scanner(System.in);
		int front;
		int rear;
		int size;
		int counter=1;
		
		//To add
		public void enQueue(T data) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
			if (isFull()) {
				System.out.println("Queue is full removing first value");
			}
		}

		//To remove
		public T deQueue() {
			
			T data = (T) queue[front];
			if (!isEmpty()) {
				front = (front + 1) % 5;
				size = size - 1;
			} else {
				System.out.println("Queue is empty nothing to delete");
			}

			return data;

		}

		
		public void show() {
			System.out.print("Element : ");
			int length = queue.length;
			int count = rear;
			if (isFull()) {
				while (length > 0) {
					System.out.print(queue[count] + " ");
					count++;
					if (count == 5) {
						count = 0;
					}
					length--;
				}
			} else {
				for (int i = 0; i < size; i++) {
					System.out.print(queue[(front + i) % 5] + " ");
				}
			}

		}

		
		public int getSize() {
			return size;
		}

		
		public boolean isEmpty() {
			return getSize() == 0;
		}

		
		public boolean isFull() {
			return getSize() == 5;
		}

		public void service() {

			System.out.println("Your Token number is : " + counter);
			
			counter++;
			
		}

	}


