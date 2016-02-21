package com.example.leesunwoo.recentproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * 메인문.
 */
public class MainActivity extends Activity {
    // 메뉴버튼
    public MenuButton c_menuBtn = new MenuButton();
    // 화면 중앙에 들어가게 될 웹뷰
    private WebView webview;
    //리스트 뷰 설정
    ListView listView;
    IconTextListAdapter Listadapter;
    //리스트 저장 변수.
    String[] curData;
    /**
     * 버튼 초기화 구문.
     */
    public void buttonSetting() {
        c_menuBtn.setM_HomeBtn((Button) findViewById(R.id.home_btn));
        c_menuBtn.setM_CreateBtn((Button) findViewById(R.id.create_btn));
        c_menuBtn.setM_ListBtn((Button) findViewById(R.id.list_btn));
        c_menuBtn.setM_InfoBtn((Button) findViewById(R.id.info_btn));
        c_menuBtn.setM_backBtn((Button) findViewById(R.id.backBtn));
        c_menuBtn.setM_backBtn((Button) findViewById(R.id.refresh_btn));
    }

    /**
     * 기본적으로 띄워주는 곳.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //버튼 세팅
        buttonSetting();
        //웹 세팅
        // webSetting();
        //리스트뷰 세팅
        listView = (ListView) findViewById(R.id.startList);
        //어뎁터 객체 생성
        Listadapter = new IconTextListAdapter(this);

        ///////////////////////////
        //아이템 데이터 임시 생성 추후에 지워줘야됨
        Listadapter.addItem(new IconTextItem(getResources().getDrawable(R.drawable.male_img, null), "주안역 1시 출발", "2016-02-14", "5명"));
        Listadapter.addItem(new IconTextItem(getResources().getDrawable(R.drawable.male_img, null), "주안역 2시 출발", "2016-02-13", "1명"));
        Listadapter.addItem(new IconTextItem(getResources().getDrawable(R.drawable.female_img, null), "주안역 3시 출발", "2016-02-12", "2명"));

        listView.setAdapter(Listadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                IconTextItem curItem = (IconTextItem) Listadapter.getItem(position);
                curData = curItem.getstrArrData();
                //대화상자
                AlertDialog dialog = itemClickDialogBox();
                dialog.setTitle("참여");
                dialog.setMessage(curData[0] + "\n"
                        + curData[1] + "\n" + curData[2] + "\n" + "참여하시겠습니까?");

                dialog.show();
            }
        });
//        try
//        {
//
//        }catch (Exception e){
//            Log.e("dd",e.toString());
//        }
//        Log.e("MainActivity_C","텍스트뷰가 잘못된거");
    }

    /**
     * 아이템 눌렀을때 띄워주는 화면
     * @return
     */
    private AlertDialog itemClickDialogBox()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //예 버튼 설정
        builder.setPositiveButton("예",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton)
                    {

                    }
                }
        );

        builder.setNegativeButton("아니오",
                                    new DialogInterface.OnClickListener()
                                    {
                                        public void onClick(DialogInterface dialog, int whichButton)
                                        {

                                        }
                                    }
                                );

        AlertDialog dialog = builder.create();
        return dialog;
    }


    protected void onPause()
    {
        super.onPause();


    }
    protected void onRestart()
    {
        super.onRestart();
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    /**
     * 뒤로가기 버튼 누를 경우.
     * @param v
     */
//    public void backBtnClicked(View v)
//    {
//        if(webview.canGoBack())
//        {
//            webview.goBack();
//        }
//    }
    /**
     * 각 버튼에 대한 구문, refresh create,home, list 버튼등
     */
//    public void refreshBtnClicked(View v)
//    {
//        webview.reload();
//    }

    public void createBtnClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Main_Create_Btn_Page.class);
        startActivity(intent);
        finish();
    }

    public void homeBtnClicked(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

//    public void listBtnClicked(View v) {
//        webview.loadUrl("http://m.daum.net");
//    }

    /**
     * 인포메이션 버튼
     * @param v
     */
//    public void infoBtnClicked(View v) {
//        Toast.makeText(this, "infomation", Toast.LENGTH_LONG).show();
//        webview.loadUrl("http://m.daum.net");
//    }


}
