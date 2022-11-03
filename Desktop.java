package org;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("14 inch");
	}
	public static void main(String[] args) {
		Desktop dis=new Desktop();
		dis.ComputerModel();
		dis.desktopSize();
		System.out.println(dis);
	}
}
