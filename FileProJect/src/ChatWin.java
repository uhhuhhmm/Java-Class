import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChatWin extends Frame{

	String nickname = "";
	TextArea ta = new TextArea();
	Panel p = new Panel();
	TextField tf = new TextField(30); //글 쓰기 할 때 필요한 부분
	Button bSave = new Button("저장");
	
	ChatWin(String nickname){
		this.nickname = nickname;
		
		setBounds(200, 100, 300, 200);
		
		p.setLayout(new FlowLayout());
		p.add(tf, "Center");
		p.add(bSave, "Center");
		
		
		add(ta, "Center");
		add(p, "South");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//버튼 파일을 저장하는 기능
		//저장 하는 기능 
		bSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fileSave = new FileDialog(ChatWin.this,"파일저장", FileDialog.SAVE);
				fileSave.setVisible(true);
				
				String fileName = fileSave.getDirectory() + fileSave.getFile();
				saveAs(fileName);
			}
		}); 
		
		
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);

		ta.setText("#" + nickname + "님 즐거운 채팅 되세요");
		ta.setEditable(false);
		
		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	}
	
	//내용 저장
	void saveAs(String fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(ta.getText());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		new ChatWin("Hong");
		
	}

	//Inner Class
	class EventHandler extends FocusAdapter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = tf.getText();
			if("".equals(msg))
				return;
			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}
		
		public void focusGained(FocusEvent e) {
			tf.requestFocus(); //계속 타이핑 가능
		}
		
	}
		
}
