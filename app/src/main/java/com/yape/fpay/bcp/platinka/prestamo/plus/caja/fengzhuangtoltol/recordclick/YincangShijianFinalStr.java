package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.recordclick;

import com.appsflyer.AFInAppEventType;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
//import com.google.firebase.analytics.FirebaseAnalytics;

//import io.branch.referral.util.BRANCH_STANDARD_EVENT;


public class YincangShijianFinalStr {

    /**
     * 新埋点
     */

    //三方埋点1  注册
    public static final String THREECOMPANY_FB_1 = AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION;
    public static final String THREECOMPANY_FIB_1 = FirebaseAnalytics.Event.SIGN_UP;
//    public static final BRANCH_STANDARD_EVENT THREECOMPANY_BRH_1 = BRANCH_STANDARD_EVENT.COMPLETE_REGISTRATION;
    public static final String THREECOMPANY_FLYER_1 = AFInAppEventType.COMPLETE_REGISTRATION;
    //三方埋点2  首次保存身份信息
    public static final String THREECOMPANY_FB_2 = AppEventsConstants.EVENT_NAME_SUBSCRIBE;
    public static final String THREECOMPANY_FIB_2 = FirebaseAnalytics.Event.ADD_SHIPPING_INFO;
//    public static final BRANCH_STANDARD_EVENT THREECOMPANY_BRH_2 = BRANCH_STANDARD_EVENT.SUBSCRIBE;
    public static final String THREECOMPANY_FLYER_2 = AFInAppEventType.SUBSCRIBE;
    //三方埋点3  首次保存卡信息
    public static final String THREECOMPANY_FB_3 = AppEventsConstants.EVENT_NAME_ADDED_TO_CART;
    public static final String THREECOMPANY_FIB_3 = FirebaseAnalytics.Event.ADD_TO_CART;
//    public static final BRANCH_STANDARD_EVENT THREECOMPANY_BRH_3 = BRANCH_STANDARD_EVENT.ADD_TO_CART;
    public static final String THREECOMPANY_FLYER_3 = AFInAppEventType.ADD_TO_CART;
    //三方埋点4  首代申请成功
    public static final String THREECOMPANY_FB_4 = AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT;
    public static final String THREECOMPANY_FIB_4 = FirebaseAnalytics.Event.BEGIN_CHECKOUT;
//    public static final BRANCH_STANDARD_EVENT THREECOMPANY_BRH_4 = BRANCH_STANDARD_EVENT.INITIATE_STREAM;
    public static final String THREECOMPANY_FLYER_4 = AFInAppEventType.INITIATED_CHECKOUT;

    //自身系统埋点 老风控埋点

    /*** 未登录/已登录 */
    //安装（通过监听INSTALL_REFERRER的Receiver实现）
    public static final String INSTALLAPP = "TELEGRAPH_UGLY_SLEEP";//+YincangShijianClickTols.appshasahId
    //打开APP
    public static final String JINRUAPP = "BLOCK_GERMAN_DIVISION";//  1
    //隐藏APP
    public static final String YINCNAGAPP = "PLANT_PART_LESSON";//+YincangShijianClickTols.appshasahId
    //唤起任务列表
    public static final String HUANQIRENWULIEB = "ADVERTISE_AFRICAN_PULSE";//+YincangShijianClickTols.appshasahId
    //关闭APP（通过Service实现，不必保证每次都打成功）
    public static final String GUANBILIANGLIANGAPP = "RUIN_DELIGHTED_STEAK";//+YincangShijianClickTols.appshasahId

    /*** 权限文案页 */
    //进入权限文案页
    public static final String JINRUWENANYE = "FIT_NORMAL_POSTCODE";
    //点击权限文案页同意按钮
    public static final String DIANJIWENANYETONGYIBTN = "BARK_STEADY_POEM";
    //权限文案页授权结果（当弹出授权弹窗时）
    public static final String WENANYESHOUQUANJIEGUO = "BURY_GRAND_PADDLE";
    //点击权限文案页跳过按钮
    public static final String DIANJIWENANYETIAOGUOBTN = "DIE_POP_PIG";

