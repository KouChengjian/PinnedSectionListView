package pinneactivity.example.ui;

import java.util.ArrayList;

public class Bean {

	public static final int ITEM = 0;
	public static final int SECTION = 1;

	public final int type;
	public final String text;

	public int sectionPosition;
	public int listPosition;


	public int getSectionPosition() {
		return sectionPosition;
	}

	public void setSectionPosition(int sectionPosition) {
		this.sectionPosition = sectionPosition;
	}

	public int getListPosition() {
		return listPosition;
	}

	public void setListPosition(int listPosition) {
		this.listPosition = listPosition;
	}

	public Bean(int type, String text) {
		this.type = type;
		this.text = text;
	}


	public Bean(int type, String text, int sectionPosition, int listPosition) {
		super();
		this.type = type;
		this.text = text;
		this.sectionPosition = sectionPosition;
		this.listPosition = listPosition;
	}

	@Override public String toString() {
		return text;
	}
	public static ArrayList<Bean> getData(){
		ArrayList<Bean>  list=new ArrayList<Bean>();
		list.add(new Bean(SECTION, "星标朋友"));
		list.add(new Bean(ITEM, "陈雪"));
		list.add(new Bean(ITEM, "陈欧"));
		list.add(new Bean(SECTION, "A"));
		list.add(new Bean(ITEM, "AngleBaby"));
		list.add(new Bean(ITEM, "安娜"));
		list.add(new Bean(ITEM, "AngleBaby"));
		list.add(new Bean(ITEM, "安娜"));
		
		list.add(new Bean(SECTION, "B"));
		list.add(new Bean(ITEM, "悲哀的人生"));
		list.add(new Bean(ITEM, "冰河世纪"));
		list.add(new Bean(ITEM, "白百合"));
		
		list.add(new Bean(SECTION, "C"));
		list.add(new Bean(ITEM, "蔡依林"));
		list.add(new Bean(ITEM, "程颖"));
		list.add(new Bean(ITEM, "成都伟平资产管理有限公司"));
		list.add(new Bean(ITEM, "ChinaJoy"));
		list.add(new Bean(ITEM, "蔡卓妍"));
		list.add(new Bean(ITEM, "池早早"));
		list.add(new Bean(ITEM, "ChinaJoy"));
		list.add(new Bean(ITEM, "蔡卓妍"));
		list.add(new Bean(ITEM, "池早早"));
		list.add(new Bean(SECTION, "L"));
		list.add(new Bean(ITEM, "李双"));
		list.add(new Bean(ITEM, "李白白"));
		list.add(new Bean(ITEM, "李雪"));
		list.add(new Bean(ITEM, "李雪萍"));
		list.add(new Bean(ITEM, "李行亮"));
		list.add(new Bean(ITEM, "莱茵斯坦"));
		list.add(new Bean(ITEM, "龙雪菲"));
		list.add(new Bean(ITEM, "李雪"));
		list.add(new Bean(ITEM, "李雪萍"));
		list.add(new Bean(ITEM, "李行亮"));
		list.add(new Bean(ITEM, "莱茵斯坦"));
		list.add(new Bean(ITEM, "龙雪菲"));
		return list;
	}
}
