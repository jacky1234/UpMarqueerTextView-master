package neacy.upmarqueer.bean;

import java.io.Serializable;
import java.util.List;

public class ViewPointData implements Serializable {
	// "count": "15",
	// "data2": []
	private String count;
	private List<ViewPointDeatils> data2;

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<ViewPointDeatils> getData2() {
		return data2;
	}

	public void setData2(List<ViewPointDeatils> data2) {
		this.data2 = data2;
	}

}
