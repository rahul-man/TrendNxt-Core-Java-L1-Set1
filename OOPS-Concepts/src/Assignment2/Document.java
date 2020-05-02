package Assignment2;

public class Document {
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Document [text=" + text + "]";
	}
}