    /*** 登录页面 */
    //进入登录页
    public static final String JINRUDENGLUYE = "EASE_PRIMARY_FIREWORKS";
    //点击发送验证码按钮（包括自动发送）
    public static final String DIANJIFASONGYZM = "AFFORD_HEALTHY_QUALITY";
    //点击登录按钮
    public static final String DIANJIDENGLUBTNANNIU = "MOVE_SEVERAL_TYRE";
    //点击登录页返回按钮
    public static final String DIANJIDENGLUYEFANHUI = "TRANSLATE_QUIET_STOVE";
    //注册成功（newCustFlag=1）
    public static final String ZHUCECHENGONG = "BOMB_FAMOUS_ADVERTISEMENT";
    public static final String DENGLUCHENGGONG = "READ_POWERFUL_ROOT";  //1
    //进入验证码页（验证码页与登录页分开时） 本app没有
    public static final String JINRUYANZHENGMAYE = "SYSTEM_CODE_ENTER";
    //点击验证码页返回按钮（验证码页与登录页分开时）本app没有
    public static final String DIANJIYANZHENGMAYEFANHUI = "SYSTEM_CODE_BACK";

    /*** 我的页面 */
    //点击我的页退出按钮
    public static final String DIANJIWODETUICHU = "CREATE_PUZZLED_UNIFORM";

    /*** 首页 */
    //进入首贷首页（每次）
    public static final String JINRUSHOUDAIYEEVEVYONEITME = "CARVE_MOBILE_KNOWLEDGE";
    //点击申请按钮
    public static final String DIANJISHENQINGBTN = "EQUAL_SUDDEN_STAIR";//1
    //主产品首贷点击申请按钮
    public static final String DIANJISHENQINGBTNFIRST = "INTERRUPT_LEARNED_ZIPPER";

    /*** 个人信息页面 */
    //进入个人信息页
    public static final String JINRUGERENXINXIYE = "FIND_UNTRUE_JEWELRY";
    //个人信息页数据加载完成
    public static final String GERENXINXIYESHUJUJIAZAIWANCHENG = "RECOGNISE_CONSIDERATE_PAIN";
    //进入个人信息页（页面回显信息全部为空时打，保存成功后不再打）
    public static final String JINRUGERENXINXIYEXINXIFIRST = "FORESEE_ELECTRONIC_SOMEONE";//1
    //点击个人信息页提交按钮并通过验证（页面回显信息全部为空时打，保存成功后不再打）
    public static final String DIANJIGERENXINXIYETIJIAOFIRST = "DIG_MALE_ICE";//1
    //点击个人信息页提交按钮
    public static final String DIANJIGERENXINXIYETIJIAOEVETYTIME = "PUT_AGGRESSIVE_DISADVANTAGE";//1
    //个人信息页返回上一页
    public static final String DIANJIGERENXINXIYEFANHUI = "SPEED_PUBLIC_STOMACH";


    /*** 联系人信息页面 */
    //进入联系人信息页
    public static final String JINRULIANXIRENYE = "FORGIVE_GAY_FOOTBALL";
    //联系人信息页数据加载完成
    public static final String LIANXIRENYEJIAZAIWAN = "CAST_FACIAL_STOMACHACHE";
    //进入联系人信息页（页面回显信息全部为空时打，保存成功后不再打）
    public static final String JINRULIANXIRENYEFIRST = "SORT_HEALTHY_CONGRATULATION";
    //点击联系人信息页提交按钮并通过验证（页面回显信息全部为空时打，保存成功后不再打）
    public static final String DIANJILIANXIRENTIJIAOBINGJIAOYANGUO = "TEACH_GRATEFUL_THEIR";//1
    //点击联系人页提交按钮
    public static final String DIANJILIANXIRENTIJIAOEVEYTTIME = "TREMBLE_UNTRUE_SUNDAY";//1
    //点击联系人抓取授权同意按钮（联系人权限去掉用不到了）
    public static final String DIANJILIANXIRENZHUAQUTONGYI = "CROWD_BEST_SPOONFUL";
    //点击联系人抓取授权拒绝按钮（联系人权限去掉用不到了）
    public static final String DIANJILIANXIRENZHUAQUJUJUE = "CLICK_CONTACT_CANCEL";
    //当弹出授权弹窗时，联系人抓取授权结果（联系人权限去掉用不到了）
    public static final String LIANXIRENZHUAQUJIEGUO = "SHOCK_MAIN_COURAGE";
    //点击数据抓取授权同意按钮
    public static final String DIANJISHUJUZHUAQUTONGYI = "CLEAN_BRITISH_RICE";
    //点击数据抓取授权拒绝按钮
    public static final String DIANJISHUJUZHUAQUJUJUE = "BEAR_HALF_MISS";
    //当弹出授权弹窗时，数据抓取授权结果
    public static final String SHUJUZHUAQUJIEGUO = "DIE_VIOLENT_NOTEBOOK";
    //数据抓取授权全部通过（页面回显信息全部为空时打，保存成功后不再打）
    public static final String SHUJUZHUAQUSHOUQUANTONGGUOFIRST = "SPEAK_EXCELLENT_TAIL";
    //开始上传设备数据
    public static final String KAISHISHANGCHAUNSHUJU = "SUGGEST_HEALTHY_CHOCOLATE";
    //完成上传设备数据
    public static final String WANCHENGSHANGCHUANSHUJU = "BEHAVE_THOSE_SETTLER";
    //联系人信息页返回上一页
    public static final String LIANXIRENYEFANHUI = "MARK_INTERESTING_TAX";


