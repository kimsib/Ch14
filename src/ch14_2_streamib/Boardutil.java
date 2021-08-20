package ch14_2_streamib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardUtil {

	List<Board> list;
	
	public Boardutil () {
		list = new ArrayList<>();
		
		list.add(new Board(1, "����1", "����1" , "�۾���1", new Date()));
		list.add(new Board(2, "����2", "����2" , "�۾���2", new Date()));
		list.add(new Board(3, "����3", "����3" , "�۾���3", new Date()));
		list.add(new Board(4, "����4", "����4" , "�۾���4", new Date()));
		list.add(new Board(5, "����5", "����5" , "�۾���5", new Date()));
		
		
		
	}
	
		public void write() {
			String path = "c:/temp/boardClass.db";
			try {
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(list);
				
				oos.flush();
				oos.close();
				
				} catch ( IOException ex) {}
		}
	
	public List<Board> read() throws ClassNotFoundException {
		String path = "c:/temp/boardClass.db";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<Board> list =(List<Board>)ois.readObject(); 
					
		}catch (IOException ex) {ex.printStackTrace();}
		
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
