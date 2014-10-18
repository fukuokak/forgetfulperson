package jp.co.fukuokak.forgetfulperson;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;

import jp.co.fukuokak.forgetfulperson.util.CommonUtilities;

/**
 * Created by fukuokak on 2014/10/17.
 */
class CommonUtilitiesTest extends ActivityInstrumentationTestCase2<CommonUtilities> {

    private CommonUtilities comUtil ;

    public CommonUtilitiesTest() {
        super(CommonUtilities.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        comUtil = getActivity();
    }

    public void Case1_PrintString() {

        assertEquals(comUtil.printString("TestCase1"), "TestCase2");

    }


}