    /*** 身份信息页面 */
    //进入身份信息页
    public static final String JINRUSHENFENYE = "CLIMB_SOLID_PAINTING";//1 RETIRE_EGYPTIAN_JEEP
    //身份信息页数据加载完成
    public static final String SHENFENYEJIAZAIWAN = "TRANSLATE_CLASSICAL_DIET";
    //身份照片数据加载完成
    public static final String SHENFENZHAOPIANJIAZAIWAN = "ASK_MORAL_ARM";
    //当弹出授权弹窗时，拍照授权结果
    public static final String PAIZHAOSHOUQUANJIEGUO = "DECORATE_EAGER_REGARDS";
    //点击正面
    public static final String DIANJIZHENGMIAN = "COLOUR_LIQUID_ENQUIRY";//1
    //正面拍照成功
    public static final String ZHENGMIANPAICHENGGONG = "LACK_FALSE_HAIRCUT";//1
    //正面拍照失败
    public static final String ZHENGMIANPAISHIBAI = "IMAGINE_CORDLESS_COUNTRYSIDE";
    //点击反面
    public static final String DIANJIFANMIAN = "NOTE_STEEP_FOOT";
    //反面拍照成功
    public static final String FANMIANPAICHENGGONG = "ADVISE_FUNNY_SHADE";
    //反面拍照失败
    public static final String FANMIANPAISHIBAI = "SATISFY_MEDICAL_KID";
    //开始上传身份证（正反面同时上传时）
    public static final String KAISHISHANGCHAUNSHENFENZHENG = "EQUIP_RAW_PHOTOGRAPH";
    //正面有照片时上传反面或反面有照片时上传正面（正反面分开上传时） 此包是同时上传所以这个埋点用不到
    public static final String ZHENGMIANMIANFENKAISHANGCHUAN = "EQUIP_RAW_PHOTOGRAPH";
    //上传身份证照片（页面回显身份证照片全部为空时打，保存成功后不再打）
    public static final String SHANGCHAUNSHENFENZHAOFIRST = "DECLARE_THAT_THEMSELVES";
    //点击人脸
    public static final String DIANJIRENLIAN = "JOIN_LEFTOVER_SOCIETY";
    //人脸拍照成功
    public static final String RENLIANCHENGONG = "CLOSE_ASLEEP_INSURANCE";
    //人脸拍照失败
    public static final String RENLIANSHIBAI = "RESERVE_HAPPY_SHARPENER";
    //上传人脸（页面回显人脸照片为空时打，上传成功后不再打）
    public static final String SHANGCHUANRENLIANFIRST = "CONDUCT_HUMAN_GAS";
    //点击身份信息页提交按钮
    public static final String SHENFENTIJIAO = "COLOUR_GOOD_QUANTITY";
    //点击身份信息页提交按钮并通过验证（页面回显信息全部为空时打，保存成功后不再打）
    public static final String SHENFENTIJIAOJIAOYANTONGGUOFIRST = "TEACH_CUBIC_TRAINER";
    //身份信息页返回上一页
    public static final String SHENFENYEFANHUI = "GET_MAN_CHALK";


    /*** 卡信息页面 */
    //进入银行卡信息页
    public static final String JINRUKAYE = "REDIRECT_HILLY_PHOTO";
    //银行卡信息页数据加载完成
    public static final String KAYEJIAZAIWAN = "NOTICE_CENTIGRADE_UNIFORM";
    //进入银行卡信息页（页面回显信息全部为空时打，保存成功后不再打）
    public static final String JINRUKAYEFIRST = "COMMAND_LEADING_PARDON";
    //点击银行卡页提交按钮并通过验证（页面回显信息全部为空时打，保存成功后不再打）
    public static final String DIANJIKATIJIAOBINGJIAOYANGUO = "CALL_SCOTTISH_GREETING";
    //放款失败时，点击银行卡更新页提交按钮
    public static final String DIANJIKAGENGXINTIJIAO = "TAKE_UPSET_PING";
    //点击银行卡页提交按钮
    public static final String DIANJIKATIJIOAEVEVYTIME = "HIDE_PAINFUL_COMMA";
    //银行卡页返回上一页
    public static final String KAYEFANHUI = "INVENT_POPULAR_TRIP";

