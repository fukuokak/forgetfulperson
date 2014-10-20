package jp.co.fukuokak.forgetfulperson.util;

import jp.co.fukuokak.forgetfulperson.R;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;

public class ScreenInformationGenerator extends Activity {
    private Integer screenNo = null;
    private String screenName = "";
    private String tTitle = "";
    private CommonUtilities comUtil = new CommonUtilities();

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Integer getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(Integer screenNo) {
        this.screenNo = screenNo;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public ArrayList<String> generateWeekList(Calendar calendar) {

        ArrayList<String> weekdayList = new ArrayList<String>();
        Integer month = calendar.get(Calendar.MONTH) + 1;
        Integer date = calendar.get(Calendar.DATE);
        Integer loopCount = 7;

        weekdayList.add(getString(R.string.today) + "(" + month.toString() + "/"
                + date.toString() + ")");
        for (int i = 1; i <= loopCount; i++) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekdayList.add(getWeekDay(calendar));
        }
        return weekdayList;
    }

    public String getWeekDay(Calendar weekday) {

        Integer month = weekday.get(Calendar.MONTH) + 1;
        Integer date = weekday.get(Calendar.DATE);

        String today = month.toString() + "/"
                + date.toString();

        switch (weekday.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                today = today + "(" + getString(R.string.sun) + ")";
                break;

            case Calendar.MONDAY:
                today = today + "(" + getString(R.string.mon) + ")";
                break;

            case Calendar.TUESDAY:
                today = today + "(" + getString(R.string.tue) + ")";
                break;

            case Calendar.WEDNESDAY:
                today = today + "(" + getString(R.string.wed) + ")";
                break;

            case Calendar.THURSDAY:
                today = today + "(" + getString(R.string.thu) + ")";
                break;

            case Calendar.FRIDAY:
                today = today + "(" + getString(R.string.fri) + ")";
                break;

            case Calendar.SATURDAY:
                today = today + "(" + getString(R.string.sat) + ")";
                break;

        }

        return today;
    }

//    public ScreenInformationGenerator screenInformationSelector(Integer num) {
//        String menuFlag = "";
//        switch (num) {
//            case 1:
//                menuFlag = getString(R.string.mon);
//                break;
//            case 2:
//                menuFlag = getString(R.string.tue);
//                break;
//            case 3:
//                menuFlag = getString(R.string.wed);
//                break;
//            case 4:
//                menuFlag = getString(R.string.thu);
//                break;
//            case 5:
//                menuFlag = getString(R.string.fri);
//                break;
//            case 6:
//                menuFlag = getString(R.string.sat);
//                break;
//            case 7:
//                menuFlag =getString(R.string.sun);
//                break;
//            case 8:
//                menuFlag = getString(R.string.today);
//                break;
//
//        }
//
//
//        switch (num) {
//            case 1:
//                setScreenName(getString(R.string.mon));
//                settTitle(getString(R.string.mon_title));
//                setScreenNo(num);
//                break;
//            case 2:
//                setScreenName(getString(R.string.tue));
//                settTitle(getString(R.string.tue_title));
//                setScreenNo(num);
//                break;
//            case 3:
//                setScreenName(getString(R.string.wed));
//                settTitle(getString(R.string.wed_title));
//                setScreenNo(num);
//                break;
//            case 4:
//                setScreenName(getString(R.string.thu));
//                settTitle(getString(R.string.thu_title));
//                setScreenNo(num);
//                break;
//            case 5:
//                setScreenName(getString(R.string.fri));
//                settTitle(getString(R.string.fri_title));
//                setScreenNo(num);
//                break;
//            case 6:
//                setScreenName(getString(R.string.sat));
//                settTitle(getString(R.string.sat_title));
//                setScreenNo(num);
//                break;
//            case 7:
//                setScreenName(getString(R.string.sun));
//                settTitle(getString(R.string.sun_title));
//                setScreenNo(num);
//                break;
//            case 8:
//                setScreenName(getString(R.string.analysis));
//                settTitle(getString(R.string.analysis_title));
//                setScreenNo(num);
//                break;
//            case 9:
//                setScreenName(getString(R.string.stocktaking));
//                settTitle(getString(R.string.stocktaking_title));
//                setScreenNo(num);
//                break;
//        }
//
//        return sc;
//
//    }
}
