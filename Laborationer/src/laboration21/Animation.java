package laboration21;

import javax.swing.ImageIcon;

public class Animation extends Shape {
	private ImageIcon[] images;
	private int index;
	private int x, y, dx, dy;

	public Animation(int x, int y, ImageIcon[] images) {
		this.images = images;
		this.x = x;
		this.y = y;
		dx = 10;
		dy = 10;
	}

	@Override
	public void paint(PaintWindow window) {

		while (true) {
			if (index >= images.length) {
				index = 0;
			}
			if (index >= 0) {
//				if (x + dx > 590 || x + dx < 0) {
//					dx *= -1;
//				}
//				x += dx;

				window.hideImage(images[index]);
				window.showImage(images[index], x, y);
				index++;
				PaintWindow.pause(500);
			}

		}
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		PaintWindow window = new PaintWindow();
		ImageIcon[] images = new ImageIcon[10];

		for (int i = 0; i < images.length; i++) {
			images[i] = new ImageIcon("pictures/New" + (i + 1) + ".jpg");
		}
		Animation anim = new Animation(100, 100, images);
		anim.paint(window);
	}

}
