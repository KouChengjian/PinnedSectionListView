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
		list.add(new Bean(SECTION, "�Ǳ�����"));
		list.add(new Bean(ITEM, "��ѩ"));
		list.add(new Bean(ITEM, "��ŷ"));
		list.add(new Bean(SECTION, "A"));
		list.add(new Bean(ITEM, "AngleBaby"));
		list.add(new Bean(ITEM, "����"));
		list.add(new Bean(ITEM, "AngleBaby"));
		list.add(new Bean(ITEM, "����"));
		
		list.add(new Bean(SECTION, "B"));
		list.add(new Bean(ITEM, "����������"));
		list.add(new Bean(ITEM, "��������"));
		list.add(new Bean(ITEM, "�װٺ�"));
		
		list.add(new Bean(SECTION, "C"));
		list.add(new Bean(ITEM, "������"));
		list.add(new Bean(ITEM, "��ӱ"));
		list.add(new Bean(ITEM, "�ɶ�ΰƽ�ʲ��������޹�˾"));
		list.add(new Bean(ITEM, "ChinaJoy"));
		list.add(new Bean(ITEM, "��׿��"));
		list.add(new Bean(ITEM, "������"));
		list.add(new Bean(ITEM, "ChinaJoy"));
		list.add(new Bean(ITEM, "��׿��"));
		list.add(new Bean(ITEM, "������"));
		list.add(new Bean(SECTION, "L"));
		list.add(new Bean(ITEM, "��˫"));
		list.add(new Bean(ITEM, "��װ�"));
		list.add(new Bean(ITEM, "��ѩ"));
		list.add(new Bean(ITEM, "��ѩƼ"));
		list.add(new Bean(ITEM, "������"));
		list.add(new Bean(ITEM, "����˹̹"));
		list.add(new Bean(ITEM, "��ѩ��"));
		list.add(new Bean(ITEM, "��ѩ"));
		list.add(new Bean(ITEM, "��ѩƼ"));
		list.add(new Bean(ITEM, "������"));
		list.add(new Bean(ITEM, "����˹̹"));
		list.add(new Bean(ITEM, "��ѩ��"));
		return list;
	}
}
