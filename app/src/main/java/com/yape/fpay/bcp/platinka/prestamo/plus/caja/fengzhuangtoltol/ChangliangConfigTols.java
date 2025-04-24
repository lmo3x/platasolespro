package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.util.Base64;

public class ChangliangConfigTols {


    public static String COUNTTY_ADDRESS = "https://temp.prestamomio.com/tuprestamoya";//秘鲁-测试环境
//    public static String COUNTTY_ADDRESS = "https://peru.prestamomio.com/tuprestamoya";//秘鲁-线上环境

    public static boolean jsonUpload = false; //是否上传中
    public static boolean jsonUploadStatus = false; //上传是否成功
    public static String BASEHEAD_DIZHI = COUNTTY_ADDRESS;//默认西班牙

    //首页（未登录）
    public static final String HOMEPAGE_FOR_UNLOGIN = BASEHEAD_DIZHI + "/lung/affordStupidIce";
    //首页（多产品）
    public static final String HOOK_MAGIC_PAST = BASEHEAD_DIZHI + "/drink/punishMuchCommunication";
    //订单页
    public static final String REALISE_RUDE_TOWN = BASEHEAD_DIZHI + "/drink/unfitDisadvantagePedestrian";
    // 复制用户信息
    public static final String Return_Digest_Shopping = BASEHEAD_DIZHI + "/attractiveAddition/snakeCleverKey";


    // 获取验证码
    public static final String LOGIN_GETCODE = BASEHEAD_DIZHI + "/bath/showTheoreticalCountry";
    // 登录注册
    public static final String LOGIN_REGISTERORLOGIN = BASEHEAD_DIZHI + "/bath/hateAliveAstronomy";
    // 查询银行卡
    public static final String YINKA_SERCH = BASEHEAD_DIZHI + "/midnight/trustTiresomeDirector";
    // 配置接口（字典）获取谷歌评论等开关
    public static final String GUGESARTSPINGLUN = BASEHEAD_DIZHI + "/lung/canAfricanPace";

    // 查询工作基本联系人身份信息-x
    public static final String GONGZUOLXR_SERACH_XXX = BASEHEAD_DIZHI + "/midnight/defeatImportantMeeting";
    // 查询工作基本联系人身份信息-b
    public static final String GONGZUOLXR_SERACH_BBB = BASEHEAD_DIZHI + "/midnight/defeatImportantMeeting";
    // 查询工作基本联系人身份信息
    public static String GONGZUOLXR_SERACH_SHENFEN = GONGZUOLXR_SERACH_XXX;

    // 保存工作基本联系人身份信息-x
    public static final String GONGZUOLXR_SAVE_XXX = BASEHEAD_DIZHI + "/midnight/testModestQuiz";
    // 保存工作基本联系人身份信息-b
    public static final String GONGZUOLXR_SAVE_BBB = BASEHEAD_DIZHI + "/midnight/testModestQuiz";
    // 保存工作基本联系人身份信息
    public static String GONGZUOLXR_SAVE_SHENFEN = GONGZUOLXR_SAVE_XXX;

    // 保存联系人身份信息-b
    public static final String LIANXIPEOPLE_SAVE_BBB = BASEHEAD_DIZHI + "/midnight/testModestQuiz";
    // 查询联系人身份信息-b
    public static final String LIANXIPEOPLE_SEARCH_BBB = BASEHEAD_DIZHI + "/midnight/defeatImportantMeeting";

    // 查询字典workType
    public static final String SEARCH_ZIDIAN_LEIXING = BASEHEAD_DIZHI + "/lung/pumpCrazyDiamond";
    // 查询地区
    public static final String SEARCH_DIQUQUARE = BASEHEAD_DIZHI + "/lung/determineUncertainTokyo";
    //保存银行卡信息
    public static final String YINHANGKA_SAVE_OTP = BASEHEAD_DIZHI + "/midnight/electMildTourism";
    //保存银行卡信息
    public static final String YINHANGKA_SAVE = BASEHEAD_DIZHI + "/midnight/industryHarmfulNoise";

    //上传身份证照片
    public static final String SHANGCHUAN_SHENFENZHENG = BASEHEAD_DIZHI + "/midnight/digLatestAstronaut";
    public static final String SHANGCHUAN_DANZHANGSHENFENZHENG = BASEHEAD_DIZHI + "/midnight/frightenMerchantBathtub";
    //获取照片
    public static final String GET_SHENFEN_PICTURE = BASEHEAD_DIZHI + "/midnight/exploitBoundSecondhand";

