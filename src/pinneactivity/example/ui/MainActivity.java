package pinneactivity.example.ui;

import pinneactivity.example.view.PinnedSectionListView;
import pinneactivity.example.view.PinnedSectionListView.IXListViewListener;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements IXListViewListener{

	private boolean hasHeaderAndFooter;
	private boolean isFastScroll;
	private boolean addPadding;
	private boolean isShadowVisible = true;
	private PinnedSectionListView listview;
	private AdapterListView adapter;

//	@Override
//	protected void onSaveInstanceState(Bundle outState) {
//		// TODO Auto-generated method stub
//		super.onSaveInstanceState(outState);
//		outState.putBoolean("isFastScroll", isFastScroll);
//		outState.putBoolean("addPadding", addPadding);
//		outState.putBoolean("isShadowVisible", isShadowVisible);
//		outState.putBoolean("hasHeaderAndFooter", hasHeaderAndFooter);
//	}
//	@Override
//	protected void onRestoreInstanceState(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onRestoreInstanceState(savedInstanceState);
//		isFastScroll = savedInstanceState.getBoolean("isFastScroll");
//		addPadding = savedInstanceState.getBoolean("addPadding");
//		isShadowVisible = savedInstanceState.getBoolean("isShadowVisible");
//		hasHeaderAndFooter = savedInstanceState.getBoolean("hasHeaderAndFooter");
//	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initAdapter();
		initializePadding();
	}
	
	@SuppressLint("NewApi")
	private void initView() {
		listview=(PinnedSectionListView)findViewById(R.id.pinnedSectionListView1);
		listview.setAdapter(null);

		View view= HeadView.getInstance(this).initialization().getView();
		view.setPadding(10, 5, 10, 5);
		listview.addHeaderView(view);


		listview.setFastScrollEnabled(true);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			listview.setFastScrollAlwaysVisible(true);
		}
	}
	
	private void initAdapter() {
		adapter=new AdapterListView(this,Bean.getData());
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(getListenerForListView());
		listview.setXListViewListener(this);
	}
	
	private void initializePadding() {
		float density = getResources().getDisplayMetrics().density;
		int padding = addPadding ? (int) (16 * density) : 0;
		listview.setPadding(padding, padding, padding, padding);
	}
	
	private OnItemClickListener getListenerForListView() {
		// TODO Auto-generated method stub
		return new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				if(position>0){
					Bean bean=adapter.getItem(position-1);
					if(bean.type==Bean.ITEM){
						Toast.makeText(MainActivity.this, bean.text, Toast.LENGTH_SHORT).show();
					}
				}
			}
		};
	}

	@Override
	public void onRefresh() {
		listview.stopRefresh();
	}

	@Override
	public void onLoadMore() {
		
	}
	
	
	



}
