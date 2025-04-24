package com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel;

import java.util.List;

//shang pin shitilei
public class ShangpinGoodHaModel {

    private String nuclearTrialSpareMountainousBat;
    private int averageEmbassyNationalVictoryDepth;
    private FanhuiBeanData bigAncientTastyHeadteacher;

    public String getnuclearTrialSpareMountainousBat() {
        return nuclearTrialSpareMountainousBat;
    }

    public void setnuclearTrialSpareMountainousBat(String nuclearTrialSpareMountainousBat) {
        this.nuclearTrialSpareMountainousBat = nuclearTrialSpareMountainousBat;
    }

    public int getaverageEmbassyNationalVictoryDepth() {
        return averageEmbassyNationalVictoryDepth;
    }

    public void setaverageEmbassyNationalVictoryDepth(int averageEmbassyNationalVictoryDepth) {
        this.averageEmbassyNationalVictoryDepth = averageEmbassyNationalVictoryDepth;
    }

    public FanhuiBeanData getRoughNaturalPro() {
        return bigAncientTastyHeadteacher;
    }

    public void setRoughNaturalPro(FanhuiBeanData bigAncientTastyHeadteacher) {
        this.bigAncientTastyHeadteacher = bigAncientTastyHeadteacher;
    }

    public static class FanhuiBeanData {
        private List<ChanpinBean> surroundingAccentUndergroundGrape;
        private String unusualPresidentBoundFever;
        private String slightVanilla;
        private int communistTibetAloneYesterdayFirmNoodle;

        public List<ChanpinBean> getRedChair() {
            return surroundingAccentUndergroundGrape;
        }

        public void setRedChair(List<ChanpinBean> surroundingAccentUndergroundGrape) {
            this.surroundingAccentUndergroundGrape = surroundingAccentUndergroundGrape;
        }

        public String getHillyNoisyRuler() {
            return unusualPresidentBoundFever;
        }

        public void setHillyNoisyRuler(String unusualPresidentBoundFever) {
            this.unusualPresidentBoundFever = unusualPresidentBoundFever;
        }

        public String getTastyTheatre() {
            return slightVanilla;
        }

        public void setTastyTheatre(String slightVanilla) {
            this.slightVanilla = slightVanilla;
        }

        public int getPrimaryAirThereFamousFreedom() {
            return communistTibetAloneYesterdayFirmNoodle;
        }

        public void setPrimaryAirThereFamousFreedom(int communistTibetAloneYesterdayFirmNoodle) {
            this.communistTibetAloneYesterdayFirmNoodle = communistTibetAloneYesterdayFirmNoodle;
        }

        public static class ChanpinBean {

            public int tastelessLuggageBasement;//id
            public int commonUselessMinority;//日期
            public double indianChannelAbsenceDirtyPear;//费率
            public double conceitedPostmanBoundMinisterSunnyPronunciation;//金额步长
            public double bothCockVillager;//最小金额
            public double eachThemeSecondSalesman;//最大金额
            public boolean isAvailable = true;
            public boolean isSelect = false;
            public double basicSickness;
            public int carefulDifferentChiefMeal; //periodDuration 可分期数

            public int getCarefulDifferentChiefMeal() {
                return carefulDifferentChiefMeal;
            }

            public void setCarefulDifferentChiefMeal(int carefulDifferentChiefMeal) {
                this.carefulDifferentChiefMeal = carefulDifferentChiefMeal;
            }

            public ChanpinBean(int commonUselessMinority,int carefulDifferentChiefMeal, boolean isAvailable) {
                this.commonUselessMinority = commonUselessMinority;
                this.isAvailable = isAvailable;
                this.carefulDifferentChiefMeal = carefulDifferentChiefMeal;
            }

            public int getTastelessLuggageBasement() {
                return tastelessLuggageBasement;
            }

            public void setTastelessLuggageBasement(int tastelessLuggageBasement) {
                this.tastelessLuggageBasement = tastelessLuggageBasement;
            }

            public int getCommonUselessMinority() {
                return commonUselessMinority;
            }

            public void setCommonUselessMinority(int commonUselessMinority) {
                this.commonUselessMinority = commonUselessMinority;
            }

            public double getIndianChannelAbsenceDirtyPear() {
                return indianChannelAbsenceDirtyPear;
            }

            public void setIndianChannelAbsenceDirtyPear(double indianChannelAbsenceDirtyPear) {
                this.indianChannelAbsenceDirtyPear = indianChannelAbsenceDirtyPear;
            }

            public double getConceitedPostmanBoundMinisterSunnyPronunciation() {
                return conceitedPostmanBoundMinisterSunnyPronunciation;
            }

            public void setConceitedPostmanBoundMinisterSunnyPronunciation(double conceitedPostmanBoundMinisterSunnyPronunciation) {
                this.conceitedPostmanBoundMinisterSunnyPronunciation = conceitedPostmanBoundMinisterSunnyPronunciation;
            }

            public double getBothCockVillager() {
                return bothCockVillager;
            }

            public void setBothCockVillager(double bothCockVillager) {
                this.bothCockVillager = bothCockVillager;
            }

            public double getEachThemeSecondSalesman() {
                return eachThemeSecondSalesman;
            }

            public void setEachThemeSecondSalesman(double eachThemeSecondSalesman) {
                this.eachThemeSecondSalesman = eachThemeSecondSalesman;
            }

            public boolean isAvailable() {
                return isAvailable;
            }

            public void setAvailable(boolean available) {
                isAvailable = available;
            }

            public boolean isSelect() {
                return isSelect;
            }

            public void setSelect(boolean select) {
                isSelect = select;
            }

            public double getBasicSickness() {
                return basicSickness;
            }

            public void setBasicSickness(double basicSickness) {
                this.basicSickness = basicSickness;
            }
        }
    }
}
