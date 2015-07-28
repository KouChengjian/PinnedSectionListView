package pinneactivity.example.ui;

import java.util.ArrayList;

import pinneactivity.example.view.PinnedSectionListView.PinnedSectionListAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/*
 * 
 * This is company of adapter
 * 
 * @author YangWenlong
 */
public class AdapterListView extends BaseAdapter implements PinnedSectionListAdapter{
	private ArrayList<Bean> list;
	private Context context;
	public ArrayList<Bean> getList() {
		return list;
	}
	public void setList(ArrayList<Bean> list) {
		if(list!=null){
			this.list = list;
		}else{
			list=new ArrayList<Bean>();
		}
	}
	public AdapterListView(Context context,ArrayList<Bean> list){
		this.setList(list);
		this.context=context;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Bean getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View converView, ViewGroup viewGrop) {
		// TODO Auto-generated method stub
		ViewHolder vh=null;
		if(converView==null){
			vh=new ViewHolder();
			converView=LayoutInflater.from(context).inflate(R.layout.item, null);
			vh.company_item=(TextView)converView.findViewById(R.id.title);
			vh.image=(ImageView)converView.findViewById(R.id.imageView1);
			converView.setTag(vh);
		}else{
			vh=(ViewHolder) converView.getTag();
		}
		Bean bean=getItem(position);
		vh.company_item.setText(bean.text);
		if (bean.type == Bean.SECTION) {
			vh.company_item.setBackgroundResource(R.drawable.bao_headview_bg);
			vh.image.setVisibility(View.GONE);
			
		}else{
			vh.company_item.setBackgroundResource(R.drawable.details_layout_bg);
			vh.image.setVisibility(View.VISIBLE);
		}
		return converView;
	}
	@Override
	public boolean isItemViewTypePinned(int viewType) {
		// TODO Auto-generated method stub
		return viewType == Bean.SECTION;//0是标题，1是内容
	}

	@Override
	public int getViewTypeCount() {
		return 2;//2种view的类型 baseAdapter中得方法
	}
	
	@Override
	public int getItemViewType(int position) {
		return ((Bean)getItem(position)).type;
	}
	
	public void refresh(ArrayList<Bean> arr){
        setList(arr);
        notifyDataSetChanged();
    }

}
