package active_learning2;
/*
Program  with a GUI that will convert numbers from binary to octal.
Author: Dongseok K. Programmer
E-mail Address: dsk0820@naver.com
Programming Active Learning2
Last changed: june 17, 2022
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ch14_codes.WindowDestroyer;

public class Window extends JFrame implements ActionListener {
	// 크기 지정0
	public static final int WIDTH = 500;
	public static final int HEIGHT = 200;
	// 입력 필드
	private JTextField name;
	//결과패널 및 라벨
	JPanel result = new JPanel(new GridLayout(3, 1));
	JLabel m1, m2, m3;
	public Window() {
		// 타이틀설정
		setTitle("Binary/Octal convertor");
		// 크기설정
		setSize(WIDTH, HEIGHT);
		// 컨테이너 설정
		Container Contain = getContentPane();
		Contain.setLayout(new BorderLayout());
		// 버튼 패널과 입력 및 출력 패널로 나눔
		JPanel west_p = new JPanel(new GridLayout(8, 1));
		JPanel center_p = new JPanel(new GridLayout(3, 1));
		// binary로 바꾸는 버튼 설정
		JButton binaryToOct = new JButton("Convert to binary");
		binaryToOct.addActionListener(this);
		// 8진수로 바꾸는 버튼 설정
		JButton OctTobinary = new JButton("Convert to Oct");
		OctTobinary.addActionListener(this);
		// 초기화 버튼 설정
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(this);
		// text입력 초기화
		name = new JTextField("Enter value here");
		// 오른쪽 버튼위치 설정
		west_p.add(binaryToOct);
		west_p.add(new JLabel());
		west_p.add(new JLabel());
		west_p.add(OctTobinary);
		west_p.add(new JLabel());
		west_p.add(new JLabel());
		west_p.add(Clear);
		west_p.add(new JLabel());
		// 왼쪽위치 설정
		center_p.add(name);
		center_p.add(new JLabel());
		center_p.add(result);
		m1 = new JLabel();
		m2 = new JLabel();
		m3 = new JLabel();
		result.add(m1);
		result.add(m2);
		result.add(m3);
		// 오른쪽에 버튼(east가 아닌 center로 한 이유는 왼쪽 패널의 크기가 더 크기 때문, 오른쪽에 입력 및 출력 세팅)
		Contain.add(center_p, BorderLayout.CENTER);
		Contain.add(west_p, BorderLayout.EAST);
		addWindowListener(new WindowDestroyer());
	}

	// 버튼 누르면 생기는 액션
	public void actionPerformed(ActionEvent e) {
		// 숫자 확인 및 변경
		try {
			tryingCorrectNumberFormats(e);
		}
		// tryingCorrectNumberFormats 에서 exception으로 넘겨주는 것 예외처리
		catch (Exception e2) {
			name.setText("Error: Reenter Number");
			m1.setText("");
			m3.setText("");
		}
	}

	// 입력한 문자가 올바른 문자인지 판별 및 버튼에 맞는 숫자로 변환
	private void tryingCorrectNumberFormats(ActionEvent e) throws Exception {
		// Convert to binary 버튼을 눌렀을때 실행
		if (e.getActionCommand().equals("Convert to binary")) {
			//8진수인지 확인 후 아니면 throw
			if (OctCheck(name.getText())) {
				throw new Exception();
			}
			String convertedBinary = ConvertToBinary(name.getText());
			//변환것인 2진수인지 확인 후 아니면 throw
			if (binaryCheck(convertedBinary)) {
				throw new Exception();
			}
			m1.setText(convertedBinary);
			m3.setText("Value converted to binary");
		}
		// Convert to Oct 버튼을 눌렀을 때
		else if (e.getActionCommand().equals("Convert to Oct")) {
			//2진수인지 확인 후 아니면 throw
			if (binaryCheck(name.getText())) {
				throw new Exception();
			}
			String ConvertedOctal = ConvertToOct(name.getText());
			//변환한것이 8진수인지 확인 후 아니면 throw
			if (OctCheck(ConvertedOctal)) {
				throw new Exception();
			}
			m1.setText(ConvertedOctal);
			m3.setText("Value converted to Octal");
		}
		// Clear 버튼을 눌렀을 때
		else if (e.getActionCommand().equals("Clear")) {
			name.setText("");
			m1.setText("");
			m3.setText("");
		} else
			name.setText("Error in window interface.");
	}

	// 8진수로 변경
	private String ConvertToOct(String str) {
		// 8진수로 변경하기 위해 3개단위로 쪼갤텐데 그때를 위해 문자열 길이가 3의 배수가 되도록 앞에 0추가
		while (str.length() % 3 != 0) {
			str = "0" + str;
		}
		String[] str_arr = str.split("");
		String str2 = "";
		// 문자열을 3개단위로 나누어 2진수로 변경 후 string에 저장
		for (int i = 0; i < str_arr.length; i += 3) {
			int k = 0;
			k += Integer.parseInt(str_arr[i]) * 4;
			k += Integer.parseInt(str_arr[i + 1]) * 2;
			k += Integer.parseInt(str_arr[i + 2]);
			str2 += Integer.toString(k);
		}
		return str2;
	}

	// 2진수로 변경
	private String ConvertToBinary(String str) {
		String[] str_arr = str.split("");
		String str2 = "";
		for (int i = 0; i < str_arr.length; i++) {
			String empty = "";
			int number = Integer.parseInt(str_arr[i]);
			// 숫자가 0인경우 문자열에 000추가
			if (number == 0) {
				empty += "000";
			}
			// 숫자가 0이될때까지 계속 나누어 임시 문자열에 추가
			while (number != 0) {
				empty = Integer.toString(number % 2) + empty;
				number /= 2;
			}
			// 임시 문자열길이가 3이 아닌경우 앞에 0추가
			while (empty.length() % 3 != 0) {
				empty = "0" + empty;
			}
			// 문자열에 임시 문자열 추가
			str2 += empty;
		}
		return str2;
	}

	private boolean binaryCheck(String str) {
		String[] str2 = str.split("");
		for (int i = 0; i < str2.length; i++) {
			if (Integer.parseInt(str2[i]) > 1) {
				return true;
			}
		}
		return false;
	}

	private boolean OctCheck(String str) {
		String[] str2 = str.split("");
		for (int i = 0; i < str2.length; i++) {
			if (Integer.parseInt(str2[i]) > 7) {
				return true;
			}
		}
		return false;
	}

	public class WindowDestroyer extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window is closing", "Mwssage", JOptionPane.INFORMATION_MESSAGE);
			super.windowClosing(e);
		}
	}
}
