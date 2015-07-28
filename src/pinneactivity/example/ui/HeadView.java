package pinneactivity.example.ui;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;

/*
 * Fail view
 * 
 * @author YangWenlong
 */
public class HeadView implements OnClickListener{
	private View view = null;
	private Activity activity;
	private LinearLayout newFriends;
	private LinearLayout grop;
	private LinearLayout tag;
	private LinearLayout publicNumber;
	private static HeadView headView = null;

	public static HeadView getInstance(Activity activity) {
			headView = new HeadView(activity);
		return headView;
	}

	public HeadView(Activity activity) {
		view=activity.getLayoutInflater().inflate(R.layout.item_head, null);
		this.activity=activity;
	}

	public HeadView initialization(){
        newFriends=(LinearLayout)view.findViewById(R.id.layout_new);
        grop=(LinearLayout)view.findViewById(R.id.layout_group);
        tag=(LinearLayout)view.findViewById(R.id.layout_tag);
        publicNumber=(LinearLayout)view.findViewById(R.id.layout_public);

        newFriends.setOnClickListener(this);
        grop.setOnClickListener(this);
        tag.setOnClickListener(this);
        publicNumber.setOnClickListener(this);


		return headView;
	}

	public View getView(){
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==newFriends){
			Toast.makeText(activity, "新朋友", Toast.LENGTH_SHORT).show();
		}else if(v==grop){
			Toast.makeText(activity, "群聊", Toast.LENGTH_SHORT).show();
		}else if(v==tag){
			Toast.makeText(activity, "标签", Toast.LENGTH_SHORT).show();
		}else if(v==publicNumber){
			Toast.makeText(activity, "公众号", Toast.LENGTH_SHORT).show();
		}
	}
}
