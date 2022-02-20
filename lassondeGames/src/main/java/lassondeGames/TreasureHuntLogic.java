package lassondeGames;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TreasureHuntLogic {
	//JLabel is collectible ImageIcon is pic to display
	private ImageIcon arcadeIcon;
	private JLabel arcadeLabel;
	
	private ImageIcon specialIcon;
	private JLabel specialLabel;
	
	private ImageIcon earthIcon;
	private JLabel earthLabel;
	
	private ImageIcon forestIcon;
	private JLabel forestLabel;
	
	private final int width =200;
	private final int height =200;
	
	public TreasureHuntLogic() {//black.jpg
		arcadeIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/black.jpg")));//arcade_resize.png
		earthIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/black.jpg")));//earth_resize.png
		forestIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/black.jpg")));//rainforest_resize.png
		specialIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/black.jpg")));//space_resize.png
		setArcadeLabel();
		setearthLabel();
		setforestLabel();
		setspecialLabel();
	}

	
	//arcade
	public ImageIcon getarcadeIcon() {
		return this.arcadeIcon;
	}
	public void setarcadeIcon(String path) {
		arcadeIcon = new  ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource(path)));
		arcadeLabel.setIcon(this.arcadeIcon);
	}
	public JLabel getarcadeLabel() {
		return this.arcadeLabel;
	}
	public void setArcadeLabel() {
		arcadeLabel = new JLabel();
		arcadeLabel.setBounds(906,0, width, height);
		arcadeLabel.setIcon(this.arcadeIcon);
	}
	//earth
	public ImageIcon getearthIcon() {
		return this.earthIcon;
	}
	public void setearthIcon(String path) {
		earthIcon = new  ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource(path)));
		earthLabel.setIcon(this.earthIcon);
	}
	public JLabel getearthLabel() {
		return this.earthLabel;
	}
	public void setearthLabel() {
		earthLabel = new JLabel();
		earthLabel.setBounds(906,204, width, height);
		earthLabel.setIcon(this.earthIcon);
	}
	//forest
	public ImageIcon getforestIcon() {
		return this.forestIcon;
	}
	public void setforestIcon(String path) {
		forestIcon = new  ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource(path)));
		forestLabel.setIcon(this.forestIcon);
	}
	public JLabel getforestLabel() {
		return this.forestLabel;
	}
	public void setforestLabel() {
		forestLabel = new JLabel();
		forestLabel.setBounds(906,406, width, height);
		forestLabel.setIcon(this.forestIcon);
	}
	//special
	public ImageIcon getspecialIcon() {
		return this.specialIcon;
	}
	public void setspecialIcon(String path) {
		specialIcon = new  ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource(path)));
		specialLabel.setIcon(this.specialIcon);
	}
	public JLabel getspecialLabel() {
		return this.specialLabel;
	}
	public void setspecialLabel() {
		specialLabel = new JLabel();
		specialLabel.setBounds(906,608, width, height);
		specialLabel.setIcon(this.specialIcon);
	}
	
	
}
