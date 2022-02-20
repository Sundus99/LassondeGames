package lassondeGames;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TressureHunt {

	private JFrame frame;
	private ImageIcon map;
	private JLabel mapLabel;
	private Player pl;
	private TreasureHuntLogic thl;
	private JButton arcadeQR;
	private JButton forestQR;
	private JButton specialQR;
	private JButton earthQR;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TressureHunt window = new TressureHunt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TressureHunt() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//for background image of map.
		map = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/level6mapwb_resized.png")));
		mapLabel = new JLabel(map);
		mapLabel.setLocation(0, 0);
		mapLabel.setSize(905,881);
		
		frame = new JFrame("Tressure Hunt");
		
		//setting up player arrow
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/Picture4.png")));
		//311,233 starting point
		pl = new Player(img,311,233);
		//221,315 rainforest
		//pl = new Player(img,221,315);
		//699,193 special exhibit
		//pl = new Player(img,699,193);
		//573,658 living earth
		//pl = new Player(img,573,658);
		//620,769 arcade
		//pl = new Player(img,620,769);
		//for player movement
		
		
		frame.getContentPane().add(pl.getPl());// to add player on top of background
		
		thl = new TreasureHuntLogic();
		//QR code reaction
		
		//QR-arcade
		arcadeQR = new JButton("QR_ar");
		arcadeQR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("QR_ar")) {
					thl.setarcadeIcon("/arcade_resize.png");
				}
			}
		});
		arcadeQR.setBounds(686, 744, 115, 29);
		frame.getContentPane().add(arcadeQR);
		
		//QR-rainforest
		forestQR = new JButton("QR_for");
		forestQR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("QR_for")) {
					thl.setforestIcon("/rainforest_resize.png");
				}
			}
		});
		forestQR.setBounds(74, 345, 115, 29);
		frame.getContentPane().add(forestQR);
	
		//QR- special
		specialQR = new JButton("QR_sp");
		specialQR.setBounds(737, 235, 115, 29);
		specialQR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("QR_sp")) {
					thl.setspecialIcon("/space_resize.png");
				}
			}
		});
		frame.getContentPane().add(specialQR);
		
		//QR- living earth
		earthQR = new JButton("QR_er");
		earthQR.setBounds(648, 691, 115, 29);
		earthQR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("QR_er")) {
					thl.setearthIcon("/earth_resize.png");
				}
			}
		});
		frame.getContentPane().add(earthQR);
		
		//map and other frame stuff
		frame.getContentPane().add(mapLabel);//adds background image of map to the window
		frame.setBounds(100, 100, 1127,937);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//player
		frame.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyChar()) {
				case 'w': 
					pl.moveUp();
					break;
				case 's':
					pl.moveDown();
					break;
				case 'a':
					pl.moveLeft();
					break;
				case 'd':
					pl.moveRight();
					break;
				}
				frame.repaint();//so that the pl can show up at new location
			}
		});
		//scavenger hunt labels
		
		frame.getContentPane().add(thl.getarcadeLabel());
		frame.getContentPane().add(thl.getearthLabel());
		frame.getContentPane().add(thl.getforestLabel());
		frame.getContentPane().add(thl.getspecialLabel());
		
		
		
		
		
		
		
	}
}
