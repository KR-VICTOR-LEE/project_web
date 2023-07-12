package innerinterface;

public class Button {
	
	private OnClickListener listener;
	
	interface OnClickListener{
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}
