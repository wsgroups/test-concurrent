package com.future;

public class RealData implements Data{
	protected final String result;
	public RealData(String para){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i< 3 ; i++){
			sb.append(para);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
		result = sb.toString();
	}
	@Override
	public String getResult() {
		return result;
	}
	
}
