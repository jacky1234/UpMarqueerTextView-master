package neacy.upmarqueer.bean;

import java.io.Serializable;

public class ViewPointBean implements Serializable {
	// "data": {},

	private ViewPointData data;

	public ViewPointData getData() {
		return data;
	}

	public void setData(ViewPointData data) {
		this.data = data;
	}

}
