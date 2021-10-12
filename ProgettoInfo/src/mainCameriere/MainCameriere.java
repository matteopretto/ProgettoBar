package mainCameriere;

import java.awt.EventQueue;

import ViewCameriere.ViewCameriere;
import controllerCameriere.ControllerCameriere;

public class MainCameriere {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCameriere window = new ViewCameriere();
					ControllerCameriere controller = new ControllerCameriere(window);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
