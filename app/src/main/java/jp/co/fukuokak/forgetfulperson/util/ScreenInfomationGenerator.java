package jp.co.fukuokak.forgetfulperson.util;

import jp.co.fukuokak.forgetfulperson.R;

import android.app.Fragment;
import android.content.res.Resources;

public class ScreenInfomationGenerator extends Fragment {

    Integer screenNo = null;
    String screenName = "";
    String tTitle = "";

    /**
     * screenName
     *
     * @return screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * screenName
     *
     * @param screenName screenName
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * screenNo
     *
     * @return screenNo
     */
    public Integer getScreenNo() {
        return screenNo;
    }

    /**
     * screenNo
     *
     * @param screenNo screenNo
     */
    public void setScreenNo(Integer screenNo) {
        this.screenNo = screenNo;
    }


    /**
     * tTitle
     *
     * @return tTitle
     */
    public String gettTitle() {
        return tTitle;
    }

    /**
     * tTitle
     *
     * @param tTitle tTitle
     */
    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }


    public ScreenInfomationGenerator screenInfomationSelector(Integer num) {
        ScreenInfomationGenerator sc = new ScreenInfomationGenerator();
        Resources r = getActivity().getResources();
        String menuFlag = "";

        switch (num) {
            case 1:
                menuFlag = r.getString(R.string.mon);
                break;
            case 2:
                menuFlag = r.getString(R.string.tue);
                break;
            case 3:
                menuFlag = r.getString(R.string.wed);
                break;
            case 4:
                menuFlag = r.getString(R.string.thu);
                break;
            case 5:
                menuFlag = r.getString(R.string.fri);
                break;
            case 6:
                menuFlag = r.getString(R.string.sat);
                break;
            case 7:
                menuFlag = r.getString(R.string.sun);
                break;
            case 8:
                menuFlag = r.getString(R.string.today);
                break;

        }


        switch (num) {
            case 1:
                sc.setScreenName(getString(R.string.mon));
                sc.settTitle(getString(R.string.mon_title));
                sc.setScreenNo(num);
                break;
            case 2:
                sc.setScreenName(getString(R.string.tue));
                sc.settTitle(getString(R.string.tue_title));
                sc.setScreenNo(num);
                break;
            case 3:
                sc.setScreenName(getString(R.string.wed));
                sc.settTitle(getString(R.string.wed_title));
                sc.setScreenNo(num);
                break;
            case 4:
                sc.setScreenName(getString(R.string.thu));
                sc.settTitle(getString(R.string.thu_title));
                sc.setScreenNo(num);
                break;
            case 5:
                sc.setScreenName(getString(R.string.fri));
                sc.settTitle(getString(R.string.fri_title));
                sc.setScreenNo(num);
                break;
            case 6:
                sc.setScreenName(getString(R.string.sat));
                sc.settTitle(getString(R.string.sat_title));
                sc.setScreenNo(num);
                break;
            case 7:
                sc.setScreenName(getString(R.string.sun));
                sc.settTitle(getString(R.string.sun_title));
                sc.setScreenNo(num);
                break;
            case 8:
                sc.setScreenName(getString(R.string.analysis));
                sc.settTitle(getString(R.string.analysis_title));
                sc.setScreenNo(num);
                break;
            case 9:
                sc.setScreenName(getString(R.string.stocktaking));
                sc.settTitle(getString(R.string.stocktaking_title));
                sc.setScreenNo(num);
                break;
        }

        return sc;

    }
}
