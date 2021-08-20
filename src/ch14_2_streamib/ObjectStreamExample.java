package ch14_2_streamib;

import java.text.SimpleDateFormat;

public class ObjectStreamExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		BoardUtil util = new BoardUtil();
		// ����Ʈ ����ȭ
		util.write();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		// ����Ʈ ������ȭ
		for(Board b : util.read()) {
			System.out.printf("%d\t%s\t%s\t%s\n",
					b.getBno(), b.getTitle(), b.getContent(),
					b.getWriter(), sdf.format(b.getDate()));
		}
	}
}
