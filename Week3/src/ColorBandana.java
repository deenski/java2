/*
Jakob Vendegna
CSC 161 201
3/1/17

Description:
*/

public class ColorBandana {
	private String[] validColors = {"red", "blue", "purple", "orange"};
	public String myColor;

	public ColorBandana() {
		this.myColor = "red";
	}

	public ColorBandana(String s) {
		s = s.toLowerCase();

		for(int i = 0; i < validColors.length; i++) {

			if(s == validColors[i]){
				this.myColor = s;
			}
		}

		if (this.myColor == null) {
			this.myColor = validColors[1];
		}
	}

	public void setColor(String s) {
		s = s.toLowerCase();
		for(int i = 0; i < validColors.length; i++) {
			if(s == validColors[i]){
				this.myColor = s;
			}
		}
	}

	public String getColor() {
		return this.myColor;
	}
	

}