    //查询商品信息
    public static final String SEARCH_SHANGPIN = BASEHEAD_DIZHI + "/drink/restrictHorribleCrew";
    //查询期限修正数
    public static final String SEARCH_FIXNUM = BASEHEAD_DIZHI + "/lung/pumpCrazyDiamond";
    //试算贷款信息信息
    public static final String SEARCH_COUNTTRAIL = BASEHEAD_DIZHI + "/drink/uselessSoccerMediumKey";
    //预提交贷款信息信息
    public static final String SEARCH_YUTIJIAODAIKUANXINXI = BASEHEAD_DIZHI + "/deadline/lookNoisyTheory";
    //提交贷款信息
    public static final String SEARCH_TIJIAODAIKUANXINXI = BASEHEAD_DIZHI + "/drink/blindLiteratureConsiderateDam";

    //查询电话
    public static final String SEARCH_ZHUAJINUM_XXX = BASEHEAD_DIZHI + "/lung/deliverCrazyCousin";
    //查询电话
    public static final String SEARCH_ZHUAJINUM_BBB = BASEHEAD_DIZHI + "/lung/colourFoggyCamel";
    //查询电话
    public static String SEARCH_ZHUAJINUM_DIANHUA = BASEHEAD_DIZHI + SEARCH_ZHUAJINUM_XXX;

    //横幅图片
    public static final String HENGFUTUPIAN = BASEHEAD_DIZHI + "/lung/terrifySpareEdition";
    //还款链接-展期还款链接
    public static final String KUANHUANLIANJIE = BASEHEAD_DIZHI + "/deadline/reciteHungryLunch";
    //展期詳情
    public static final String ZHANQIXIANGQING = BASEHEAD_DIZHI + "/deadline/smokeIrishThread";
    //拒绝退款状态
    public static final String JUJUEZHUANGTAI = BASEHEAD_DIZHI + "/attractiveAddition/prayJustPilot";
    //josn
    public static final String DASHUJUJSON = BASEHEAD_DIZHI + "/mostGlobe/defendGreyMile";
    public static final String DASHUJUJSON3 = BASEHEAD_DIZHI + "/mostGlobe/sharpenSquareDepth";

    //埋点
    public static final String CLICKEVENT = BASEHEAD_DIZHI + "/lung/describeConsiderateBarbecue";
    //新风控埋点
    public static final String NEWCLICKEVENT = BASEHEAD_DIZHI + "/lung/rowFunnyTent";
    //获取还款方式列表
    public static final String HUANKUANFANGSHI = BASEHEAD_DIZHI + "/spoonful/splitPacificPaperwork";

    //还款方式选择 getpayinfo
    public static final String HUOQUZHIFUXINXI = BASEHEAD_DIZHI + "/spoonful/leadFreeSpirit";

    //获取合同 commonContractList
    public static final String HUOQUDAIKUANHETONG = BASEHEAD_DIZHI + "/deadline/printThatAnimal";

    //获取还款计划
    public static final String HUOQUHUANKUANJIHUA = BASEHEAD_DIZHI + "/drink/roundaboutSceneDelightedGovernment";


    //获取还款详情 getPayInfoInstallment
    public static final String HUOQUZHIFUXINXI1 = BASEHEAD_DIZHI + "/drink/energeticMouthfulShowerCousin";

    //获取验证码-修改银行卡
    public static final String HUOQUYANZHENGMA = BASEHEAD_DIZHI + "/bath/letUnfairDivision";
    //获取提前还款弹框文案
    public static final String HUOQUTIQIANHUANKUANWENAN = BASEHEAD_DIZHI + "/battleground/perfectPrisonMinusShortLion";

    //google 支付地址 兼容
    public static String WEBGUGE = new String(Base64.decode("aHR0cHM6Ly9wbGF5Lmdvb2dsZS5jb20vc3RvcmUvYXBwcy9kZXRhaWxzP2lkPQ==", Base64.DEFAULT));


    //产品copy信息
    public static final String KAOBEIXINXI2 = BASEHEAD_DIZHI + "/attractiveAddition/castSpanishCeiling";
    //查询是否需要上传json
    public static final String SHIFOUSHANGCHUANJSON = BASEHEAD_DIZHI + "/mostGlobe/stopReasonableBrick";
    //查询风控金额接口
    public static final String CHAXUNFENGKONGJINE = BASEHEAD_DIZHI + "/busySlavery/rewindLivingFibre";
    //上传json数据
    public static final String SHANGCHUANDAJSON5 = BASEHEAD_DIZHI + "/mostGlobe/misunderstandStandardSon";
    //app检测更新接口
    public static final String GENGXINYINGYONG = BASEHEAD_DIZHI + "/lung/deliverCrazyCousin";

    //判断页面完善程度接口
    public static final String JINJIANYEWANSHAN =  BASEHEAD_DIZHI + "/midnight/exploitBoundSecondhand";

}
