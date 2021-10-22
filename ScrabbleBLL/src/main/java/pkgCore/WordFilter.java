package pkgCore;

public class WordFilter {
	
	private String strStartsWith;
	private String strEndsWith;
	private String strContains;
	private int iContainsIdx;
	private int iLength;
	
	public WordFilter() {
		
	}
	
	
	public WordFilter(String strStartsWith, String strEndsWith, String strContains, int iContainsIdx, int iLength) {
		this.strStartsWith = strStartsWith;
		this.strEndsWith = strEndsWith;
		this.strContains = strContains;
		this.iContainsIdx = iContainsIdx;
		this.iLength = iLength;
	}


	public String getStrStartWith() {
		return strStartsWith;
	}


	public void setStrStartWith(String strStartsWith) {
		this.strStartsWith = strStartsWith;
	}


	public String getStrEndWith() {
		return strEndsWith;
	}


	public void setStrEndWith(String strEndsWith) {
		this.strEndsWith = strEndsWith;
	}

	public String getStrContains() {
		return strContains;
	}


	public void setStrContains(String strContains) {
		this.strContains = strContains;
	}


	public int getiContainsIdx() {
		return iContainsIdx;
	}


	public void setiContainsIdx(int iContainsIdx) {
		this.iContainsIdx = iContainsIdx;
	}


	public int getiLength() {
		return iLength;
	}


	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	
	

}
