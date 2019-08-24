package deneme1;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class javaClock  extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8136114273454311458L;

		JLabel lbl = new JLabel();


	public javaClock() {
	gui();
	clock();

	}
	
	public void gui() {
		this.setTitle("clock");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		 lbl = new JLabel("");
		 lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lbl.setHorizontalAlignment(SwingConstants.CENTER);
		 lbl.setForeground(new Color(221,44,23));
		lbl.setBounds(75, 117, 230, 119);
		getContentPane().add(lbl);
		this.setVisible(true);
	}
	

  public void clock() {
	   Thread clock = new Thread() {
		   public void run() {
			   try {
				   while(true) {
				   Calendar cal = new GregorianCalendar();
				   int secont = cal.get(Calendar.SECOND);
				   int minute = cal.get(Calendar.MINUTE);
				   int hour = cal.get(Calendar.HOUR_OF_DAY);
				   
				   lbl.setText(hour+":"+minute+":"+secont);
				   
				sleep(1000);
				   }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   };
	   clock.start();
  }

	public static void main(String[] args) {
		new javaClock();
	}
}