    /*** 风控等待页面 */
    //进入风控页
    public static final String JINRUFENGKONGYE = "REMOVE_SOCIAL_HAT";
    //风控页跳转下一页
    public static final String DEGNDAIYETIAOZHUANXIAYE = "ENJOY_PROBABLE_BOOKMARK";

    /*** 金额期限页*/
    //进入金额期限页
    public static final String JINRUJINEYE = "ATTACK_LESS_HELICOPTER";
    //金额期限页数据加载完成
    public static final String JINEYEJIAZAIWAN = "PUNCTUATE_UNSUCCESSFUL_SHOT";
    //金额期限页修改金额（含自动选择）
    public static final String XIUGAIJINE = "BOOK_ANGRY_SUITE";
    //金额期限页修改期限（含自动选择）
    public static final String XIUGAIQIXIAN = "PART_MINIBUS_DAUGHTER";
    //当弹出授权弹窗时，定位授权结果
    public static final String DINGWEIJIEGUO = "PUMP_UNABLE_APPEARANCE";
    //点击金额期限页确认按钮
    public static final String JINEYETIJIAO = "DIGITAL_HARMLESS_MINISKIRT";
    //金额期限页返回上一页
    public static final String JINEYEFANHUI = "DASH_HOPELESS_GARAGE";

    /*** 贷款确认页*/
    //进入贷款确认页
    public static final String JINRUQUERENYE = "SHARPEN_UPSET_POSTAGE";
    //点击贷款确认页确认按钮
    public static final String QUERENYETIJIOA = "HIRE_FURNISHED_MEAT";
    //贷款确认页返回上一页（取消）
    public static final String QUERENYEQUXIAO = "HUNT_CORDLESS_SPORT";
    //主产品首贷申请成功（仅老包不变）
    public static final String ZHUCHANPINSHOUDAIOKOLD = "RESERVE_BUSY_COOKIE";
    //主产品首贷申请成功（仅新包使用）
    public static final String ZHUCHANPINSHOUDAIOKNEW = "RESERVE_BUSY_COOKIE";

    /*** 好评弹框页*/
    //主产品首贷申请成功，调起谷歌好评弹窗
    public static final String HAOPINGTANKUANG = "FIX_RICH_BLOW";

    //老风控增加请求定位权限埋点
    public static final String QUANXIANDINGWEI = "READ_MAGIC_EXIT";
    public static final String SHOUYEZHUDINGWEI = "IMPRESS_BASIC_TOWN";
    public static final String JICHUDINGWEI = "PACK_CURIOUS_YOURSELVES";
    public static final String LIANXIRENDINGWEI = "BUTCHER_LAZY_PRAIRIE";
    public static final String SHENFENZHENGDINGWEI = "INCREASE_NEXT_PETROL";
    public static final String YINHANGKADINGWEI = "DOWNLOAD_THAT_DUSTBIN";
    public static final String QUEDINGJIEKUANDINGWEI = "KISS_PINK_DUCKLING";


    //_________新风控埋点_________
    //没有正面照片时点击正面拍照
    public static final String NEWRISK_DIANJIZHENGMIANFIRST = "DROP_DULL_TEMPTATION";

    //没有反面照片时点击反面拍照
    public static final String NEWRISK_DIANJIFANMIANFIRST = "BREAK_THICK_PAPER";

    //没有人脸照片时点击人脸拍照
    public static final String NEWRISK_DIANJIRENLIANFIRST = "REGARD_TOUGH_INTRODUCTION";

    //没有用户信息时进入第一个进件页面（一般为个人信息页）
    public static final String NEWRISK_INTOINFOFIRST = "CRY_LATEST_SCENE";

    //没有用户信息时提交最后一个进件页面成功（一般为银行卡页）
    public static final String NEWRISK_SAVEINFOOVER = "TRUST_DARK_PRESENTATION";

    //正面拍照失败
    public static final String NEWRISK_ZHENGMIANSHIBAI = "ADMIT_SOLID_REPAIRS";

    //反面拍照失败
    public static final String NEWRISK_FANMIANSHIBAI = "SPY_CUBIC_YESTERDAY";

    //人脸拍照失败
    public static final String NEWRISK_RENLIANSHIBAI = "REJECT_ASLEEP_SNOWMAN";

    //登录状态下打开APP
    public static final String NEWRISK_OPENAPPWITHTOKEN = "DISTURB_SENIOR_ACHE";


}
